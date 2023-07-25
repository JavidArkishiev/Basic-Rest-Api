package com.example.spacesx.exception;

public class PlayerNotFound extends RuntimeException {
    public PlayerNotFound(String message) {
        super(message);
    }
}
