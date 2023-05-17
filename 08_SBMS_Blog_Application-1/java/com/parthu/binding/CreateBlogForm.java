package com.parthu.binding;

import javax.persistence.Lob;

public class CreateBlogForm {

	@Lob
	private String title;
	
	@Lob
	private String description;
	
	@Lob
	private String content;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
