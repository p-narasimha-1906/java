package com.parthu.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.parthu.binding.CreateBlogForm;
import com.parthu.entity.Post;
import com.parthu.service.BlogService;

@Controller
public class BlogController {
	@Autowired
	private BlogService service;
	
	@Autowired
	public HttpSession session;

	@GetMapping("/dashboard")
	public String getDashboard(Model model) {
		Integer posts=(Integer)session.getAttribute("userId");
		String dashboard = service.getDashboard(posts);
		model.addAttribute("posts", dashboard);
		return "dashBoard";
	}
	
	@GetMapping("/post")//to  load form 
	public String loadPostForm(Model model) {
		model.addAttribute("page", new CreateBlogForm());
		return "blog";
	}

	@PostMapping("/post") // to insert data
	public String getPostFormData(@ModelAttribute("page") CreateBlogForm postformdata, Model model) {
		System.out.println(postformdata);

		boolean status = service.getCreateBlog(postformdata);
		if (status) {
			model.addAttribute("sucMsg", "Account Created Successfully");
		} else {
			model.addAttribute("errMsg", "Problem Occured");
		}
		return "blog";
	}

}
