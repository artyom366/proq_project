package lv.proq.ui.service;

import lv.proq.ui.domain.user.User;
import lv.proq.ui.domain.user.UserEmail;
import lv.proq.ui.domain.user.UserPhone;
import lv.proq.ui.domain.user.UserSettings;
import lv.proq.ui.errors.AuthorityExistsException;
import lv.proq.ui.errors.UserExistsException;
import lv.proq.ui.transfer.TrialAccountDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

@Service
public class TrialAccountServiceImpl implements TrialAccountService {


    @Autowired
    private UserService userService;

    @Override
    public void saveTrialAccountDetails(TrialAccountDTO trialAccountDTO, Locale locale) throws AuthorityExistsException, UserExistsException {

        User user = new User();
        UserEmail userEmail = new UserEmail(trialAccountDTO.getEmail());
        UserPhone userPhone = new UserPhone(trialAccountDTO.getPhone());

        user.setPassword(trialAccountDTO.getPassword());
        user.setUsername(trialAccountDTO.getUserName());
        user.setEmails(Arrays.asList(userEmail));
        user.setPhones(Arrays.asList(userPhone));

        userService.saveUser(user);


    }
}
