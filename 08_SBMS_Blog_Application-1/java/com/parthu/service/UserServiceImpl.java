package com.parthu.service;


import javax.servlet.http.HttpSession;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parthu.binding.LoginForm;
import com.parthu.binding.RegistrationForm;
import com.parthu.entity.User;
import com.parthu.repositories.PostRepo;
import com.parthu.repositories.UserRepo;
import com.parthu.utils.EmailUtil;
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private EmailUtil emailUtil;

	@Autowired
	private PostRepo postRepo;
	
	@Autowired
	private HttpSession session;
	@Override
	public boolean getRegistration(RegistrationForm form) {
		User user = userRepo.findByEmail(form.getEmail());

		if (user != null) {
			return false;
		}

		// copy data from binding obj to entity obj
		User entity = new User();
		BeanUtils.copyProperties(form, entity);

		// insert record
		userRepo.save(entity);

		// send mail to unlock the account
		String to = form.getEmail();
		String subject = "Blog Application";
		StringBuffer body = new StringBuffer();
		body.append("<h1>You are successfully loged in Blog Application</h1> ");
		emailUtil.sendEmail(to, subject, body.toString());

		return true;
	}

	@Override
	public String getLogin(LoginForm form) {
		User entity = userRepo.findByEmailAndPwd(form.getEmail() , form.getPwd());

		if (entity == null) {
			return "Invalid Credentials";
		}
		session.setAttribute("email", entity.getEmail());

		return "success";
	}

	

}
