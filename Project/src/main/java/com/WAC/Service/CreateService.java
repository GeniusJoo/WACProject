package com.WAC.Service;

import com.WAC.Model.ColorDto;
import com.WAC.Model.LoginDto;

public interface CreateService {
	void getCreateInfo(LoginDto create) throws Exception;
	void getPersonInfo(ColorDto color) throws Exception;
}
