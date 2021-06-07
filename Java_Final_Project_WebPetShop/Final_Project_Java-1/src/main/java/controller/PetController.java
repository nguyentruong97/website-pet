package controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.petEntity;
import services.petServices;

@Controller
@RequestMapping("/pet")
public class PetController {
	@Autowired
	petServices services;

	
	@GetMapping("/list")
	public String list(ModelMap map) {
		List<petEntity> list = (List<petEntity>) services.findAll();
		map.addAttribute("pet", list);
		return "PetList";
	}
	
	@GetMapping("/add")
	public String Add(ModelMap model) {
		petEntity pet = new petEntity();
		model.addAttribute("pet", pet);
		return "PetAddEdit";
	}

	@PostMapping("/saveOrUpdate")
	public String saveOrUpdate(ModelMap model, petEntity pet) {
		services.save(pet);
		return "redirect:list";
		
	}
	
	@GetMapping("/edit/{idPet}")
	public String edit(ModelMap model, @PathVariable(name = "idPet") Integer id) {
		Optional<petEntity> optPet = services.findById(id);
		if (optPet.isPresent()) {
			model.addAttribute("pet", optPet.get());	
		}
		return "PetAddEdit";
		
	}

	@GetMapping("/delete/{idPet}")
	public String delete(ModelMap model, @PathVariable(name = "idPet") Integer id) {	
		services.deleteById(id);
		model.addAttribute("pet", services.findAll());
		return "PetList";
	}
}
