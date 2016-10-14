package com.niit.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.models.Blog;
@Repository
@SuppressWarnings("deprecation")
public class Blogdaoimpl implements Blogdao {
	@Autowired
	private SessionFactory sessionfactory;
	
@Transactional
	public void save(Blog blog) {
		sessionfactory.getCurrentSession().saveOrUpdate(blog);
		
		
	}
@Transactional
public void delete(Blog blog) {
	sessionfactory.getCurrentSession().delete(blog);
	
	
}
@SuppressWarnings("unchecked")
@Transactional
public List<Blog> allblogs() {
	Criteria d = sessionfactory.getCurrentSession().createCriteria(Blog.class);
	
	List<Blog> list = d.list();
	
	return list;
}
@Transactional
public Blog getblog(int bid) {
	Criteria d= sessionfactory.getCurrentSession().createCriteria(Blog.class);
	d.add(Restrictions.eq("bid",bid));
	Blog blog = (Blog) d.uniqueResult();
	return blog;
}

}
