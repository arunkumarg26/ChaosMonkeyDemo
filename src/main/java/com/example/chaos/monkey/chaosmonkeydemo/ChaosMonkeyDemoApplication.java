package com.example.chaos.monkey.chaosmonkeydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.alibaba.csp.sentinel.annotation.aspectj.SentinelResourceAspect;

@SpringBootApplication

public class ChaosMonkeyDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChaosMonkeyDemoApplication.class, args);
	}

	@Bean
	public SentinelResourceAspect sentinelResourceAspect() {
		return new SentinelResourceAspect();
	}

}
