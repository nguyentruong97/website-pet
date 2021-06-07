package reponsitory;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import entity.breedEntity;

@Repository
public interface BreedRepositoty extends CrudRepository<breedEntity, Integer>  {
	
}
