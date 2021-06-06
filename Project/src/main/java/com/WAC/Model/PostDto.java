package com.WAC.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class PostDto {
	
	private String w_post;
	
	private String id;
	private String post;
	private String wdate;
	private String origin_name;
	private String file_name;
	
	public String getW_post() {
		return w_post;
	}
	public void setW_post(String w_post) {
		this.w_post = w_post;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getWdate() {
		return wdate;
	}
	public void setWdate(String wdate) {
		this.wdate = wdate;
	}
	public String getOrigin_name() {
		return origin_name;
	}
	public void setOrigin_name(String origin_name) {
		this.origin_name = origin_name;
	}
	public String getFile_name() {
		return file_name;
	}
	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}

}
