package com.WAC.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.WAC.Mapper.CreateMapper;
import com.WAC.Model.ColorDto;
import com.WAC.Model.LoginDto;
import com.WAC.Model.PostDto;

@Service
public class CreateServicempl implements CreateService {
	@Autowired
	private CreateMapper createMapper;
	
	@Override
	public void getCreateInfo(LoginDto create) throws Exception {
		createMapper.getCreateInfo(create);
	}
	
	@Override
	public void getPersonInfo(ColorDto color) throws Exception {
		createMapper.getPersonInfo(color);
	}

	@Override
	public void uploadFile(PostDto fileDto) throws Exception {
		// TODO Auto-generated method stub
		createMapper.uploadFile(fileDto);
	}
}
