package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import entity.userEntity;
import reponsitory.UserReponsitory;

@Service
@Transactional
@Component
public class userServices {

	//gọi interface có các cấu trúc câu lệnh ánh xạ crud cơ bản
	@Autowired UserReponsitory reponsitory;
	
	
	//save data
	public void saveUser(userEntity user) {
		reponsitory.save(user);
	}
	
	public List<userEntity> listAll() {
		return (List<userEntity>) reponsitory.findAll();
	}
	public userEntity findUserByUserName(String userName) {
		userEntity result =  reponsitory.findUserByUsername(userName);
		
		return result;
		
	}
}
