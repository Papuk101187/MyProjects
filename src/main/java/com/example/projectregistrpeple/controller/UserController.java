package com.example.projectregistrpeple.controller;
import com.example.projectregistrpeple.dto.ResponseUser;
import com.example.projectregistrpeple.dto.Status;
import com.example.projectregistrpeple.dto.StatusResponse;
import com.example.projectregistrpeple.service.userservice.UserServiceInterface;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.util.Map;

@Accessors
@Data
@RestController
public class UserController  {

    @Autowired
    UserServiceInterface userService;

    @Transactional
    @PostMapping("/registration") // API добавить пользователя

    public String registration(ResponseUser responseUser, Map<String, Object> model) {
        if (userService.findByUsers(responseUser.getLogin()).isEmpty()) {
            StatusResponse statusResponse = new StatusResponse(Status.OK,null);
            userService.AddUser(responseUser);
            return "modelstart";
        }
        model.put("message", "Такой пользователь уже есть ");
        return "main";
    }
}




