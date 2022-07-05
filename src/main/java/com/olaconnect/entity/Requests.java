package com.olaconnect.entity;

import java.util.UUID;

public class Requests {
	private UUID senderid;
	private UUID receiverid;
	public Requests(UUID senderid, UUID receiverid) {
		super();
		this.senderid = senderid;
		this.receiverid = receiverid;
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
	
}
