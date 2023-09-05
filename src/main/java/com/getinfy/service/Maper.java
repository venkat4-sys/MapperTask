package com.getinfy.service;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.getinfy.binding.UserBinding;
import com.getinfy.entity.UserEntity;

@Mapper
public interface Maper {

	public boolean SaveUser(UserBinding binding);
	
	
	 
	@Mapping(source = "id", target = "id")
	@Mapping(source = "userName", target = "userName")
	@Mapping(source = "email", target = "email")   
	public UserBinding toUserBinding(UserEntity entity);
	
	
	@Mapping(source = "id", target = "id")
	@Mapping(source = "userName", target = "userName")
	@Mapping(source = "email", target = "email")   
	public UserEntity toUserEntity(UserBinding binding);

}
