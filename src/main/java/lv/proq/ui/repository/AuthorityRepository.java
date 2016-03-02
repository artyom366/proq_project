package lv.proq.ui.repository;

import lv.proq.ui.domain.user.Authority;
import lv.proq.ui.domain.user.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Iterator;

@Repository
public interface AuthorityRepository extends CrudRepository<Authority, Long> {
    Authority findAuthorityByUsername(User user);
}
