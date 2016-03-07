package lv.proq.ui.service;


import lv.proq.ui.domain.organization.Organization;
import lv.proq.ui.domain.user.User;
import lv.proq.ui.errors.OrganizationNameExistsException;

import java.util.List;

public interface OrganizationService {
    void saveTrial(Organization organization) throws OrganizationNameExistsException;
    boolean isExists(Organization organization);
    List<Organization> findAllUsersByUsers(User user);
}
