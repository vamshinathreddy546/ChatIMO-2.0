package com.niit.dao;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.models.userdetails;

@Repository
public class Userdaoimpl implements Userdao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public void save(userdetails user)
	{
		sessionFactory.getCurrentSession().saveOrUpdate(user);
	}
	@Transactional
	public void delete(userdetails user)
	{
		sessionFactory.getCurrentSession().delete(user);
	}
	@Transactional
	public userdetails getuname(String username)
	{
	@SuppressWarnings("deprecation")
	Criteria d=sessionFactory.getCurrentSession().createCriteria(userdetails.class);
	d.add(Restrictions.eq("username",username));
	userdetails user=(userdetails) d.uniqueResult();
	return user;
	}
	
	
}
