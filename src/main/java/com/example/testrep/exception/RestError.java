package com.example.testrep.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class RestError {
    private int status;
    private String message;


}
