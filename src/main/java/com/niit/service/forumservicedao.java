package com.niit.service;


import java.util.List;

import com.niit.models.Forum;

public interface forumservicedao {
	public void create(Forum forum);
	public void delete(int fid);
	public String allforums();
	public Forum editforum(int fid);
	public List<Forum> getSingleForum(int fid);
	
	

}
