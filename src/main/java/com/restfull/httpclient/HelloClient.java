package com.restfull.httpclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "hello", url = "localhost:8090")
@Component
public interface HelloClient {
	@GetMapping("/api/hello")
	String Hello();
}
