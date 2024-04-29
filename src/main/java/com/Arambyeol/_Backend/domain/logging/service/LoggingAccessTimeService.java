package com.Arambyeol._Backend.domain.logging.service;

import org.springframework.stereotype.Service;


import java.time.LocalDateTime;

import com.Arambyeol._Backend.domain.logging.dto.request.AccessTimeRequest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class LoggingAccessTimeService {
    public void writeAccessLogToFile(AccessTimeRequest accessInfo){
        LocalDateTime accessTime = accessInfo.accessTime();
        String platform = accessInfo.platformType().getToString();
        log.info("MENU AccessDay : {}  AccessTime : {} PlatformType : {}", accessTime.getDayOfWeek(),accessTime.toLocalTime(),platform );
    }

}
