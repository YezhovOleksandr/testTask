package com.example.testtaskapi.payload.response;

import lombok.Data;

import java.util.List;
@Data
public class JwtResponse {
    private String token;
    private String type = "Bearer";


    public JwtResponse(String token) {
        this.token = token;
    }
}
