package com.example.projectregistrpeple.service.userservice;


import com.example.projectregistrpeple.domain.users.Users;
import com.example.projectregistrpeple.dto.ResponseUser;

import java.util.Optional;

public interface UserServiceInterface {



    void AddUser(ResponseUser responseUser);
    Optional<Users> findByUsers(String users);




}
