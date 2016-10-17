package com.niit.service;

import javax.servlet.http.HttpSession;

import com.niit.models.Forumcomment;

public interface Forumcdao {
	
	public void createforum(Forumcomment comment,HttpSession session);
	public String getforum(int fid);
	


}
