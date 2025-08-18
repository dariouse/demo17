package com.okestro.demo17.test.controller;

import com.okestro.demo17.test.service.TestService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.locks.ReentrantLock;

@Slf4j
@RestController
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;
    private final ReentrantLock lock = new ReentrantLock();
    private int totalRequests = 0;

    private int incAndGetInFlight() {

        lock.lock();
        try {
            totalRequests++;
            return totalRequests;
        } finally {
            lock.unlock();
        }
    }

    @GetMapping("/test")
    public String test() {

        int now = incAndGetInFlight();

        log.info("Request {} {}", Thread.currentThread(), now);
        var result = testService.Instance();

        return "OK";
    }
}
