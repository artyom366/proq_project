package lv.proq.ui.service;

import lv.proq.ui.domain.user.User;
import lv.proq.ui.errors.AuthorityExistsException;
import lv.proq.ui.errors.UserExistsException;

public interface UserService {
    void saveUser(User user) throws AuthorityExistsException, UserExistsException;
    void savePowerUser(User user);
    void saveAdminUser(User user);
    boolean isExists(User user);
}
