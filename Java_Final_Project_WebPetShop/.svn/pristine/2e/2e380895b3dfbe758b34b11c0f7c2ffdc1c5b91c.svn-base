package services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.petEntity;
import reponsitory.PetRepository;

@Service
public class petServiceImpl implements petServices {

	@Autowired
	private PetRepository repository;

	@Override
	public void deleteAll(List<petEntity> entity) {
		repository.deleteAll(entity);
	}

	@Override
	public void deleteAll() {
		repository.deleteAll();
	}

	@Override
	public void delete(petEntity entity) {
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
	public List<petEntity> findAllById(List<Integer> ids) {
		return (List<petEntity>) repository.findAllById(ids);
	}

	@Override
	public List<petEntity> findAll() {
		return (List<petEntity>) repository.findAll();
	}

	@Override
	public boolean existsById(Integer id) {
		return repository.existsById(id);
	}

	@Override
	public Optional<petEntity> findById(Integer id) {
		return repository.findById(id);
		
	}

	@Override
	public List<petEntity> saveAll(List<petEntity> entities) {
		return (List<petEntity>) repository.saveAll(entities);
	}

	@Override
	public petEntity save(petEntity entity) {
		return	repository.save(entity);
	
	}
}
