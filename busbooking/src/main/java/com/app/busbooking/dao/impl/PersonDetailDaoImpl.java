package com.app.busbooking.dao.impl;

import org.springframework.stereotype.Repository;

import com.app.busbooking.dao.AbstractDao;
import com.app.busbooking.dao.PersonDetailDao;
import com.app.busbooking.model.PersonDetail;

@Repository("personDetailDao")
public class PersonDetailDaoImpl extends AbstractDao<Integer, PersonDetail> implements PersonDetailDao{

}
