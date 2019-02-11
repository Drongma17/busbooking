package com.app.busbooking.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.busbooking.model.Route;
import com.app.busbooking.model.User;
import com.app.busbooking.response.Response;
import com.app.busbooking.service.RouteService;
import com.app.busbooking.service.UserService;


@RestController
@RequestMapping("route")
public class RouteController {
	
	
	private static final Logger logger = LoggerFactory.getLogger(RouteController.class);

	@Autowired
	private RouteService routeService;

	
	
	// ---------------------------------- save ----------------

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public Response save(@RequestBody Route route) {
		Response response = null;
		try {
			if(route.getId() !=null &&route.getId() == 0 ){
				route.setId(null);
			}
			routeService.save(route);
			response = new Response(200, "successfully route saved", null);
		} catch (Exception e) {
			logger.error("Error to save route", e.getMessage());
			response = new Response(500, "Error to save route", null);
		}
		return response;
	}// end
	
	
	
	// ---------------------------------- save ----------------

	@RequestMapping(value = "/get/all", method = RequestMethod.GET)
	public Response getAll() {
		Response response = null;
		try {
			response = new Response(200, "successfully fetch route list", routeService.getAll());
		} catch (Exception e) {
			logger.error("Error to fetch route list", e.getMessage());
			response = new Response(500, "Error to fetch route list", null);
		}
		return response;
	}// end
	
	

} // end class
