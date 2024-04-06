package com.Arambyeol._Backend.domain.logging.controller;

import java.util.logging.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Arambyeol._Backend.domain.logging.dto.request.AccessTimeRequest;

@RestController
public class LoggingController {
	@PostMapping("/loggingAccessTime")
	public void loggingAccessTime(@RequestBody AccessTimeRequest accessTimeRequest){

	}

	@GetMapping("/test")
	public String loggingAccessTime(){
		return "hi";
	}
}
