package com.jboss.user.process.login.dao;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.jboss.user.process.login.dao.UserDAO;
import com.jboss.user.process.login.domain.User;

@SuppressWarnings("restriction")
@Repository
public class UserDAOImpl extends SqlSessionDaoSupport implements UserDAO{

	/**
	 * 
	 * 테스트
	 * 
	 */
	@SuppressWarnings("unchecked")
	public List<User> getUserInfo() throws Exception {
		List<User> list =  getSqlSession().selectList("userDAO.GET_USER_INFO");
		return list;
	}
	
}