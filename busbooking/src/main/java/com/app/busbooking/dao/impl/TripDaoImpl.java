package com.app.busbooking.dao.impl;

import org.springframework.stereotype.Repository;

import com.app.busbooking.dao.AbstractDao;
import com.app.busbooking.dao.TripDao;
import com.app.busbooking.model.Trip;

@Repository("tripDao")
public class TripDaoImpl extends AbstractDao<Integer, Trip> implements TripDao{

}
