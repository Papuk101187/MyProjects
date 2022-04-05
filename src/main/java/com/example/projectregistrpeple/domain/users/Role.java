package com.example.projectregistrpeple.domain.users;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "roles")
public class Role {


    @Id
    @Column(name = "id_roles")
    private String id;

    @Column(name = "roles_name")
    private String name;



}
