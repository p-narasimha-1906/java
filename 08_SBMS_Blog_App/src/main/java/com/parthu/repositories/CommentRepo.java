package com.parthu.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parthu.entity.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer> {

}
