package com.jboss.user.process.login.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jboss.user.process.login.dao.UserDAO;
import com.jboss.user.process.login.domain.User;
import com.jboss.user.process.login.service.UserService;

@Service 
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDAO userDAO;
	
	/**    
	 * 
	 * 테스트
	 * 
	 */
	public List<User> getUserInfo() throws Exception {
		
		List<User> list = (List<User>) userDAO.getUserInfo();
		return list;
	}
	
	
}