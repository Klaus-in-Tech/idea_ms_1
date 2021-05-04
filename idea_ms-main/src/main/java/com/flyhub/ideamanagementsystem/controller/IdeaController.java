package com.flyhub.ideamanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.flyhub.ideamanagementsystem.entity.Idea;
import com.flyhub.ideamanagementsystem.exception.ResourceNotFoundException;
import com.flyhub.ideamanagementsystem.repository.IdeaRepository;

@Controller
@RequestMapping("/")
public class IdeaController {

	@Autowired
	private IdeaRepository ideaRepository;


	// Register idea
	@PostMapping("/register_idea")
	public String createIdea(Idea idea) {
		ideaRepository.save(idea);
		return "redirect:/idea_form";
	}

	@GetMapping("/idea_form")
	public String showIdeaForm(Model model) {
		model.addAttribute("idea", new Idea());
		return ("idea_form");
	}

	// update idea
	@GetMapping("/edit_idea/{id}")
	public String showIdeaForm(@PathVariable(value = "id") Long ideaId, Model model)
			throws ResourceNotFoundException {

		Idea idea = ideaRepository.findById(ideaId)
				.orElseThrow(() -> new ResourceNotFoundException("Idea not found for this id :: " + ideaId));
		model.addAttribute("idea", idea);
		return "edit_idea";
	}
	
	@PostMapping("/update_idea/{id}")
	public String updatedIdea(@PathVariable(value="id") Long ideaId, Idea ideaDetails) {
		ideaRepository.save(ideaDetails);
		return "redirect:/ideas";
	}

	// delete idea
	@GetMapping("/delete_idea/{id}")
	public String deleteIdea(@PathVariable(value = "id") Long ideaId, Model model) throws ResourceNotFoundException {
		Idea idea = ideaRepository.findById(ideaId)
				.orElseThrow(() -> new ResourceNotFoundException("Idea not found for this id :: " + ideaId));

		this.ideaRepository.delete(idea);
		model.addAttribute("ideas", ideaRepository.findAll());
		return "idea_list";

	}

	// get all ideas
	@GetMapping("/ideas")
	public String getAllIdea(Model model) {
		model.addAttribute("ideas", ideaRepository.findAll());
		return "idea_list";

	}

	// get idea by id
	@GetMapping("/idea/{id}")
	public ResponseEntity<Idea> getIdeaById(@PathVariable(value = "id") Long ideaId) throws ResourceNotFoundException {
		Idea idea = ideaRepository.findById(ideaId)
				.orElseThrow(() -> new ResourceNotFoundException("User not found for this id :: " + ideaId));
		return ResponseEntity.ok().body(idea);

	}

}
