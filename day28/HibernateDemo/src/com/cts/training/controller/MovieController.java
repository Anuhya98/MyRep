package com.cts.training.controller;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cts.training.model.Actor;
import com.cts.training.model.Movie;
import com.cts.training.model.Person;

public class MovieController 
{
	public static void main(String[] args) 
	{
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session=sessionFactory.openSession();
		
		Movie movie=new Movie();
		movie.setName("Frozen2");
		Actor actor1=new Actor();
		actor1.setActorName("Elsa");
		actor1.setMovie(movie);
		Actor actor2=new Actor();
		actor2.setActorName("Anna");
		actor2.setMovie(movie);
		Transaction tx = session.beginTransaction();
		
		session.save(movie);
		session.save(actor1);
		session.save(actor2);
		tx.commit();
		session.close();
		
	}

}
