package services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.breedEntity;
import reponsitory.BreedRepositoty;

@Service
public class breedServiceImpl implements breedServices {
@Autowired
private BreedRepositoty repositoti;
	
	@Override
public <S extends breedEntity> S save(S entity) {
	return repositoti.save(entity);
}

@Override
public <S extends breedEntity> Iterable<S> saveAll(Iterable<S> entities) {
	return repositoti.saveAll(entities);
}

@Override
public Optional<breedEntity> findById(Integer id) {
	return repositoti.findById(id);
}

@Override
public boolean existsById(Integer id) {
	return repositoti.existsById(id);
}

@Override
public Iterable<breedEntity> findAll() {
	return repositoti.findAll();
}

@Override
public Iterable<breedEntity> findAllById(Iterable<Integer> ids) {
	return repositoti.findAllById(ids);
}

@Override
public long count() {
	return repositoti.count();
}

@Override
public void deleteById(Integer id) {
	repositoti.deleteById(id);
}

@Override
public void delete(breedEntity entity) {
	repositoti.delete(entity);
}

@Override
public void deleteAll(Iterable<? extends breedEntity> entities) {
	repositoti.deleteAll(entities);
}

@Override
public void deleteAll() {
	repositoti.deleteAll();
}

	
	
	
}
