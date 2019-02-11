package com.app.busbooking.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.busbooking.dao.StateDao;
import com.app.busbooking.model.State;
import com.app.busbooking.service.StateService;

@Service("stateService")
@Transactional
public class StateServiceImpl implements StateService {

	@Autowired
	private StateDao stateDao;
	
	public List<State> getAll() {
		return stateDao.getAll();
	}

	public void save(State object) throws Exception {
		stateDao.save(object);
	}

	public State get(Integer id) {
		return stateDao.get(id);
	}

	public int count() {
		return stateDao.count();
	}

	public void delete(Integer id) {
		stateDao.delete(id);
	}

}
