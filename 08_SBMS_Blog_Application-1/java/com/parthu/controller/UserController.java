package com.parthu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.parthu.binding.CreateBlogForm;
import com.parthu.binding.LoginForm;
import com.parthu.binding.RegistrationForm;
import com.parthu.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService service;
	
	@GetMapping("/")
	public String getRegistrationPage(Model model) {
		RegistrationForm c=new RegistrationForm();
		model.addAttribute("page",c );
		return "register";
	}
	
	@PostMapping("/register")
	public String getRegistratio(@ModelAttribute("page")
	                                        RegistrationForm form, 
	                                        Model model){
		boolean status = service.getRegistration(form);
		
		if(status) {
			model.addAttribute("sMsg","Registration Completed");
		}
		else {
			model.addAttribute("eMsg","Problem Occured");
		}
		return "register";
	}
	
	@GetMapping("/login")
	public String getLoginPage(Model model) {
		model.addAttribute("page",new LoginForm());
		return "login";
	}
	
	@PostMapping("/login")
	public String getLogin(@ModelAttribute("page") LoginForm form, Model model) {
		String status = service.getLogin(form);
		if (status.contains("success")) {
			return "redirect:/dashboard";
		}
		model.addAttribute("eMsg","Invalid Credentials");
		return "login";
	}


}
