package com.WAC.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class LoginDto {

	private String id;
	private String password;
	private String name;
	private String email;
	private String nickname;
	private String sex;
	private int year;
	private int month;
	private int day;
}