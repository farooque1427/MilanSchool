package com.sms.services;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.beans.StudentDetails;
import com.sms.dao.StudentDao;

@Service
public class StudentServices {

	private static final Logger LOG = LoggerFactory.getLogger(StudentServices.class);
	
	@Autowired
	StudentDao studentDao;
	
	public JSONArray getAllStudents() {
		LOG.info("getAllStudents() called.");
		JSONArray allStudentJson = new JSONArray();
		JSONObject jsonObj = new JSONObject();
		try {
			List<StudentDetails> allStudents =  studentDao.getAllStudent();
			
			for (StudentDetails studentDetails : allStudents) {
				JSONObject studentsJson = JsonUtil.getStudentJson(studentDetails);
				if (studentsJson != null) {
					allStudentJson.put(studentsJson);
				}
				studentsJson = null;
			}
			
			LOG.info("All Students Count is :: " + allStudentJson.length());

			
			jsonObj.put("allStudents", allStudentJson);
//			jsonObj.put("alertMessage", "AllStudents...");
//			allStudentJson = null;
			
		} catch (Exception e) {
			jsonObj.put("alertMessage", "Error Occured");
			LOG.error("Some problem in retreiving student data => " + e.getMessage());
			e.printStackTrace();
		}
		return allStudentJson;
	}
}
