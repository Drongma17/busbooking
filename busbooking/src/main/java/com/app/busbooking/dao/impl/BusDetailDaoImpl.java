package com.app.busbooking.dao.impl;

import org.springframework.stereotype.Repository;

import com.app.busbooking.dao.AbstractDao;
import com.app.busbooking.dao.BusDetailDao;
import com.app.busbooking.model.BusDetail;

@Repository("busDetailDao")
public class BusDetailDaoImpl extends AbstractDao<Integer, BusDetail> implements BusDetailDao{

}
