package services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.imgEntity;
import reponsitory.ImgRepository;

@Service
public class imgServiceImpl implements imgServices{
	
	@Autowired
	private ImgRepository repository;

	@Override
	public void deleteAll(List<imgEntity> entity) {
		repository.deleteAll(entity);
	}

	@Override
	public void deleteAll() {
		repository.deleteAll();
	}

	@Override
	public void delete(imgEntity entity) {
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
	public List<imgEntity> findAllById(List<Integer> ids) {
		return (List<imgEntity>) repository.findAllById(ids);
	}

	@Override
	public List<imgEntity> findAll() {
		return (List<imgEntity>) repository.findAll();
	}

	@Override
	public boolean existsById(Integer id) {
		return repository.existsById(id);
	}

	@Override
	public Optional<imgEntity> findById(Integer id) {
		return repository.findById(id);
		
	}

	@Override
	public List<imgEntity> saveAll(List<imgEntity> entities) {
		return (List<imgEntity>) repository.saveAll(entities);
	}

	@Override
	public imgEntity save(imgEntity entity) {
		return	repository.save(entity);
	
	}
	public imgEntity get(int id) {
		return repository.findById(id).get();
	}
}
