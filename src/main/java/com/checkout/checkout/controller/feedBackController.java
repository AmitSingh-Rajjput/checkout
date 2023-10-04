package com.checkout.checkout.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.checkout.checkout.entity.Feedback;
import com.checkout.checkout.entity.User;
import com.checkout.checkout.service.checkoutService;


@RestController
public class feedBackController {
	
	@Autowired
	private checkoutService checkOutService;
	
	@PostMapping("/addUser")
	public ResponseEntity<String> createUser(@RequestBody User user){
		String savedapp = checkOutService.addUser(user);
		return new ResponseEntity<>(savedapp,HttpStatus.CREATED);
	}
	
	@PostMapping("/addFeedback")
	public ResponseEntity<String> createFeedback(@RequestBody Feedback feed){
		String savedapp = checkOutService.addfeedback(feed);
		return new ResponseEntity<>(savedapp,HttpStatus.CREATED);
	}
	
	@GetMapping("/viewFeedback/{userId}")
	public ResponseEntity<Feedback> view(@PathVariable("userId") Long userId){
		Feedback savedapp = checkOutService.viewFeedback(userId);
		return new ResponseEntity<>(savedapp,HttpStatus.OK);
	}

}
