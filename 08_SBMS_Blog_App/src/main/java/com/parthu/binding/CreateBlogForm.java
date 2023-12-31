package com.parthu.binding;


public class CreateBlogForm {

	private String title;
	
	private String description;
	
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

	@Override
	public String toString() {
		return "CreateBlogForm [title=" + title + ", description=" + description + ", content=" + content + "]";
	}

	
}
