package com.app.busbooking.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.busbooking.dao.RouteDao;
import com.app.busbooking.model.Route;
import com.app.busbooking.service.RouteService;

@Service("routeService")
@Transactional
public class RouteServiceImpl implements RouteService{

	@Autowired
	private RouteDao routeDao;
	
	public List<Route> getAll() {
		return routeDao.getAll();
	}

	public void save(Route object) throws Exception {
		routeDao.save(object);
	}

	public Route get(Integer id) {
		return routeDao.get(id);
	}

	public int count() {
		return routeDao.count();
	}

	public void delete(Integer id) {
		routeDao.delete(id);
	}

}
