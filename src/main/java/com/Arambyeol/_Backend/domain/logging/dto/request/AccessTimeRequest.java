package com.Arambyeol._Backend.domain.logging.dto.request;

import java.time.LocalDateTime;

import com.Arambyeol._Backend.domain.logging.enums.PlatformType;

public record AccessTimeRequest(LocalDateTime accessTime, PlatformType platformType) {
}
