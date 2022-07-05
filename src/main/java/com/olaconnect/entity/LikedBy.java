package com.olaconnect.entity;

import java.util.UUID;


public class LikedBy {
	private UUID postid;
	private UUID id;
	public LikedBy(UUID postid, UUID id) {
		super();
		this.postid = postid;
		this.id = id;
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
	
}
