package com.app.busbooking.dao.impl;

import org.springframework.stereotype.Repository;

import com.app.busbooking.dao.AbstractDao;
import com.app.busbooking.dao.UserDao;
import com.app.busbooking.model.User;

@Repository("userDao")
public class UserDaoImpl extends AbstractDao<Integer, User> implements UserDao {
 
}
