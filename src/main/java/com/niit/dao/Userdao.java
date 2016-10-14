package com.niit.dao;

import javax.servlet.http.HttpSession;

import com.niit.models.userdetails;

public interface Userdao {
	public void save(userdetails user);
    public void delete(userdetails user);
    public userdetails getuname(String username);
   
}
