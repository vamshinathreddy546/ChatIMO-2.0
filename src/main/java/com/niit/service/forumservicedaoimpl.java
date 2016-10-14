package com.niit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.niit.dao.Forumdao;
import com.niit.models.Forum;


@Service
public class forumservicedaoimpl implements forumservicedao {
	@Autowired
	Forumdao forumdao;

	public void create(Forum forum) {
		forumdao.save(forum);
		
	}

	public void delete(int fid) {
		Forum forum = forumdao.getforum(fid);
		forumdao.delete(forum);
		
	}

	public String allforums() {
		List<Forum> list=forumdao.allforums();
		Gson gson=new Gson();
	    String s=gson.toJson(list);
	    return s;
	
	}


	@Override
	public Forum editforum(int fid) {
		return forumdao.getforum(fid);
		
	}

	public List<Forum> getSingleForum(int fid) 
	{
		return forumdao.getIndividualForum(fid);
	}
	}


