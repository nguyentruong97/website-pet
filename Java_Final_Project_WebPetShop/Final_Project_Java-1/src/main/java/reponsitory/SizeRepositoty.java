package reponsitory;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import entity.sizeEntity;

@Repository
public interface SizeRepositoty extends CrudRepository<sizeEntity, Integer> {

}
