package com.atlacademy.jwtdemoapp.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "users")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String name;
    private String email;
    @Column(nullable = true)
    private int isActive;
    @ManyToMany
    @JoinTable(name = "user_role")
    private Set<Role> roles;


}
