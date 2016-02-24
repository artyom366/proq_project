package lv.proq.ui.service;

import lv.proq.ui.domain.User;
import lv.proq.ui.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }
}
