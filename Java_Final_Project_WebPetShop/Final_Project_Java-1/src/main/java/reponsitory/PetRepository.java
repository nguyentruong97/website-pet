package reponsitory;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import entity.petEntity;

@Repository
public interface PetRepository extends CrudRepository<petEntity, Integer> {
	
}
