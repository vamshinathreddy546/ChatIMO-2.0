package com.niit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.niit.dao.Blogdao;
import com.niit.models.Blog;

@Service
public class servicedaoimpl implements blogservicedao {
	@Autowired
	Blogdao blogdao;

	public void create(Blog blog) {
		blogdao.save(blog);
		
	}

	public void delete(int bid) {
		Blog blog = blogdao.getblog(bid);
		blogdao.delete(blog);
		
	}

	public String allblogs() {
		List<Blog> list=blogdao.allblogs();
		Gson gson=new Gson();
	    String s=gson.toJson(list);
	    return s;
	
	}

	@Override
	public Blog editblog(int bid) {
		return blogdao.getblog(bid);
		
	}



	
		
	}


