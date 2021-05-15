package com.WAC.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.WAC.Mapper.CreateMapper;
import com.WAC.Model.LoginDto;

@Service
public class CreateServicempl implements CreateService {
	@Autowired
	private CreateMapper createMapper;
	
	@Override
	public void getCreateInfo(LoginDto create) throws Exception {
		createMapper.getCreateInfo(create);
	}
}
