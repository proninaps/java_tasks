package com.example.todolist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.todolist.models.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
}
