package com.getinfy.service;

import com.getinfy.binding.UserBinding;
import com.getinfy.entity.UserEntity;

public interface Mapper {
	
	public boolean SaveUser(UserBinding binding);
	
	public UserBinding toUserBinding(UserEntity entity);
	
	public UserEntity toUserEntity(UserBinding binding);

}
