package com.example.projectregistrpeple.repository.userrepository;

import com.example.projectregistrpeple.domain.users.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MainUserRepositoryInterfaceJPA extends JpaRepository<Users,String> {



    Optional<Users> findByLogin(String login);




}
