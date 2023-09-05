package com.getinfy.serviceimpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.getinfy.binding.UserBinding;
import com.getinfy.entity.UserEntity;
import com.getinfy.repo.UserRepo;
import com.getinfy.service.Maper;

@Service
public class MapperServiceImpl implements Maper {

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private UserRepo repo;

	@Override
	public boolean SaveUser(UserBinding binding) {

		UserEntity entity = new UserEntity();

		BeanUtils.copyProperties(binding, entity);

		repo.save(entity);

		return true;
	}

	@Override
	public UserBinding toUserBinding(UserEntity entity) {
		UserBinding binding = new UserBinding();
		modelMapper.map(entity, binding);
        return binding;
	}

	@Override
	public UserEntity toUserEntity(UserBinding binding) {
		UserEntity entity=new UserEntity();
		
		modelMapper.map(binding, entity);
		
		return entity;

	}

}
