package com.WAC.Service;

import com.WAC.Model.ColorDto;
import com.WAC.Model.LoginDto;
import com.WAC.Model.PostDto;

public interface CreateService {
	PostDto getCreate(String id) throws Exception;
	void getCreateInfo(LoginDto create) throws Exception;
	void getPersonInfo(ColorDto color) throws Exception;
	void uploadFile(PostDto fileDto) throws Exception;
}
