package com.parthu.service;

import com.parthu.binding.CreateBlogForm;

public interface BlogService {
public boolean getCreateBlog(CreateBlogForm form);
	
	public String getDashboard(Integer userId);
}
