package controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import entity.sizeEntity;
import services.sizeServices;

@Controller

public class SizeController {
	@Autowired
	sizeServices services;

	
	@GetMapping("/size/list")
	public String list(ModelMap map) {
		List<sizeEntity> list = services.findAll();
		map.addAttribute("size", list);
		return "size/list";
	}
	
	@GetMapping("/size/add")
	public String Add(ModelMap model) {
		sizeEntity size = new sizeEntity();
		model.addAttribute("size", size);
		return "size/addOrEdit";
	}

	@PostMapping("/saveOrUpdate")
	public String saveOrUpdate(ModelMap model, sizeEntity size) {
		services.save(size);
		return "redirect:/size/list";
		
	}
	
	@GetMapping("/edit/{idSize}")
	public String edit(ModelMap model, @PathVariable(name = "idSize") Integer id) {
		Optional<sizeEntity> optSize = services.findById(id);
		if (optSize.isPresent()) {
			model.addAttribute("size", optSize.get());	
		}
		return "size/addOrEdit";
		
	}

	@GetMapping("/delete/{id}")
	public String delete( @PathVariable(name = "id") Integer id) {
		
		services.deleteById(id);
		return "redirect:/size/list";
	}
}
