package com.cts.project.dao;

import java.util.List;


import com.cts.project.model.Ipo;

public interface IpoDao 
{
	public boolean addIpo(Ipo ipo);
	public boolean updateIpo(Ipo ipo);
	public boolean deleteIpo(Ipo ipo);
	public Ipo getIpoById(int id);
	public List<Ipo> getAllIpos();


}
