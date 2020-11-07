package com.sms.controllers;

import java.util.ResourceBundle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sms.dao.StudentDao;

@Controller
public class HomeController {

	private static final Logger LOG = LoggerFactory.getLogger(HomeController.class);
	ResourceBundle rb;
	public final String MESG;
	public final String LOG_ERR;

	@Autowired
	StudentDao studentDao;

	public HomeController() {
		LOG.info("HomeController() called.");
		rb = ResourceBundle.getBundle("messages");
		MESG = rb.getString("mseg");
		LOG_ERR = rb.getString("log_error");
	}

	@GetMapping("login")
	public String home() {
		LOG.info("home() called.");
		return "index";
	}

	@GetMapping("dashboard")
	public ModelAndView dashboard() {
		LOG.info("dashboard() called.");
		return new ModelAndView("dashboard", "totalStudent", studentDao.getAllStudentCount());
//		return "dashboard";
	}

	@GetMapping("addstudent")
	public String addStudent() {
		LOG.info("addStudent() called.");
		return "AddStudent";
	}

	@GetMapping("studenthome")
	public ModelAndView studentHome() {
		LOG.info("studentHome() called.");
	return new ModelAndView("StudentHome", "students", studentDao.getAllStudent());	
	}

	@GetMapping("addstaff")
	public String addTeachingStaff() {
		LOG.info("addTeachingStaff() called.");
		return "AddTeachingStaff";
	}

	@GetMapping("addnonstaff")
	public String addNonTeachingStaff() {
		LOG.info("addNonTeachingStaff() called.");
		return "AddNonTeachingStaff";
	}

	@GetMapping("transfer")
	public String TransferCertificate() {
		LOG.info("TransferCertificate() called.");
		return "CertificateTransfer";
	}

	@GetMapping("bonafide")
	public String BonafideCertificate() {
		LOG.info("BonafideCertificate() called.");
		return "CertificateBonafide";
	}

}
