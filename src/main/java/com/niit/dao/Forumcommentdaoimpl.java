package com.niit.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.models.Forumcomment;

@Repository
public class Forumcommentdaoimpl  implements Forumcommentdao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public void save(Forumcomment comment)
	{
		sessionFactory.getCurrentSession().save(comment);
	}
	@Transactional
	public  List<Forumcomment>getforum(int fid)
	{
		@SuppressWarnings("deprecation")
		Criteria d=sessionFactory.getCurrentSession().createCriteria(Forumcomment.class);
		d.add(Restrictions.eq("fid",fid));
		@SuppressWarnings("unchecked")
		List<Forumcomment>list=d.list();
		return list;
	}

}
