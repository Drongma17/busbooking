package com.app.busbooking.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.busbooking.model.User;
import com.app.busbooking.model.UserOperator;
import com.app.busbooking.response.Response;
import com.app.busbooking.service.UserOperatorService;
import com.app.busbooking.service.UserService;

@RestController
@RequestMapping("user/operator")
public class UserOperatorController {
	
	private static final Logger  logger=  LoggerFactory.getLogger(UserOperatorController.class);
	
	
	@Autowired
	private UserOperatorService userOperatorService;

	
	// ---------------------------------- save ----------------

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public Response save(@RequestBody UserOperator user) {
		Response response = null;
		try {
			user.getOperatorDetail().setId(null);
			user.setOwnerOfBuses(null);
			user.setId(null);
			userOperatorService.save(user);

			response = new Response(200, "successfully user operator saved", null);

		} catch (Exception e) {
			logger.error("Error to save user operator", e.getMessage());
			response = new Response(500, "Error to save user operator", null);
		}
		return response;
	}// end
	
	
} //end
