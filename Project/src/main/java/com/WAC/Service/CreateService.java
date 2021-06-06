package com.WAC.Service;

import java.util.List;

import com.WAC.Model.C_post;
import com.WAC.Model.ColorDto;
import com.WAC.Model.LoginDto;
import com.WAC.Model.PostDto;

public interface CreateService {
	PostDto getCreate(String id) throws Exception;
	void getCreateInfo(LoginDto create) throws Exception;
	void getPersonInfo(ColorDto color) throws Exception;
	void uploadFile(PostDto fileDto) throws Exception;
	List<PostDto> getCreateList() throws Exception;
	List<C_post> getCreateListC() throws Exception;
	void uploadFileC(C_post fileDto) throws Exception;
	C_post getCreateC(String id) throws Exception;

	
}
