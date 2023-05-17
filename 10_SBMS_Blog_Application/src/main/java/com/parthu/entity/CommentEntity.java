package com.parthu.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "TBL_COMMENT")
public class CommentEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer comment_id;

	private String name;
	private String email;
	@Lob
	private String content;

	@CreationTimestamp
	private LocalDate createdOn;


	@ManyToOne
	@JoinColumn(name = "postId")
	PostEntity post;


	public Integer getComment_id() {
		return comment_id;
	}


	public void setComment_id(Integer comment_id) {
		this.comment_id = comment_id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}


	public LocalDate getCreatedOn() {
		return createdOn;
	}


	public void setCreatedOn(LocalDate createdOn) {
		this.createdOn = createdOn;
	}


	public PostEntity getPost() {
		return post;
	}


	public void setPost(PostEntity post) {
		this.post = post;
	}
	
	
}

