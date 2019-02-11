package com.app.busbooking.dao.impl;

import org.springframework.stereotype.Repository;

import com.app.busbooking.dao.AbstractDao;
import com.app.busbooking.dao.BusDao;
import com.app.busbooking.model.Bus;

@Repository("busDao")
public class BusDaoImpl extends AbstractDao<Integer, Bus> implements BusDao{

}
