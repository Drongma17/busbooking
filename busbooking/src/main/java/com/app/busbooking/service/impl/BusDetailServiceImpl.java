package com.app.busbooking.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.busbooking.dao.BusDetailDao;
import com.app.busbooking.model.BusDetail;
import com.app.busbooking.service.BusDetailService;

@Service("busDetailService")
@Transactional
public class BusDetailServiceImpl implements BusDetailService{

	@Autowired
	private BusDetailDao busDetailDao;
	
	public List<BusDetail> getAll() {
		return busDetailDao.getAll();
	}

	public void save(BusDetail object) throws Exception {
		busDetailDao.save(object);
	}

	public BusDetail get(Integer id) {
		return busDetailDao.get(id);
	}

	public int count() {
		return busDetailDao.count();
	}

	public void delete(Integer id) {
		busDetailDao.delete(id);
	}

}
