package services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import entity.breedEntity;
import reponsitory.BreedRepositoty;

public interface breedServices {

	void deleteAll();

	void deleteAll(Iterable<? extends breedEntity> entities);

	void delete(breedEntity entity);

	void deleteById(Integer id);

	long count();

	Iterable<breedEntity> findAllById(Iterable<Integer> ids);

	Iterable<breedEntity> findAll();

	boolean existsById(Integer id);

	Optional<breedEntity> findById(Integer id);

	<S extends breedEntity> Iterable<S> saveAll(Iterable<S> entities);

	<S extends breedEntity> S save(S entity);



}
