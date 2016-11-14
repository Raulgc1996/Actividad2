package org.gonicollazo.airlinesDao;

import java.util.List;

import org.gonicollazo.airlines.models.Pilot;

public interface PilotDaoInterfaze {
	public Pilot selectById(Long id);
	public List<Pilot> selectAll ();
	public void insert (Pilot pilot);
	public void update (Pilot pilot);
	public void delete (Pilot pilot);
}
