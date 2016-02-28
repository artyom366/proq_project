package lv.proq.ui.service;

import lv.proq.ui.domain.user.Authority;
import lv.proq.ui.domain.user.User;
import lv.proq.ui.repository.AuthorityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorityServiceImpl implements AuthorityService {

    @Autowired
    private AuthorityRepository authorityRepository;

    @Override
    public boolean isExists(User user) {
        Authority authority = authorityRepository.findAuthorityByUser(user);
        return authority != null;
    }
}
