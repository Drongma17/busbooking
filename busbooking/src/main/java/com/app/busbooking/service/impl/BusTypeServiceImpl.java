package com.app.busbooking.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.busbooking.dao.BusTypeDao;
import com.app.busbooking.model.BusType;
import com.app.busbooking.service.BusTypeService;

@Service("busTypeService")
@Transactional
public class BusTypeServiceImpl implements BusTypeService {
	
	@Autowired
	private BusTypeDao  busTypeDao;

	public List<BusType> getAll() {
		return busTypeDao.getAll();
	}

	public void save(BusType object) throws Exception {
		busTypeDao.save(object);
	}

	public BusType get(Integer id) {
		return busTypeDao.get(id);
	}

	public int count() {
		return busTypeDao.count();
	}

	public void delete(Integer id) {
		busTypeDao.delete(id);
	}

}
