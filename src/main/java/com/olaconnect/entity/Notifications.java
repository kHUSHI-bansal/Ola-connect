package com.olaconnect.entity;

import java.util.UUID;

public class Notifications {
	private UUID postid;
	private UUID senderid;
	private UUID receiverid;
	private String notification;
	public Notifications(UUID postid, UUID senderid, UUID receiverid, String notification) {
		super();
		this.postid = postid;
		this.senderid = senderid;
		this.receiverid = receiverid;
		this.notification = notification;
	}
	public UUID getPostid() {
		return postid;
	}
	public void setPostid(UUID postid) {
		this.postid = postid;
	}
	public UUID getSenderid() {
		return senderid;
	}
	public void setSenderid(UUID senderid) {
		this.senderid = senderid;
	}
	public UUID getReceiverid() {
		return receiverid;
	}
	public void setReceiverid(UUID receiverid) {
		this.receiverid = receiverid;
	}
	public String getNotification() {
		return notification;
	}
	public void setNotification(String notification) {
		this.notification = notification;
	}
	
}
