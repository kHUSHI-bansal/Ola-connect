package com.olaconnect.entity;

import java.util.Date;
import java.util.UUID;

import org.springframework.data.annotation.Id;

public class Posts {
	@Id
	private UUID postid;
	private UUID id;
	private Date date;
	private String caption;
	private int likes;
	public Posts(UUID postid, UUID id, Date date, String caption, int likes) {
		super();
		this.postid = postid;
		this.id = id;
		this.date = date;
		this.caption = caption;
		this.likes = likes;
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
}
