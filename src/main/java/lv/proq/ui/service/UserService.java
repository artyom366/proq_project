package lv.proq.ui.service;

import lv.proq.ui.domain.user.User;
import lv.proq.ui.errors.AuthorityExistsException;
import lv.proq.ui.errors.UserExistsException;

public interface UserService {
    void saveUser(User user) throws UserExistsException;
    void savePowerUser(User user) throws UserExistsException;
    void saveAdminUser(User user) throws UserExistsException;
    boolean isExists(User user);
    User findOne(String username);
}
