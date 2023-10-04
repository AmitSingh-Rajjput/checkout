package com.checkout.checkout.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.checkout.checkout.entity.Feedback;
import com.checkout.checkout.entity.User;
import com.checkout.checkout.repository.FeedBackRepo;
import com.checkout.checkout.repository.UserRepo;
import com.checkout.checkout.service.checkoutService;

@Service
public class CheckoutServiceImpl implements checkoutService {
	
	@Autowired
	private FeedBackRepo feedbackRepo;
	
	@Autowired
	private UserRepo userRepo;

	@Override
	public String addUser(User user) {
		User savedUser = userRepo.save(user);
		return "User saved";
	}

	@Override
	public String addfeedback(Feedback feedback) {
		Feedback newFeeedback = feedbackRepo.save(feedback);
		return "Feedback saved !!";
	}

	@Override
	public Feedback viewFeedback(Long userId) {
		User findUser = userRepo.findByUserId(userId);
		Feedback findFeedback = feedbackRepo.findByUser(findUser);
		return findFeedback;
	}
	
	


}
