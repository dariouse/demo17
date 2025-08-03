package com.okestro.demo17.test.service;

import com.okestro.demo17.test.openstackif.Instance;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class TestService {
    private final Instance instance;

    public String Instance() {

        log.info("TestService Instance {}", Thread.currentThread());
        var result = instance.getInstance();

        return result;
    }

}
