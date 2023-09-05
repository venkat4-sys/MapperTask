package com.getinfy.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.getinfy.binding.UserBinding;
import com.getinfy.entity.UserEntity;
import com.getinfy.repo.UserRepo;
import com.getinfy.service.Mapper;

@Service
public class MapperServiceImpl implements Mapper {

	@Autowired
	private UserRepo repo;

	@Override
	public boolean SaveUser(UserBinding binding) {

		UserEntity e = new UserEntity();
		e.setId(binding.getId());
		e.setEmail(binding.getEmail());
		e.setUserName(binding.getUserName());

		repo.save(e);
		return true;
	}

	@Override
	public UserBinding toUserBinding(UserEntity entity) {
		UserBinding bind = new UserBinding();
		bind.setId(entity.getId());
		bind.setEmail(entity.getEmail());
		bind.setUserName(entity.getUserName());

		return bind;
	}

	@Override
	public UserEntity toUserEntity(UserBinding binding) {
		UserEntity e = new UserEntity();
		e.setId(binding.getId());
		e.setEmail(binding.getEmail());
		e.setUserName(binding.getUserName());
		return e;
	}

}
