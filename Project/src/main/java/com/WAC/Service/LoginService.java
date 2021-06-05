package com.WAC.Service;

import com.WAC.Model.LoginDto;

public interface LoginService {
	LoginDto getLoginInfo(LoginDto login) throws Exception;
	void getUpdateInfo(LoginDto vo) throws Exception;
}
