package com.app.busbooking.dao.impl;

import org.springframework.stereotype.Repository;

import com.app.busbooking.dao.AbstractDao;
import com.app.busbooking.dao.BookingDao;
import com.app.busbooking.model.Booking;

@Repository("bookingDao")
public class BookingDaoImpl extends AbstractDao<Integer, Booking> implements BookingDao {

}
