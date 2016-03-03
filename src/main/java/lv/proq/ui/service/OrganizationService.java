package lv.proq.ui.service;


import lv.proq.ui.domain.organization.Organization;
import lv.proq.ui.errors.OrganizationNameExistsException;

public interface OrganizationService {
    void saveTrial(Organization organization) throws OrganizationNameExistsException;

    boolean isExists(Organization organization);
}
