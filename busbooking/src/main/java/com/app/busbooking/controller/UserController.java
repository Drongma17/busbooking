package com.app.busbooking.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.busbooking.model.User;
import com.app.busbooking.response.Response;
import com.app.busbooking.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserService userService;

	// ---------------------------------- save ----------------

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public Response save(@RequestBody User user) {
		Response response = null;
		try {
			user.getUserDetail().setId(null);
			user.setId(null);
			userService.save(user);

			response = new Response(200, "successfully user saved", null);

		} catch (Exception e) {
			logger.error("Error to save user", e.getMessage());
			response = new Response(500, "Error to save user", null);
		}
		return response;
	}// end

} // end
