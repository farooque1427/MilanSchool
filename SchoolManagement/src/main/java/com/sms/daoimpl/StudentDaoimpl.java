package com.sms.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.sms.beans.Classes;
import com.sms.beans.StudentDetails;
import com.sms.dao.StudentDao;

@Repository
public class StudentDaoimpl implements StudentDao{
	
	private static final Logger LOG = LoggerFactory.getLogger(StudentDaoimpl.class);
//	private static String READ_ALL_USER = "SELECT * FROM student_details";
	private static String READ_ALL_USER = "FROM StudentDetails";
	private static String READ_ALL_CLASS = "FROM Classes";
	private static String READ_ALL_USER_COUNT = "SELECT COUNT(*) FROM StudentDetails";
	SessionFactory sessionFactory;
	Session session;
	Transaction tx;
	
	void openSessionAndTransection() {
		sessionFactory = HibernateUtil.getSessionFactory();
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		LOG.info("Session Open And Transection is Begin...");
	}
	
	@Override
	public Long saveStudent(StudentDetails studentDetails) {
		LOG.info("saveStudent(-) Called...");
		openSessionAndTransection();
		Long StudentId = (Long) session.save(studentDetails);
		tx.commit();
		session.close();
		return StudentId;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<StudentDetails> getAllStudent() {
		LOG.info("getAllStudent() Called...");
		List<StudentDetails> list;
		openSessionAndTransection();
		Query query = session.createQuery(READ_ALL_USER);
		list = query.list();
		tx.commit();
		LOG.info("All Student :" + list);
		return list;
	}

	@Override
	public Long getAllStudentCount() {
		LOG.info("getAllStudentCount() Called...");
		openSessionAndTransection();
		Query query = session.createQuery(READ_ALL_USER_COUNT);
		Long totalStudent = (Long)query.uniqueResult();
		tx.commit();
		LOG.info("Total Students: "+ totalStudent);
		return totalStudent;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Classes> getAllClasses() {
		LOG.info("getAllClasses() Called...");
		List<Classes> list;
		openSessionAndTransection();
		Query query = session.createQuery(READ_ALL_CLASS);
		list = query.list();
		System.out.println(list.toString());
		tx.commit();
		
		LOG.info("Total Classes: "+ list.size());
		return list;
	}

}
