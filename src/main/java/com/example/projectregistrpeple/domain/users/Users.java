package com.example.projectregistrpeple.domain.users;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.*;


@Accessors(chain = true)
@Data
@Entity
@Table(name= "users")
public class Users  {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_users")
    private Long id;

    @Column(name = "user_login")
    public String login;

    @Column(name = "user_password")
    public String password;

    @Column(name = "user_type")
    public String type;

    @ManyToOne
    @JoinColumn(name = "id_roles")
    private Role role;




}
