package services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.orderEntity;
import entity.userEntity;
import model.orderModel;
import reponsitory.OrderRespository;
import reponsitory.UserReponsitory;

@Service
public class orderServiceImpl implements orderServices {
	@Autowired
	private OrderRespository repository;
	
	@Autowired
	private UserReponsitory userReponsitory;
	
	@Override
	public List<userEntity> findAllUsers(){
		return (List<userEntity>) userReponsitory.findAll();
	}

	@Override
	public void deleteAll(List<orderEntity> entity) {
		repository.deleteAll(entity);
	}

	@Override
	public void deleteAll() {
		repository.deleteAll();
	}

	@Override
	public void delete(orderEntity entity) {
		repository.delete(entity);
	}

	@Override
	public void deleteById(Integer id) {
		 repository.deleteById(id);
	}

	@Override
	public long count() {
		return repository.count();
	}

	@Override
	public List<orderEntity> findAllById(List<Integer> ids) {
		return (List<orderEntity>) repository.findAllById(ids);
	}

	@Override
	public List<orderEntity> findAll() {
		return (List<orderEntity>) repository.findAll();
	}

	@Override
	public boolean existsById(Integer id) {
		return repository.existsById(id);
	}

	@Override
	public Optional<orderEntity> findById(Integer id) {
		return repository.findById(id);
		
	}

	@Override
	public List<orderEntity> saveAll(List<orderEntity> entities) {
		return (List<orderEntity>) repository.saveAll(entities);
	}

	@Override
	public orderEntity save(orderEntity entity) {
		return	repository.save(entity);
	
	}
}
