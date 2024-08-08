package com.soundwave.app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.soundwave.app.model.Reaction;
import com.soundwave.app.repository.ReactionRepository;
import com.soundwave.app.service.ReactionService;

@Service
public class ReactionServiceImpl implements ReactionService {

	
    ReactionRepository reactionRepository;
 

    public ReactionServiceImpl(ReactionRepository reactionRepository) {
		this.reactionRepository = reactionRepository;
	}

	/*public List<Reaction> getAllReaction() {
        return reactionRepository.findAll();
    }

    public Optional<Reaction> getReactionById(Long id) {
        return reactionRepository.findById(id);
    }

    public Reaction createReaction(Reaction reaction) {
        return reactionRepository.save(reaction);
    }

    public Reaction updateReaction(Long id, Reaction reactionDetails) {
        return reactionRepository.findById(id)
                .map(reaction -> {
                    reaction.setPostId(reactionDetails.getPostId());
                    reaction.setUserId(reactionDetails.getUserId());
                    reaction.setType(reactionDetails.getType());
                    return reactionsRepository.save(reaction);
                })
                .orElseThrow(() -> new ResourceNotFoundException("Reaction not found with id " + id));
    }

    public void deleteReaction(Long id) {
        reactionRepository.deleteById(id);
    }*/
}
