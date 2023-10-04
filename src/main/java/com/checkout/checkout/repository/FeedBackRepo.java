package com.checkout.checkout.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.checkout.checkout.entity.Feedback;
import com.checkout.checkout.entity.User;

public interface FeedBackRepo extends JpaRepository<Feedback, Long>{
	Feedback findByUser(User user);

}
