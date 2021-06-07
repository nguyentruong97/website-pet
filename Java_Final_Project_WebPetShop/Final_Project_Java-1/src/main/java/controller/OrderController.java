package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.spi.MatchingStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.orderEntity;
import entity.userEntity;
import model.Status;
import model.orderModel;
import reponsitory.UserReponsitory;
import services.orderServices;

@Controller @RequestMapping("/order")
public class OrderController {
	@Autowired
	orderServices services;
	@Autowired
	UserReponsitory userRepository;
	static List<Status> listStatus=new ArrayList<>();
	static {
		Status s1 = new Status(1, "Đã Nhận Hàng");
		Status s2 = new Status(2, "Đang giao");
		Status s3 = new Status(3, "Đã giao");
		Status s4 = new Status(4, "Đã Hủy");
		
		listStatus.add(s1);
		listStatus.add(s2);
		listStatus.add(s3);
		listStatus.add(s4);
	}
	@RequestMapping("/list")
	public String list(ModelMap map) {
		List<orderEntity> orderEntities=services.findAll();
		List<orderModel> orderModels=new ArrayList<>();
		for(orderEntity oe: orderEntities) {
			ModelMapper modelMapper = new ModelMapper();
	        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
			orderModel om=modelMapper.map(oe, orderModel.class);
			Status status=null;
			for(Status st: listStatus) {
				if(st.getId()==oe.getStatus()) status=st;
			}
			om.setStatus(status);
			orderModels.add(om);
		}
		map.addAttribute("orders", orderModels);
		return "orderList";
	}
	
	@RequestMapping("/add")
	public String add(ModelMap map) {
		orderEntity order = new orderEntity();
//		order.setStatus(1);
		order.setUserId(new userEntity()); 
		map.addAttribute("ORDER", order);
		return "orderAddEdit";
	}
	
	@ModelAttribute("list_status")
	public List<Status> getStatus(){
		
		return listStatus;
	}
	
	@PostMapping("/saveOrUpdate")
	public String save(ModelMap map, orderEntity order) {
		services.save(order);
		return "redirect:list";
	}
	
	@ModelAttribute(name = "userTb")
	public List<userEntity> getUserEntities(){
		return services.findAllUsers();
	}
	
	@GetMapping("/edit/{idOrder}")
	public String edit(ModelMap model, @PathVariable(name = "idOrder") Integer id) {
		Optional<orderEntity> opt = services.findById(id);
		if (opt.isPresent()) {
			model.addAttribute("ORDER", opt.get());	
		}
		return "orderAddEdit";
		
	}

	@GetMapping("/delete/{idOrder}")
	public String delete(ModelMap model, @PathVariable(name = "idOrder") Integer id) {
		services.deleteById(id);
		model.addAttribute("orders", services.findAll());
		return "orderList";
	}
}
