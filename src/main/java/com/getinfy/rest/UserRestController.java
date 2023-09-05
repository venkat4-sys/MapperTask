package com.getinfy.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.getinfy.binding.UserBinding;
import com.getinfy.entity.UserEntity;
import com.getinfy.service.Mapper;

@RestController
public class UserRestController {

	@Autowired
	private Mapper mapperService;

	@PostMapping("/saveUser")
	private ResponseEntity<String> saveUser(@RequestBody UserBinding binding) {

		boolean saveUser = mapperService.SaveUser(binding);

		if (saveUser) {

			return new ResponseEntity<String>("Data saved successfully", HttpStatus.CREATED);

		}
		return new ResponseEntity<String>("Data not saved", HttpStatus.BAD_REQUEST);

	}

	@GetMapping("/getUser")
	private ResponseEntity<UserEntity> getentity(@RequestBody UserBinding binding) {

		UserEntity userEntity = mapperService.toUserEntity(binding);

		return new ResponseEntity<UserEntity>(userEntity, HttpStatus.OK);
	}

	@GetMapping("/getBinding")
	private ResponseEntity<UserBinding> getBinding(@RequestBody UserEntity entity) {

		UserBinding userBinding = mapperService.toUserBinding(entity);

		return new ResponseEntity<UserBinding>(userBinding, HttpStatus.OK);

	}

}