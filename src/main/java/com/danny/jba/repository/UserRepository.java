package com.danny.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danny.jba.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer>{

    User findByName(String name);
}
