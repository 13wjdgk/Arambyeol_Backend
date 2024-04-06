package com.Arambyeol._Backend.domain.logging;

import org.springframework.stereotype.Service;


import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Service
public class LoggingAccessTimeService {

    public void doApplicationLogic(){
        Map<String, Object> data = new HashMap<String, Object>();
        LocalDateTime time = LocalDateTime.now();
        data.put("accessTime",time);

    }
}
