package com.niit.service;

import javax.servlet.http.HttpSession;

import org.springframework.security.core.userdetails.User;

import com.niit.models.userdetails;

public interface Userservicedao {

public void delete(userdetails user);
public void getuname(HttpSession session);
public void LoginSuccess(HttpSession session);

public void save(userdetails user);


}
