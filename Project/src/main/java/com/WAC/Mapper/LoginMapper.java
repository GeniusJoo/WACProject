package com.WAC.Mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.WAC.Model.LoginDto;

@Repository
@Mapper
public interface LoginMapper {
	LoginDto getLoginInfo(LoginDto login) throws Exception;

}
