package com.example.webservices.restfulwebservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.webservices.restfulwebservices.bean.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer>{

}