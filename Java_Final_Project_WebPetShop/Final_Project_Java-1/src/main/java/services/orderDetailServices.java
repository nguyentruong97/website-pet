package services;

import java.util.List;
import java.util.Optional;

import entity.orderDetailEntity;

public interface orderDetailServices {

	orderDetailEntity save(orderDetailEntity entity);

	List<orderDetailEntity> saveAll(List<orderDetailEntity> entities);

	Optional<orderDetailEntity> findById(Long id);

	boolean existsById(Long id);

	List<orderDetailEntity> findAll();

	List<orderDetailEntity> findAllById(List<Long> ids);

	long count();

	void deleteById(Long id);

	void delete(orderDetailEntity entity);

	void deleteAll();

	void deleteAll(List<orderDetailEntity> entity);

}
