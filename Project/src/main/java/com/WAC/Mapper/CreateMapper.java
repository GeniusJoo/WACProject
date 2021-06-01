package com.WAC.Mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.WAC.Model.ColorDto;
import com.WAC.Model.LoginDto;

@Repository
@Mapper
public interface CreateMapper {
	void getCreateInfo(LoginDto create) throws Exception;
	void getPersonInfo(ColorDto color) throws Exception;

}
