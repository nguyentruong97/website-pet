package controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import entity.breedEntity;
import services.breedServices;

@Controller
//@RequestMapping ("/breed")


public class BreedController {
	@Autowired
	breedServices services;

	@GetMapping("/breed/list")
	public String list(ModelMap map) {
		List<breedEntity> list = (List<breedEntity>) services.findAll();
		map.addAttribute("breed", list);
		return "breed/list";
	}
	
	
	@GetMapping("/breed/add")
	public String Add(ModelMap model) {
		breedEntity breeds = new breedEntity();
		model.addAttribute("breed", breeds);
		return "breed/AddEditbreed";
	}
	@PostMapping("/saveUpdate")
	public String saveUpdate(ModelMap model, breedEntity breed) {
		services.save(breed);

		return "redirect:/breed/list";
		
	}

	@GetMapping("breed/edit/{idBreed}")
	public String edit(ModelMap model, @PathVariable(name = "idBreed") Integer id) {
		Optional<breedEntity> optionalBreed = services.findById(id);
		if (optionalBreed.isPresent()) {
			model.addAttribute("breed", optionalBreed.get());	
		}
		return "breed/AddEditbreed";
		
	}
	
	

	@GetMapping("breed/delete/{idBreed}")
	public String delete(ModelMap model, @PathVariable(name = "idBreed") Integer id) {	
		services.deleteById(id);
		model.addAttribute("breed", services.findAll());
		return "redirect:/breed/list";
	}
}
