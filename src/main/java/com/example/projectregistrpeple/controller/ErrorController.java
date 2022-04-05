package com.example.projectregistrpeple.controller;


import com.example.projectregistrpeple.dto.Status;
import com.example.projectregistrpeple.dto.StatusResponse;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ErrorController {



    @ExceptionHandler(Exception.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public StatusResponse Error (Exception exception){
        return new StatusResponse(Status.FAIL,exception.getMessage());
    }

}
