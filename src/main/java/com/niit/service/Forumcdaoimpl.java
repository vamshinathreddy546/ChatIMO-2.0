package com.niit.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.niit.dao.Forumcommentdao;
import com.niit.models.Forumcomment;

@Service
public class Forumcdaoimpl implements Forumcdao{
	
	
	
	@Autowired 
	private Forumcommentdao forumcommentdao;
	
	public void createforum(Forumcomment comment,HttpSession session)
	{
		comment.setFuserid((int)session.getAttribute("id"));
		System.out.println(session.getAttribute("id"));
		comment.setCommenttime(new java.util.Date());
		forumcommentdao.save(comment);
	}
	public String getforum(int fid)
	{
		List<Forumcomment> list= forumcommentdao.getforum(fid);
		Gson gson=new Gson();
		String data=gson.toJson(list);
		return data;
		
	}
	
	
	

}
