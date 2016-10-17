package com.niit.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.niit.models.Forumcomment;
import com.niit.service.Forumcdao;

@RestController
public class Forumcommentcontrol {
	
	@Autowired
	private Forumcdao forumcdao;
	
	@PostMapping("/ForumComment")
	public void ForumComment(@RequestBody Forumcomment comment,HttpSession session) 
	{
		forumcdao.createforum(comment,session);
	}
	@GetMapping("/getAllComments/{fid}")
	public String getforum(@PathVariable("fid") int fid)
	{          
		return forumcdao.getforum(fid);
	}
}

