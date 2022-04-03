package com.example.projectregistrpeple.dto;


import lombok.Data;


import lombok.experimental.Accessors;

import java.util.Date;

@Accessors
@Data
public class ResponseUser {

    String login;
    String password;
    String type;
    

}
