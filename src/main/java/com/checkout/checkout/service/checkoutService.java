package com.checkout.checkout.service;

import com.checkout.checkout.entity.Feedback;
import com.checkout.checkout.entity.User;
import com.checkout.checkout.repository.FeedBackRepo;

public interface checkoutService {
	
	String addUser(User user);
	
	String addfeedback(Feedback feedback);
	
	Feedback viewFeedback(Long userId);

}
