package com.app.busbooking.dao.impl;

import org.springframework.stereotype.Repository;

import com.app.busbooking.dao.AbstractDao;
import com.app.busbooking.dao.BusTypeDao;
import com.app.busbooking.model.BusType;

@Repository("busTypeDao")
public class BusTypeDaoImpl extends AbstractDao<Integer, BusType> implements BusTypeDao {

}
