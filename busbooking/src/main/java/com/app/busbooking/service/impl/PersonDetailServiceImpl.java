package com.app.busbooking.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.busbooking.dao.PersonDetailDao;
import com.app.busbooking.model.PersonDetail;
import com.app.busbooking.service.PersonDetailService;

@Service("personDetailService")
@Transactional
public class PersonDetailServiceImpl implements PersonDetailService {
	
	@Autowired
	private PersonDetailDao personDetailDao;

	public List<PersonDetail> getAll() {
		return personDetailDao.getAll();
	}

	public void save(PersonDetail object) throws Exception {
		personDetailDao.save(object);
	}

	public PersonDetail get(Integer id) {
		return personDetailDao.get(id);
	}

	public int count() {
		return personDetailDao.count();
	}

	public void delete(Integer id) {
		personDetailDao.delete(id);
	}

}
