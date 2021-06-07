package controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.orderDetailEntity;
import services.orderDetailServices;
@Controller
@RequestMapping("/orderDetail")
public class OrderDetailController {
	@Autowired
	orderDetailServices services;
	
	@RequestMapping("/list")
	public String list(ModelMap map) {
		map.addAttribute("orders", services.findAll());
		return "orderDetailList";
	}
	
	@RequestMapping("/add")
	public String add(ModelMap map) {
		orderDetailEntity order = new orderDetailEntity();
		 map.addAttribute("ORDER", order);
		return "orderDetailAdd";
	}
	
	@PostMapping("/saveOrUpdate")
	public String save(ModelMap map, orderDetailEntity order) {
		services.save(order);
		return "redirect:list";
	}
	
	@GetMapping("/edit/{idOrderDetails}")
	public String edit(ModelMap model, @PathVariable(name = "idOrderDetails") Long id) {
		Optional<orderDetailEntity> opt = services.findById(id);
		if (opt.isPresent()) {
			model.addAttribute("ORDER", opt.get());	
		}
		return "orderDetailAdd";
		
	}

	@GetMapping("/delete/{idOrderDetails}")
	public String delete(ModelMap model, @PathVariable(name = "idOrderDetails") Long id) {
		services.deleteById(id);
		model.addAttribute("orders", services.findAll());
		return "orderDetailList";
	}
}
