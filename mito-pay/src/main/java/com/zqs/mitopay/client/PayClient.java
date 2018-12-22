package com.zqs.mitopay.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "svcb-service", fallback = PayClient.PayClientFallback.class)
public interface PayClient {

    @GetMapping(value = "/")
    String hello();

    @Component
    class PayClientFallback implements PayClient {

        private static final Logger LOGGER = LoggerFactory.getLogger(PayClientFallback.class);

        @Override
        public String hello() {
            LOGGER.info("异常发生，进入fallback方法");
            return "SERVICE B FAILED! - FALLING BACK";
        }
    }
}