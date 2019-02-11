package com.app.busbooking.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.busbooking.dao.BookingDao;
import com.app.busbooking.model.Booking;
import com.app.busbooking.service.BookingService;


@Service("bookingService")
@Transactional
public class BookingServiceImpl implements BookingService{

	@Autowired
	private BookingDao bookingDao;
	
	public List<Booking> getAll() {
		return bookingDao.getAll();
	}

	public void save(Booking object) throws Exception {
		bookingDao.save(object);
	}

	public Booking get(Integer id) {
		return bookingDao.get(id);
	}

	public int count() {
		return bookingDao.count();
	}

	public void delete(Integer id) {
		bookingDao.delete(id);
	}

}
