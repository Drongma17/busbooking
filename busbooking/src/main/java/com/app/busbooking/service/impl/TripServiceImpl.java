package com.app.busbooking.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.busbooking.dao.TripDao;
import com.app.busbooking.model.Trip;
import com.app.busbooking.service.TripService;

@Service("tripService")
@Transactional
public class TripServiceImpl implements TripService{
	
	@Autowired
	private TripDao tripDao;

	public List<Trip> getAll() {
		return tripDao.getAll();
	}

	public void save(Trip object) throws Exception {
		tripDao.save(object);
	}

	public Trip get(Integer id) {
		return tripDao.get(id);
	}

	public int count() {
		return tripDao.count();
	}

	public void delete(Integer id) {
		tripDao.delete(id);
	}
	

}
