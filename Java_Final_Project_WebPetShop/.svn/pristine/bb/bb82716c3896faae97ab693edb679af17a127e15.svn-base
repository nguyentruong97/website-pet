package services;

import java.util.List;
import java.util.Optional;

import entity.petEntity;

public interface petServices {

	petEntity save(petEntity entity);

	List<petEntity> saveAll(List<petEntity> entities);

	Optional<petEntity> findById(Integer id);

	boolean existsById(Integer id);

	List<petEntity> findAll();

	List<petEntity> findAllById(List<Integer> ids);

	long count();

	void deleteById(Integer id);

	void delete(petEntity entity);

	void deleteAll();

	void deleteAll(List<petEntity> entity);

}
