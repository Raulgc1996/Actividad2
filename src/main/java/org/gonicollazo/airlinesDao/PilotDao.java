package org.gonicollazo.airlinesDao;

import java.util.List;

import org.gonicollazo.airlines.HibernateSession;
import org.gonicollazo.airlines.models.Aircraft;
import org.gonicollazo.airlines.models.Pilot;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class PilotDao implements PilotDaoInterfaze {

	public Pilot selectById(Long id) {
		SessionFactory sessionFactory = org.gonicollazo.airlines.HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();
	 
	    Pilot pilot = (Pilot) session.get(Pilot.class, id);
	    
	    session.close();
	    return pilot;
	}

	public List<Pilot> selectAll() {
	    SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();
	 
	    List<Pilot> pilots = session.createQuery("from pilot").list();
	    
	    session.close();
	    return pilots;
	}

	public void insert(Pilot pilot) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();
	    session.beginTransaction();
	
	    session.persist(pilot);
	         
	    session.getTransaction().commit();
	    session.close();		
	}

	public void update(Pilot pilot) {
		  SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		    Session session = sessionFactory.openSession();	 
		    session.beginTransaction();
		 
		    session.merge(pilot);
		 
		    session.getTransaction().commit();
		    session.close();
					
	}

	public void delete(Pilot pilot) {
		 SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		    Session session = sessionFactory.openSession();	    
		    session.beginTransaction();
		    
		    session.delete(pilot);
		 
		    session.getTransaction().commit();
		    session.close();		
	}

}
