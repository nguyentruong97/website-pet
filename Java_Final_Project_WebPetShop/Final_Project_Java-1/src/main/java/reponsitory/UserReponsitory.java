package reponsitory;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import entity.userEntity;

@Component
@Repository
public interface UserReponsitory extends CrudRepository<userEntity, Integer>{
	
	@Query("FROM userEntity where user_name = :username")
    public userEntity findUserByUsername(@Param("username") String username);

}
