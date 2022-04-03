package com.example.projectregistrpeple.controller;
import com.example.projectregistrpeple.dto.ResponseUser;
import com.example.projectregistrpeple.service.userservice.UserServiceInterface;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import javax.transaction.Transactional;
import java.util.Map;

@Accessors
@Data
@Controller
@RequiredArgsConstructor
public class UserController  {

    @Autowired
    UserServiceInterface userService;

    @Transactional
    @PostMapping("/registration") // API добавить пользователя
    public String registration(ResponseUser responseUser, Map<String, Object> model) {
        if (userService.findByUsers(responseUser).isEmpty()) {
            userService.AddUser(responseUser);
            return "modelstart";
        }
        model.put("message", "Такой пользователь уже есть ");
        return "main";
    }
}




