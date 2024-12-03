package com.example.LN09_Backend.payload;

import lombok.Data;

@Data
public class LoginResponse {
    private String accessToken;
    private String tokenType = "Bearer";
    public LoginResponse(String accessToken) {
        this.accessToken = accessToken;
    }
}