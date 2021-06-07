package reponsitory;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import entity.orderEntity;

@Repository
public interface OrderRespository extends CrudRepository<orderEntity, Integer> {

}
