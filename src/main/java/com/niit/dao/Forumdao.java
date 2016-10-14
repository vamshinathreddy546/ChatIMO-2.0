package com.niit.dao;

import java.util.List;

import com.niit.models.Forum;

public interface Forumdao {

	
	public void save(Forum forum);
	public void delete(Forum forum );
	public Forum getforum(int fid);
	public List<Forum> allforums();
	public List<Forum> getIndividualForum(int fid);
	
	
	
}
