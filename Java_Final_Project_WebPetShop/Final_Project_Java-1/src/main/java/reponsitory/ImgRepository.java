package reponsitory;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import entity.imgEntity;

@Repository
public interface ImgRepository extends CrudRepository<imgEntity, Integer> {

}
