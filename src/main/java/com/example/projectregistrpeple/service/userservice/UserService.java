package com.example.projectregistrpeple.service.userservice;

import com.example.projectregistrpeple.domain.users.Role;
import com.example.projectregistrpeple.domain.users.Users;
import com.example.projectregistrpeple.dto.ResponseUser;
import com.example.projectregistrpeple.repository.userrepository.MainUserRepositoryInterfaceJPA;
import com.example.projectregistrpeple.repository.userrepository.RepositoryInterface;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
@Accessors(chain = true)
public class UserService implements UserServiceInterface {

    @Autowired
    RepositoryInterface repositoryInterface;

    @Autowired
    MainUserRepositoryInterfaceJPA repositoryInterfaceJPA;


    @Override
    public void AddUser(ResponseUser responseUser) {

        Role role = new Role();
        role.setName("USR");

        Users users = new Users()
                .setLogin(responseUser.getLogin())
                .setPassword(responseUser.getPassword())
                .setType(responseUser.getType())
                .setRole(role);

        repositoryInterface.addUser(users);

    }

    public Optional<Users> findByUsers(ResponseUser users){
        return repositoryInterfaceJPA.findByLogin(users.getLogin());

    }


}
