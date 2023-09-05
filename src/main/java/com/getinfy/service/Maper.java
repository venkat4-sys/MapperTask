package com.getinfy.service;

import org.mapstruct.Mapper;

import com.getinfy.binding.UserBinding;
import com.getinfy.entity.UserEntity;

@Mapper
public interface Maper {

	public boolean SaveUser(UserBinding binding);

	public UserBinding toUserBinding(UserEntity entity);

	public UserEntity toUserEntity(UserBinding binding);

	public UserEntity getUser(Integer id);

}
