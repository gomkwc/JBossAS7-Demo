package com.jboss.user.process.login.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jboss.user.process.login.domain.User;
import com.jboss.user.process.login.service.UserService;

@Controller
public class UserController  {
   
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/userInfo.do", method=RequestMethod.GET)
	protected ModelAndView handleData(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		System.out.println("### Data ###");
		List<User> list = (List<User>) userService.getUserInfo();
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("userList",list);
		mav.setViewName("login/index_data");
			
		return mav;
	}
}