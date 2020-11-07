package com.sms.dao;

import java.util.List;

import com.sms.beans.Classes;
import com.sms.beans.StudentDetails;

public interface StudentDao {

	Long saveStudent(StudentDetails studentDetails);
	
	List<StudentDetails> getAllStudent();
	
	List<Classes> getAllClasses();
	
	Long getAllStudentCount();
	
}
