package com.app.busbooking.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.busbooking.dao.UserOperatorDao;
import com.app.busbooking.model.UserOperator;
import com.app.busbooking.service.UserOperatorService;


@Service("userOperatorService")
@Transactional
public class UserOperatorServiceImpl implements UserOperatorService{

	
	@Autowired
	private UserOperatorDao userOperatorDao;
	
	public List<UserOperator> getAll() {
		return userOperatorDao.getAll();
	}

	public void save(UserOperator object) throws Exception {
		userOperatorDao.save(object);
	}

	public UserOperator get(Integer id) {
		return userOperatorDao.get(id);
	}

	public int count() {
		return userOperatorDao.count();
	}

	public void delete(Integer id) {
		userOperatorDao.delete(id);
	}

}
