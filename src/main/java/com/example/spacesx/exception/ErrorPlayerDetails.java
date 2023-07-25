package com.example.spacesx.exception;

import java.time.LocalDateTime;


public record ErrorPlayerDetails(LocalDateTime now, String message, String description) {
    static String details;
    static String message1;
    static LocalDateTime timeimeStamp;


}
