package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.niit.models.Forum;
import com.niit.service.forumservicedao;

@RestController
public class forumcontroller {
	
	@Autowired
	private forumservicedao forumservice;

	@PostMapping("/forum")
	public void CreateForum(@RequestBody Forum forum) 
	{
		forumservice.create(forum);
	}
	@GetMapping("/getalldetailsf")
	public String getdetails(){
		return forumservice.allforums();
	}
	@DeleteMapping("/deleteforum/{fid}")
	public void deleteblog(@PathVariable("fid") int fid){
		forumservice.delete(fid);
		
	}
	@GetMapping("/editforum/{fid}")
	public ResponseEntity<Forum> editforum(@PathVariable("fid") int fid){
		
		Forum forum=forumservice.editforum(fid);
		return new ResponseEntity<Forum>(forum, HttpStatus.OK);
	
		
	}
}
