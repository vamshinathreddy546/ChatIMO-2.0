package com.niit.dao;

import java.util.List;

import com.niit.models.Forumcomment;

public interface Forumcommentdao {
	
	public void save(Forumcomment comment);
	public List<Forumcomment> getforum(int fid);

}
