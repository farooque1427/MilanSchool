package com.sms.controllers;

import java.util.List;
import java.util.ResourceBundle;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sms.beans.Address;
import com.sms.beans.BankDetails;
import com.sms.beans.Classes;
import com.sms.beans.StudentDetails;
import com.sms.dao.StudentDao;
import com.sms.services.JsonUtil;

@Controller
public class StudentController {
	private static final Logger LOG = LoggerFactory.getLogger(StudentController.class);
	ResourceBundle rb;
	private final String ADDSTUDERR;
	@Autowired
	StudentDao studentDao;

	public StudentController() {
		LOG.info("StudentController() called.");
		rb = ResourceBundle.getBundle("messages");
		ADDSTUDERR = rb.getString("addStudentErr");
	}

	@PostMapping("addnewstudent")
	public ModelAndView addNewStudent(@ModelAttribute("StudentDetails") StudentDetails studentDetails,
			@ModelAttribute("Address") Address address, @ModelAttribute("BankDetails") BankDetails bankDetails,
			HttpServletRequest req, HttpServletResponse res){
		LOG.info("addNewStudent(-,-,-,-) called.");
		try {
			studentDetails.setAddress(address);
			studentDetails.setBankDetails(bankDetails);
			Long studentId = studentDao.saveStudent(studentDetails);
			LOG.info("Student ID :" + studentId);
			
		}catch (Exception e) {
			LOG.error("Some problem in retreiving student data => " + e.getMessage());
			e.printStackTrace();
			return new ModelAndView("AddStudent", "ErrorMsg", ADDSTUDERR);
		}
		return new ModelAndView("StudentHome", "students", studentDao.getAllStudent());
		
//		if (!file.isEmpty()) {
//			try {
//				byte[] bytes = file.getBytes();
//
//				// Creating the directory to store file
//				String studPhoto = req.getContextPath()+ "/src/main/webapp/StudentPhotos";
//				File dir = new File(studPhoto);
//				if (!dir.exists()) {
//					dir.mkdirs();
//				}
//				File serverFile = new File(dir.getAbsolutePath());
//				BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
//				stream.write(bytes);
//				stream.close();
//				
//			}catch (Exception e) {
//				
//			}
//		}
		
//		req.getRequestDispatcher("studenthome.htm").forward(req, res);
//		return "StudentHome";
	}

	@GetMapping("getAllStudents")
	public void getAllStudents(HttpServletRequest req, HttpServletResponse res) {
		LOG.info("getAllStudents() called.");
		JSONArray allStudentJson = new JSONArray();
		JSONObject jsonObj = new JSONObject();
		try {
			List<StudentDetails> allStudents = studentDao.getAllStudent();

			for (StudentDetails studentDetails : allStudents) {
				JSONObject studentsJson = JsonUtil.getStudentJson(studentDetails);
				if (studentsJson != null) {
					allStudentJson.put(studentsJson);
				}
				studentsJson = null;
			}

			LOG.info("All Students Count is :: " + allStudentJson.length());

			jsonObj.put("allStudents", allStudentJson);
			jsonObj.put("alertMessage", "AllStudents...");
			allStudentJson = null;

			res.setContentType("application/json");
			res.getWriter().write(jsonObj.toString());
			res.flushBuffer();

		} catch (Exception e) {
			jsonObj.put("alertMessage", "Error Occured");
			LOG.error("Some problem in retreiving student data => " + e.getMessage());
			e.printStackTrace();
		}
	}

	@GetMapping("getAllClasses")
	public void getAllClasses(HttpServletRequest req, HttpServletResponse res) {
		JSONObject jsonObj = new JSONObject();
		JSONArray allClassArray = new JSONArray();
		try {
			List<Classes> allClasses = studentDao.getAllClasses();

			for (Classes classes : allClasses) {
				JSONObject classJson = new JSONObject();
				classJson.put("ClassID", classes.getClassId());
				classJson.put("Class", classes.getClasses());
				if (classJson != null) {
					allClassArray.put(classJson);
				}//endIf
				classJson = null;
			}//endFor
			
			jsonObj.put("allStudents", allClassArray);
			jsonObj.put("alertMessage", "All Classes...");
			allClassArray = null;

			res.setContentType("application/json");
			res.getWriter().write(jsonObj.toString());
			res.flushBuffer();
			
		} catch (Exception e) {
			jsonObj.put("alertMessage", "Error Occured");
			LOG.error("Some problem in retreiving classes data => " + e.getMessage());
			e.printStackTrace();
		}

	}
}
