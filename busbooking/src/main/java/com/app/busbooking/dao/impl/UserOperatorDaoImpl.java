package com.app.busbooking.dao.impl;

import org.springframework.stereotype.Repository;

import com.app.busbooking.dao.AbstractDao;

import com.app.busbooking.dao.UserOperatorDao;
import com.app.busbooking.model.UserOperator;

@Repository("userOperatorDao")
public class UserOperatorDaoImpl extends AbstractDao<Integer, UserOperator> implements UserOperatorDao {

}
