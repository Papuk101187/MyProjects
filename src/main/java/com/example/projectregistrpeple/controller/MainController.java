package com.example.projectregistrpeple.controller;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.Map;


@Accessors
@Data
@Controller
@RequiredArgsConstructor
public class MainController {


    @GetMapping("")
    public String startMenu() {
        return "modelstart";
    }

    @GetMapping("/main")
    public String registraction(Map<String, Object> model ) {
        model.put("message", " ");
        return "main";
    }
















}
