package com.cts.project.dao;

import java.util.List;

import com.cts.project.model.Company;
import com.cts.project.model.Sector;

public interface SectorDao 
{
	public boolean addSector(Sector sector);
	public boolean deleteSector(Sector sector);
	public boolean updateSector(Sector sector);
	public Sector getSectorById(int sectorId);
	public List<Sector> getAllSectors();

}
