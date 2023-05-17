package com.parthu.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parthu.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {
    public User findByEmail(String email);
    public User findByEmailAndPwd(String email, String pwd);
    
}
