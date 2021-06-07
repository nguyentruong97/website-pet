package services;

import java.util.List;
import java.util.Optional;

import entity.orderEntity;
import entity.userEntity;

public interface orderServices {

	orderEntity save(orderEntity entity);

	List<orderEntity> saveAll(List<orderEntity> entities);

	Optional<orderEntity> findById(Integer id);

	boolean existsById(Integer id);

	List<orderEntity> findAll();

	List<orderEntity> findAllById(List<Integer> ids);

	long count();

	void deleteById(Integer id);

	void delete(orderEntity entity);

	void deleteAll();

	void deleteAll(List<orderEntity> entity);

	List<userEntity> findAllUsers();


}
