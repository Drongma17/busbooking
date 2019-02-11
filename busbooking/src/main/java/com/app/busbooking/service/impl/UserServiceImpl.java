package com.app.busbooking.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.busbooking.dao.UserDao;
import com.app.busbooking.model.User;
import com.app.busbooking.service.UserService;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	public List<User> getAll() {
		return userDao.getAll();
	}

	public void save(User object) throws Exception {
		userDao.save(object);
	}

	public User get(Integer id) {
		return userDao.get(id);
	}

	public int count() {
		return userDao.count();
	}

	public void delete(Integer id) {
		userDao.delete(id);
	}

}
