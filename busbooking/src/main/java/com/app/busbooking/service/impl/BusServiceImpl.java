package com.app.busbooking.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.busbooking.dao.BusDao;
import com.app.busbooking.model.Bus;
import com.app.busbooking.service.BusService;

@Repository("busService")
@Transactional
public class BusServiceImpl implements BusService{
	
	@Autowired
	private BusDao busDao;

	public List<Bus> getAll() {
		return busDao.getAll();
	}

	public void save(Bus object) throws Exception {
		busDao.save(object);
	}

	public Bus get(Integer id) {
		return busDao.get(id);
	}

	public int count() {
		return busDao.count();
	}

	public void delete(Integer id) {
		busDao.delete(id);
	}

}
