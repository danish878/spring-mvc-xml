package com.danny.jba.entity;

import com.danny.jba.annotation.UniqueUsername;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("JpaDataSourceORMInspection")

@Setter
@Getter
@NoArgsConstructor

@Entity
@Table(name = "app_user")
public class User {

    @Id
    @GeneratedValue
    private Integer id;

    @Size(min = 3, message = "Name must be at least 3 characters!")
    @Column(unique = true)
    @UniqueUsername(message = "Username already exists!")
    private String name;

    @Size(min = 1, message = "Invalid email address")
    @Email(message = "Invalid email address")
    private String email;

    @Size(min = 5, message = "Password must be at least 5 characters!")
    private String password;

    private boolean enabled;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable
    private List<Role> roles = new ArrayList<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Blog> blogs = new ArrayList<>();
}
