package com.WAC.Service;

import javax.servlet.http.HttpSession;

import com.WAC.Model.LoginDto;

public interface LoginService {
	LoginDto getLoginInfo(LoginDto login) throws Exception;
	void getUpdateInfo(LoginDto vo) throws Exception;
	LoginDto Info(LoginDto id) throws Exception;
	LoginDto Myinfoedit(LoginDto vo) throws Exception;
}
