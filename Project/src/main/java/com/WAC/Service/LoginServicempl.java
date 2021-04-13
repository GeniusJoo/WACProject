package com.WAC.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.WAC.Mapper.LoginMapper;
import com.WAC.Model.LoginDto;

@Service
public class LoginServicempl implements LoginService {
	@Autowired
	private LoginMapper loginMapper;

	@Override
	public LoginDto getLoginInfo(LoginDto login) throws Exception {
		return loginMapper.getLoginInfo(login);
	}
	

}
