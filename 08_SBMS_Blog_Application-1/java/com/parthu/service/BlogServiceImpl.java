package com.parthu.service;

import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parthu.binding.CreateBlogForm;
import com.parthu.entity.Post;
import com.parthu.entity.User;
import com.parthu.repositories.PostRepo;
import com.parthu.repositories.UserRepo;

@Service
public class BlogServiceImpl implements BlogService {

	@Autowired
	private PostRepo postRepo;

	@Autowired
	private UserRepo userRepo;

	@Autowired
	private HttpSession session;

	@Override
	public boolean getCreateBlog(CreateBlogForm form) {
		Post entity = new Post();
		//copy binding form fields to entity class
		BeanUtils.copyProperties(form, entity);
		//setting user  class id to post class
		Integer  userId = (Integer)session.getAttribute("userId");
		Optional<User> findById = userRepo.findById(userId);
		User user=findById.get();
		entity.setUser(user);
		postRepo.save(entity);
		
		return true;
	}

	@Override
	public String getDashboard(Integer userId) {
		Optional<Post> findById = postRepo.findById(userId);
		if (findById.isPresent()) {
			return "sucsess";
		}
		return "data not found";
	}

}
