package com.example.projectregistrpeple.repository.userrepository;

import com.example.projectregistrpeple.domain.users.Users;
import com.example.projectregistrpeple.dto.ResponseUser;

import java.util.Optional;

public interface RepositoryInterface extends MainUserRepositoryInterface<Users ,String>  {

    void addUser(Users users);



}
