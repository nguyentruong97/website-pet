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

import entity.coatTypeEntity;
import services.coatTypeServices;

@Controller
@RequestMapping("/coatType")
public class coatTypeController {
	@Autowired
	private coatTypeServices coatTypeServices;
	
	@RequestMapping("/list")
	public String list(ModelMap map) {
		List<coatTypeEntity> list = coatTypeServices.findAll();
		map.addAttribute("coatType", list);
		return "coatType/list";
	}
	
	@GetMapping("/add")
	public String Add(ModelMap model) {
		coatTypeEntity coatType = new coatTypeEntity();
		model.addAttribute("coatType", coatType);
		return "coatType/addOrEdit";
	}
	
	@PostMapping("/saveOrUpdate")
	public String saveOrUpdate(ModelMap model, coatTypeEntity coatType) {
			coatTypeServices.save(coatType);
			return "redirect:/coatType/list";
	}
	@GetMapping("/edit/{idCoat}")
	public String edit(ModelMap model,@PathVariable(name = "idCoat") Integer id) {
		Optional<coatTypeEntity> optCoatType = coatTypeServices.findById(id);
			if(optCoatType.isPresent()) {
				model.addAttribute("coatType", optCoatType.get());
			}
			return "coatType/addOrEdit";
	}
	@GetMapping("/delete/{id}")
	public String delete( @PathVariable(name = "id") Integer id) {
		
		coatTypeServices.deleteById(id);
		
		return "redirect:/coatType/list";
	
	}
	
}
