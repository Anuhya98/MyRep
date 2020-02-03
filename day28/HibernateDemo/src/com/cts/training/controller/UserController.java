package com.cts.training.controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cts.training.model.User;

public class UserController 
{
  public static void main(String[] args)
  {
//	  Configuration cfg=new Configuration();
//	  cfg.configure();
//	  SessionFactory sessionFactory=cfg.buildSessionFactory();
//	  Session session=sessionFactory.openSession();
//	  Transaction transaction=session.beginTransaction();
//	// User user=new User(103,"test","test@123","test@cts.com",12345699,false);
//	 // session.save(user);
//	  //To fetch the record
//	  User getUser=session.get(User.class,102);
//	  getUser.setEnabled(true);
//	  session.update(getUser);
//	  //To delete
//	  //session.delete(getUser);
//	  //List<User> users=session.createQuery("From User").list();
//	  //users.forEach(System.out::println);
//	  transaction.commit();
//	  session.close();
	  UserDAO userDAO=new UserDAOImpl();
	  boolean status=userDAO.isValidUser("Anu","1234");
	  if(status) {
		  System.out.println("Valid user");
	  }
	  else
	  {
		  System.out.println("Invalid");
	  }
  }
}
