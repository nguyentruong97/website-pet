package services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.orderDetailEntity;
import reponsitory.OrderDetailRespository;

@Service
public class orderDetailServiceImpl implements orderDetailServices {
	@Autowired
	private OrderDetailRespository repository;

	@Override
	public void deleteAll(List<orderDetailEntity> entity) {
		repository.deleteAll(entity);
	}

	@Override
	public void deleteAll() {
		repository.deleteAll();
	}

	@Override
	public void delete(orderDetailEntity entity) {
		repository.delete(entity);
	}

	@Override
	public void deleteById(Long id) {
		 repository.deleteById(id);
	}

	@Override
	public long count() {
		return repository.count();
	}

	@Override
	public List<orderDetailEntity> findAllById(List<Long> ids) {
		return (List<orderDetailEntity>) repository.findAllById(ids);
	}

	@Override
	public List<orderDetailEntity> findAll() {
		return (List<orderDetailEntity>) repository.findAll();
	}

	@Override
	public boolean existsById(Long id) {
		return repository.existsById(id);
	}

	@Override
	public Optional<orderDetailEntity> findById(Long id) {
		return repository.findById(id);
		
	}

	@Override
	public List<orderDetailEntity> saveAll(List<orderDetailEntity> entities) {
		return (List<orderDetailEntity>) repository.saveAll(entities);
	}

	@Override
	public orderDetailEntity save(orderDetailEntity entity) {
		return	repository.save(entity);
	
	}
}
