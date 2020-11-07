package com.sms.daoimpl;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	static SessionFactory sessionFactory;

	static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			// loads configuration and mappings
			Configuration configuration = new Configuration().configure();
			// builds a session factory from the service registry
			sessionFactory = configuration.buildSessionFactory();
		}
		return sessionFactory;
	}
}
