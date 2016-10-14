package com.niit.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.niit.models.Forum;

@Repository
public class Forumdaoimpl implements Forumdao {
	
	@Autowired
	private SessionFactory sessionfactory;
	
@Transactional
	public void save(Forum forum) {
		sessionfactory.getCurrentSession().saveOrUpdate(forum);
		
		
	}
@Transactional
public void delete(Forum forum) {
	sessionfactory.getCurrentSession().delete(forum);
	
	
}
@SuppressWarnings("unchecked")
@Transactional
public List<Forum> allforums() {
	@SuppressWarnings("deprecation")
	Criteria d = sessionfactory.getCurrentSession().createCriteria(Forum.class);
	
	List<Forum> list = d.list();
	
	return list;
}
@Transactional
public Forum getforum(int fid) {
	@SuppressWarnings("deprecation")
	Criteria d= sessionfactory.getCurrentSession().createCriteria(Forum.class);
	d.add(Restrictions.eq("fid",fid));
	Forum forum = (Forum) d.uniqueResult();
	return forum;
}
@Transactional
public List<Forum> getIndividualForum(int fid) {
	Criteria d=sessionfactory.getCurrentSession().createCriteria(Forum.class);
	d.add(Restrictions.eq("fid", fid));
	List<Forum> list=d.list();
	return list;
}
}



