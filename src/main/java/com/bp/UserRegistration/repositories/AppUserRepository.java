package com.bp.UserRegistration.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bp.UserRegistration.models.AppUser;

public interface AppUserRepository extends JpaRepository<AppUser, Integer> {
	public AppUser findByEmail(String email);
}
