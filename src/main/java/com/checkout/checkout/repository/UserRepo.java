package com.checkout.checkout.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.checkout.checkout.entity.User;

public interface UserRepo extends JpaRepository<User, Long> {
 User findByUserId(Long userId);
}
