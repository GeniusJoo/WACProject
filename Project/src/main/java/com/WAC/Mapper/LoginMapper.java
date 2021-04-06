package com.WAC.Mapper;

import org.springframework.stereotype.Repository;

import com.WAC.Model.LoginDto;

@Repository

public interface LoginMapper {
	LoginDto getLoginInfo(LoginDto login) throws Exception;
	
}
