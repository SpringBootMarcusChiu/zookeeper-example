package com.marcuschiu.zookeeperexampleproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient // This will make the ZookeeperExampleProducerApplication discovery-aware
@SpringBootApplication
@RestController
public class ZookeeperExampleProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZookeeperExampleProducerApplication.class, args);
	}

	Integer count = 0;

	@GetMapping("/")
	public String test() {
		count++;
		System.out.println("test() function invoked " + count + " times");
		return "producer.count = " + count;
	}
}

