package org.gonicollazo.airlinesDao;

import java.util.List;

import org.gonicollazo.airlines.models.Aircraft;


public interface AircraftDaoInterface {
	public Aircraft selectById(Long id);
	public List<Aircraft> selectAll ();
	public void insert (Aircraft aircraft);
	public void update (Aircraft aircraft);
	public void delete (Aircraft aircraft);
}
