package com.WAC.Mapper;

import com.WAC.Model.LoginDto;

public interface LoginMapper {
	LoginDto getLoginInfo(LoginDto login) throws Exception;

}
