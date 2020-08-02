package com.techelevator.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@PreAuthorize("isAuthenticated()")
@CrossOrigin
@RestController

public class PetsController {
	
	
}


