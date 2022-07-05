package com.olaconnect.entity;

import java.util.UUID;

public class Comments {
	private UUID postid;
	private UUID id;
	private String comments;
	public Comments(UUID postid, UUID id, String comments) {
		super();
		this.postid = postid;
		this.id = id;
		this.comments = comments;
	}
	public UUID getPostid() {
		return postid;
	}
	public void setPostid(UUID postid) {
		this.postid = postid;
	}
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	
}
