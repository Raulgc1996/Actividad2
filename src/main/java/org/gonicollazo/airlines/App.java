package org.gonicollazo.airlines;

import java.util.List;

import org.gonicollazo.airlines.models.Aircraft;
import org.gonicollazo.airlines.models.Pilot;
import org.gonicollazo.airlinesDao.AircraftDao;
import org.gonicollazo.airlinesDao.PilotDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Aircraft aircraft1 = new Aircraft("aircraft1", 12.3f);
    	Aircraft aircraft2 = new Aircraft("aircraft2", 182.3f);
    	Pilot pilot1 = new Pilot("Pilot1",5);
    	Pilot pilot2 = new Pilot("Pilot2",78);
    	aircraft1.setPilot(pilot1);
    	aircraft2.setPilot(pilot2);
    	pilot1.setAircraft(aircraft1);
    	pilot2.setAircraft(aircraft2);
    	AircraftDao daoa = new AircraftDao();
    	PilotDao daop = new PilotDao();
    	daoa.insert(aircraft1);
    	daoa.insert(aircraft2);
    	daop.insert(pilot1);
    	
    	daop.insert(pilot2);
    	
    	List<Aircraft> aircrafts = daoa.selectAll();
    	for (Aircraft aircraft : aircrafts){
    		aircraft.toString();
    	}
    }
}
