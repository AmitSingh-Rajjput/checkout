package com.checkout.checkout.entity;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;



import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Feedback {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long feedId;
	
	private String userFeed;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "user_id", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private User user;

	public Long getFeedId() {
		return feedId;
	}

	public void setFeedId(Long feedId) {
		this.feedId = feedId;
	}

	public String getUserFeed() {
		return userFeed;
	}

	public void setUserFeed(String userFeed) {
		this.userFeed = userFeed;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Feedback(Long feedId, String userFeed, User user) {
		super();
		this.feedId = feedId;
		this.userFeed = userFeed;
		this.user = user;
	}

	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
