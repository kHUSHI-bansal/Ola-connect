package com.olaconnect.entity;

import java.util.UUID;

public class Followers {
	private UUID id;
	private UUID Followerid;
	public Followers(UUID id, UUID followerid) {
		super();
		this.id = id;
		Followerid = followerid;
	}
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public UUID getFollowerid() {
		return Followerid;
	}
	public void setFollowerid(UUID followerid) {
		this.Followerid = followerid;
	}
	
}
