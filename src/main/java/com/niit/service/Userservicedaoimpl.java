package com.niit.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.niit.dao.Userdao;
import com.niit.models.userdetails;

@Service
public class Userservicedaoimpl implements Userservicedao{
@Autowired	
Userdao userdao;
public void save(userdetails user)
{
	user.setEnabled("1");
	user.setRole_name("Role_user");
	userdao.save(user);
}
public void delete(userdetails user)
{
	userdao.delete(user);
}
public void getuname(HttpSession session)
{
	String username = SecurityContextHolder.getContext().getAuthentication().getName(); 
	userdetails user=userdao.getuname(username);
	session.setAttribute("id",user.getId());
	session.setAttribute("name", user.getName());
	System.out.println(user);
	
}
public void LoginSuccess(HttpSession session) 
{
	String username = SecurityContextHolder.getContext().getAuthentication().getName(); /*Get Logged in Username*/
	userdetails user=userdao.getuname(username);												/*Get user object based on username*/
	
	/*saving session attributes*/
	session.setAttribute("id",user.getId());
	session.setAttribute("name", user.getName());
	System.out.println(user.getId());
}
}
	
	




	



