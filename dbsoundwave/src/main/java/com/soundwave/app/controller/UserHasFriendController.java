package com.soundwave.app.controller;

import org.springframework.web.bind.annotation.*;

import com.soundwave.app.service.UserHasFriendService;


@RestController
@RequestMapping
("/api/userhasfriend")
public class UserHasFriendController {

	UserHasFriendService userHasFriendService;

	public UserHasFriendController(UserHasFriendService userHasFriendService) {
		this.userHasFriendService = userHasFriendService;
	}
	
	
}