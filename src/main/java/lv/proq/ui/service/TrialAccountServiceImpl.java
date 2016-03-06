package lv.proq.ui.service;

import lv.proq.ui.conatants.UserRole;
import lv.proq.ui.domain.organization.OrgAddress;
import lv.proq.ui.domain.organization.OrgSettings;
import lv.proq.ui.domain.organization.Organization;
import lv.proq.ui.domain.user.*;
import lv.proq.ui.errors.AuthorityExistsException;
import lv.proq.ui.errors.OrganizationNameExistsException;
import lv.proq.ui.errors.UserExistsException;
import lv.proq.ui.transfer.TrialAccountDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

@Service
public class TrialAccountServiceImpl implements TrialAccountService {

    @Autowired
    private UserService userService;

    @Override
    @Transactional
    public void saveTrialAccountDetails(TrialAccountDTO trialAccountDTO, Locale locale) throws AuthorityExistsException, UserExistsException, OrganizationNameExistsException {

        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

        Organization organization = new Organization();

        OrgSettings orgSettings = new OrgSettings(organization);
        orgSettings.setIsArchiveEnabled(true);
        orgSettings.setIsTrialAccount(true);
        orgSettings.setTabLimit(10);

        OrgAddress address = new OrgAddress(organization);
        address.setCountry(trialAccountDTO.getCountry());

        organization.setAddresses(Arrays.asList(address));
        organization.setWebSite(trialAccountDTO.getWebSite());
        organization.setOrgSettings(orgSettings);
        organization.setName(trialAccountDTO.getBusinessName());
        organization.setEnabled(true);

        User user = new User();
        UserEmail userEmail = new UserEmail(trialAccountDTO.getEmail(), user);
        UserPhone userPhone = new UserPhone(trialAccountDTO.getPhone(), user);
        UserSettings userSettings = new UserSettings(locale.getLanguage(), organization, user);
        Authority authority = new Authority(user, UserRole.ROLE_USER.toString());

        user.setPassword(bCryptPasswordEncoder.encode(trialAccountDTO.getPassword()));
        user.setUsername(trialAccountDTO.getUserName());
        user.setEmails(Arrays.asList(userEmail));
        user.setPhones(Arrays.asList(userPhone));
        user.setUserSettings(userSettings);
        user.setAuthority(authority);

        organization.setUsers(Arrays.asList(user));

        //save a user and everything else will be saved on cascade
        userService.saveUser(user);
    }
}
