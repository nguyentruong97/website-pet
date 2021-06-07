package controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import entity.userEntity;
import model.userModel;
import services.userServices;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	
	//gọi class services
	@Autowired
	private userServices userServices;
	
	@GetMapping("")
	public String login(Model model) {
		model.addAttribute("user", new userModel());
		return "formLogin";
	}
	
	@GetMapping("/register")
	public String register(userModel user, Model model) {
		model.addAttribute("user", new userModel());
		
		return "dangKy";
	}
	
	 @RequestMapping(value ="/register", method = RequestMethod.POST)
	    public String processForm(@ModelAttribute("user") userModel user, Model model) {
		 
		 //lấy thông tin từ form đăng ký ngoài view về và trả văò thực thể được ánh xạ với Db
		 userEntity userEntity = new userEntity();
		 userEntity.setFirstName(user.getFirstName());
		 userEntity.setMobile(user.getMobile());
		 userEntity.setEmail(user.getEmail());
		 userEntity.setUserName(user.getUserName());
		 userEntity.setPassword(user.getPassword());
	 	System.out.println(user);
	 	
	 	//sử dụng jpa để anhs xạ dữ liệu vào db
	 	userServices.saveUser(userEntity);
	 	
	 	//list all user
	 	System.out.println(userServices.listAll().toString());
	 	List<userEntity> listdata = new ArrayList<userEntity>();
	 	listdata = userServices.listAll();
	 	System.out.println(listdata.toString());
	 	
	 	//back tin nhắn ra ngoài view, sẽ làm sau
	 	model.addAttribute("messages", "Thêm tài khoản thành công");
	    return "index";
	    }
	 
	 
	 @RequestMapping(value ="/getLogin", method = RequestMethod.POST)
	    public String processFormLogin(@ModelAttribute("user") userModel user, Model model) {
		 
		 userEntity userResult =  userServices.findUserByUserName(user.getUserName());
		 if (userResult == null) {
			 model.addAttribute("messages", "Đăng nhập thất bại");
			 return "redirect:";
		 }else if (userResult.getPassword().equals(user.getPassword())) {
			 model.addAttribute("messages", "Đăng nhập thành công");
			 return "adminForm/indexAdmin";
		}else {
			model.addAttribute("messages", "Đăng nhập thất bại");
			 return "redirect:";
		}
		
		 
		 
		 
	 }
}
