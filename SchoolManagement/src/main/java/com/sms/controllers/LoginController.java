package com.sms.controllers;

import java.util.ResourceBundle;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sms.dao.StudentDao;

@Controller
public class LoginController {

	private static final Logger LOG = LoggerFactory.getLogger(LoginController.class);
	ResourceBundle rb;
	public final String MESG;
	public final String LOG_ERR;

	@Autowired
	StudentDao studentDao;
	
	public LoginController() {
		LOG.info("LoginController() called.");
		rb = ResourceBundle.getBundle("messages");
		MESG = rb.getString("mseg");
		LOG_ERR = rb.getString("log_error");
	}
	
	@PostMapping("signin")
	public ModelAndView signInUser(HttpServletRequest req, HttpServletResponse res) {
		LOG.info("signInUser() called.");
		String userName = req.getParameter("username");
		String password = req.getParameter("password");
//		List<User> users;
//		User user;
//
//		if (userName != null && password != null) {
//
//			users = userdao.authanticateUser(userName, password);
//
//			Iterator<Users> itr = users.iterator();
//			if (itr.hasNext()) {
//				user = (Users) users.get(0);
//
//				HttpSession httpSession = req.getSession();
//				if (!httpSession.isNew()) {
//					httpSession.invalidate();
//					httpSession = req.getSession();
//					httpSession.setMaxInactiveInterval(0);
//				}
//				httpSession.setAttribute("userid", user.getUserId());
//				httpSession.setAttribute("username", user.getFullName());
//				return new ModelAndView("dashboard");
//			} else {
//				return new ModelAndView("sign_in", MESG, LOG_ERR);
//			}
//		} else {
		if (userName.equals("admin") && password.equals("password"))
			return new ModelAndView("dashboard", "totalStudent", studentDao.getAllStudentCount());	
		else
			return new ModelAndView("index", MESG, LOG_ERR);
//		}
	}
}
