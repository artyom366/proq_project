package lv.proq.ui.service;

import lv.proq.ui.domain.user.User;


public interface AuthorityService {
    boolean isExists(User user);
}
