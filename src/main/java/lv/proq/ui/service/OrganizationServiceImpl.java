package lv.proq.ui.service;

import lv.proq.ui.domain.organization.Organization;
import lv.proq.ui.errors.OrganizationNameExistsException;
import lv.proq.ui.repository.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrganizationServiceImpl implements OrganizationService {

    @Autowired
    private OrganizationRepository organizationRepository;

    @Override
    public void saveTrial(Organization organization) throws OrganizationNameExistsException {
        if (!isExists(organization)) {
            organizationRepository.save(organization);
        } else {
            throw new OrganizationNameExistsException();
        }
    }

    @Override
    public boolean isExists(Organization organization) {
        Organization entry
                = organizationRepository.findOrganizationByName(organization);

        if (entry == null) {
            return false;
        }

        return true;
    }
}
