package lv.proq.ui.dao;

import lv.proq.ui.domain.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Marina on 2/22/2016.
 */

@Component
@Transactional
public class UserDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public void create(User user) {
        sessionFactory.getCurrentSession().save(user);
    }
}
