package lv.proq.ui.service;


import lv.proq.ui.errors.AuthorityExistsException;
import lv.proq.ui.errors.OrganizationNameExistsException;
import lv.proq.ui.errors.UserExistsException;
import lv.proq.ui.transfer.TrialAccountDTO;

import java.util.Locale;

public interface TrialAccountService {

    void saveTrialAccountDetails(TrialAccountDTO trialAccountDTO, Locale locale) throws AuthorityExistsException, UserExistsException, OrganizationNameExistsException;
}
