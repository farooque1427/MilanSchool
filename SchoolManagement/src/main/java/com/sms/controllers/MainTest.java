package com.sms.controllers;

import com.sms.dao.StudentDao;
import com.sms.daoimpl.StudentDaoimpl;

public class MainTest {

	public static void main(String[] args) {

		StudentDao studentDao = new StudentDaoimpl();
		studentDao.getAllClasses();
	}

}
