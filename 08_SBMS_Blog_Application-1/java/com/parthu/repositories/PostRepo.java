package com.parthu.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parthu.entity.Post;

public interface PostRepo extends JpaRepository<Post, Integer> {

}
