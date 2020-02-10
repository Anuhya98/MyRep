package com.cts.project.daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.project.dao.StockpriceDao;
import com.cts.project.model.Stockprice;
import com.cts.project.model.User;

@Transactional
@Repository(value="stockpriceDAO")
public class StockpriceDAOImpl implements StockpriceDao
{
	@Autowired
    SessionFactory sessionFactory;

	//@Override
	public boolean updateStockprice(Stockprice stockprice) {
		try {
		sessionFactory.getCurrentSession().update(stockprice);
		return true;
		}
		catch (HibernateException e) {
			e.printStackTrace();
		return false;
		}
	}

	//@Override
	public boolean addStockprice(Stockprice stockprice) {
		try {
			sessionFactory.getCurrentSession().update(stockprice);
			return true;
			}
			catch (HibernateException e) {
				e.printStackTrace();
			return false;
			}
	}

	//@Override
	public boolean deleteStockprice(Stockprice stockprice) {
		try {
			sessionFactory.getCurrentSession().delete(stockprice);
			return true;
			}
			catch (HibernateException e) {
				e.printStackTrace();
			return false;
			}
	}

	//@Override
	public boolean getStockPriceById(int id) {
		try {
			sessionFactory.getCurrentSession().get(Stockprice.class, id);
			return true;
			}
			catch (HibernateException e) {
				e.printStackTrace();
			return false;
			}
	}

	@Override
	public List<Stockprice> getAllStockPrices() {
try {
			
			List<Stockprice> prices = sessionFactory.getCurrentSession().createQuery("from Stockprice").list();
			return prices;
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
