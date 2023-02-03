package com.dev.jwt.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.jwt.user.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
    Optional<User> findByEmail(String email);
}
