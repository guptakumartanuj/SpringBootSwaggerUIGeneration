package com.main.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/hello")
@Api(value = "hello", description = "Sample hello world application")
public class TestController {

	@ApiOperation(value = "Just to test the sample test api of My App Service")
	@RequestMapping(method = RequestMethod.GET, value = "/test")
	// @Produces(MediaType.APPLICATION_JSON)
	public String test() {
		return "Hello to check Swagger UI";
	}

	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/test1", method = GET)
	@ApiOperation(value = "My App Service get test1 API", position = 1)
	public String test1() {
		System.out.println("Testing");
		if (true) {
			return "Tanuj";
		}
		return "Gupta";
	}

}
