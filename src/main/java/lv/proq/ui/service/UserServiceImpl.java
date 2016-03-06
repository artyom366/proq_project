package lv.proq.ui.service;

import lv.proq.ui.domain.user.User;
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

    @Override
    @Transactional
    public void saveUser(User user) throws UserExistsException {
        boolean userExists = isExists(user);
        if (!userExists) {
            user.setEnabled(true);
            userRepository.save(user);
        } else {
            throw new UserExistsException();
        }
    }

    @Override
    @Transactional
    public void savePowerUser(User user) throws UserExistsException {
        if (!isExists(user)) {
            user.setEnabled(true);
            userRepository.save(user);
        } else {
            throw new UserExistsException();
        }
    }

    @Override
    @Transactional
    public void saveAdminUser(User user) throws UserExistsException {
        if (!isExists(user)) {
            user.setEnabled(true);
            userRepository.save(user);
        } else {
            throw new UserExistsException();
        }
    }

    @Override
    public boolean isExists(User user) {
        return userRepository.exists(user.getUsername());
    }

    @Override
    public User findOne(String username) {
        return userRepository.findOne(username);
    }


}
