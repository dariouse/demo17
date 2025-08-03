package com.okestro.demo17.test.openstackif;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "default", url = "http://localhost:8082")
public interface Instance {

    @GetMapping("/openstack/instance")
    String getInstance();
}
