package com.okestro.demo17.test.controller;

import com.okestro.demo17.test.service.TestService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @GetMapping("/test")
    public String test() throws Exception {

        log.info("Request {}", Thread.currentThread());
        var result = testService.Instance();
        log.info("Response {}", Thread.currentThread());

        return "OK";
    }
}
