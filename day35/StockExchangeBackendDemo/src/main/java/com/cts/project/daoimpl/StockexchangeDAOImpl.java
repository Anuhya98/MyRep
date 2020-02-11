package com.cts.project.daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.project.dao.StockexchangeDao;
import com.cts.project.model.StockExchange;
import com.cts.project.model.Stockprice;
@Transactional
@Repository(value="stockexchangeDAO")
public class StockexchangeDAOImpl implements StockexchangeDao
{
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public boolean addStockexchange(StockExchange stockexchange) {
		try {
		sessionFactory.getCurrentSession().update(stockexchange);
		return true;
		}
		catch(HibernateException e) {
			e.printStackTrace();
		return false;
		}
	}

	@Override
	public boolean updateStockexchange(StockExchange stockexchange) {
		try {
			sessionFactory.getCurrentSession().update(stockexchange);
			return true;
		}
		catch(HibernateException e) {
			
		e.printStackTrace();
		return false;
		}
	}

	@Override
	public boolean deleteStockexchange(StockExchange stockexchange) {
		try {
			sessionFactory.getCurrentSession().delete(stockexchange);
			return true;
		}
		catch(HibernateException e) {
			e.printStackTrace();
		return false;
		}
	}

	@Override
	public StockExchange getStockexchangeById(int id) {
		try {
			return sessionFactory.getCurrentSession().get(StockExchange.class, id);
			
			}
			catch (HibernateException e) {
				e.printStackTrace();
			return null;
			}
	}

	@Override
	public List<StockExchange> getAllStockexchanges() {
		try {
		List<StockExchange> exchanges = sessionFactory.getCurrentSession().createQuery("from Stockexchange").list();
		return exchanges;
	} catch (HibernateException e) {
		e.printStackTrace();
		return null;
	}
	}
	

}
