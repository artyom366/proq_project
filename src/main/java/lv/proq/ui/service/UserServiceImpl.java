package lv.proq.ui.service;

import lv.proq.ui.conatants.UserRole;
import lv.proq.ui.domain.user.Authority;
import lv.proq.ui.domain.user.User;
import lv.proq.ui.errors.AuthorityExistsException;
import lv.proq.ui.errors.UserExistsException;
import lv.proq.ui.repository.AuthorityRepository;
import lv.proq.ui.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AuthorityRepository authorityRepository;

    @Autowired
    private AuthorityService authorityService;

    @Override
    @Transactional
    public void saveUser(User user) throws AuthorityExistsException, UserExistsException {
        boolean userExists = isExists(user);
        if (!userExists){
            user.setEnabled(true);
            userRepository.save(user);
        } else {
            throw new UserExistsException();
        }
    }

    @Override
    @Transactional
    public void savePowerUser(User user) {
        if (!isExists(user)) {
            user.setEnabled(true);
            userRepository.save(user);
            authorityRepository.save(new Authority(user, UserRole.ROLE_POWER_USER.toString()));
        }
    }

    @Override
    @Transactional
    public void saveAdminUser(User user) {
        if (!isExists(user)) {
            user.setEnabled(true);
            userRepository.save(user);
            authorityRepository.save(new Authority(user, UserRole.ROLE_ADMIN.toString()));
        }
    }

    @Override
    public boolean isExists(User user) {
        return userRepository.exists(user.getUsername());
    }



}
