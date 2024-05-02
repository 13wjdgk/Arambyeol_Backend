package com.Arambyeol._Backend.domain.logging.controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Arambyeol._Backend.domain.logging.dto.request.AccessTimeRequest;
import com.Arambyeol._Backend.domain.logging.service.LoggingAccessTimeService;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@RestController
public class LoggingController {
	private final LoggingAccessTimeService loggingAccessTimeService;

	@PostMapping("/loggingAccessTime")
	public void loggingAccessTime(@RequestBody AccessTimeRequest accessTimeRequest){
		loggingAccessTimeService.writeAccessLogToFile(accessTimeRequest);
	}
	@GetMapping("/")
	public void LoadBalancerHealthCheck(){
	}

}
