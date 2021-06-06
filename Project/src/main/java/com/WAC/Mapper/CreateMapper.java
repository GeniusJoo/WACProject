package com.WAC.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.WAC.Model.ColorDto;
import com.WAC.Model.LoginDto;
import com.WAC.Model.PostDto;

@Repository
@Mapper
public interface CreateMapper {
	PostDto getCreate(String id) throws Exception;
	void getCreateInfo(LoginDto create) throws Exception;
	void getPersonInfo(ColorDto color) throws Exception;
	void uploadFile(PostDto fileDto) throws Exception;
	List<PostDto> getCreateList() throws Exception;

}
