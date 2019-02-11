package com.app.busbooking.dao.impl;

import org.springframework.stereotype.Repository;

import com.app.busbooking.dao.AbstractDao;
import com.app.busbooking.dao.StateDao;
import com.app.busbooking.model.State;

@Repository("stateDao")
public class StateDaoImpl extends AbstractDao< Integer, State> implements StateDao{

}
