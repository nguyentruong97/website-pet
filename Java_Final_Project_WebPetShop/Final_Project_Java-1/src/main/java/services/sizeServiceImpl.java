package services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.sizeEntity;
import reponsitory.SizeRepositoty;


@Service
public class sizeServiceImpl implements sizeServices{
	
	@Autowired
	private SizeRepositoty repository;

	@Override
	public void deleteAll(List<sizeEntity> entity) {
		repository.deleteAll(entity);
	}

	@Override
	public void deleteAll() {
		repository.deleteAll();
	}

	@Override
	public void delete(sizeEntity entity) {
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
	public List<sizeEntity> findAllById(List<Integer> ids) {
		return (List<sizeEntity>) repository.findAllById(ids);
	}

	@Override
	public List<sizeEntity> findAll() {
		return (List<sizeEntity>) repository.findAll();
	}

	@Override
	public boolean existsById(Integer id) {
		return repository.existsById(id);
	}

	@Override
	public Optional<sizeEntity> findById(Integer id) {
		return repository.findById(id);
		
	}

	@Override
	public List<sizeEntity> saveAll(List<sizeEntity> entities) {
		return (List<sizeEntity>) repository.saveAll(entities);
	}

	@Override
	public sizeEntity save(sizeEntity entity) {
		return	repository.save(entity);
	
	}
	
	
	 
}
