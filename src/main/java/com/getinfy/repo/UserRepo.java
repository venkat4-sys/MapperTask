package com.getinfy.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.getinfy.entity.UserEntity;

public interface UserRepo extends JpaRepository<UserEntity, Integer>{

}
