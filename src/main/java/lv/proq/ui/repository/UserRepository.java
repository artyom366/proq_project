package lv.proq.ui.repository;

import lv.proq.ui.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Marina on 2/22/2016.
 */

@Repository
public interface UserRepository extends CrudRepository<User, String>  {

}
