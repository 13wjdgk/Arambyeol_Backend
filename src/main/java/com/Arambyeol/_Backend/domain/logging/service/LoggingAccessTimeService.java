package com.Arambyeol._Backend.domain.logging.service;

import org.springframework.stereotype.Service;


import java.time.LocalDateTime;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class LoggingAccessTimeService {
    public void writeAccessLogToFile(LocalDateTime accessInfo){
        log.info("MENU AccessDay : {}  AccessTime : {} ", accessInfo.getDayOfWeek(),accessInfo.toLocalTime());
    }
}
