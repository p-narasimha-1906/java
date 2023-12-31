package com.parthu.repo;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.parthu.entity.CommentEntity;
import com.parthu.entity.PostEntity;

public interface CommentRepo extends CrudRepository<CommentEntity, Serializable> {

	List<CommentEntity> findByPostAndDeletedIsFalse(PostEntity post);

	List<CommentEntity> findByPostInAndDeletedIsFalse(List<PostEntity> postId);

}
