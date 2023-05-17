package com.parthu.repo;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.parthu.entity.UserEntity;

public interface UserRepo extends CrudRepository<UserEntity, Serializable> {

	public Optional<UserEntity> findByEmailAndPwd(String email, String pwd);
	
	public Optional<UserEntity> findByEmail(String email);
}
