package com.repository;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.User;

public interface UserRepository extends JpaRepository<User, Id> {

}
