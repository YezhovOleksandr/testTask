package com.example.testtaskapi.payload.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class MessageResponse {
    private Boolean success;
    private String message;
}
