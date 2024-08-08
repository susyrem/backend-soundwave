package com.soundwave.app.controller;

import org.springframework.web.bind.annotation.*;

import com.soundwave.app.service.ReactionService;

@RestController
@RequestMapping
("/api/reactions")
public class ReactionController {

    ReactionService reactionService;

    public ReactionController(ReactionService reactionService) {
		this.reactionService = reactionService;
}
}
