package com.app.busbooking.dao.impl;

import org.springframework.stereotype.Repository;

import com.app.busbooking.dao.AbstractDao;
import com.app.busbooking.dao.RouteDao;
import com.app.busbooking.model.Route;

@Repository("routeDao")
public class RouteDaoImpl extends AbstractDao<Integer, Route> implements RouteDao {

}
