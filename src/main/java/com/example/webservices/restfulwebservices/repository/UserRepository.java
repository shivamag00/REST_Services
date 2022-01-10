package com.example.webservices.restfulwebservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.webservices.restfulwebservices.bean.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}