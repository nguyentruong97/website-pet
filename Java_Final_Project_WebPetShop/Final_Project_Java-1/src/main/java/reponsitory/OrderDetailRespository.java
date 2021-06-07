package reponsitory;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import entity.orderDetailEntity;

@Repository
public interface OrderDetailRespository extends CrudRepository<orderDetailEntity, Long>{

}
