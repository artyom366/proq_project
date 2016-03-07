package lv.proq.ui.service;

import lv.proq.ui.domain.organization.Organization;
import lv.proq.ui.domain.user.User;
import lv.proq.ui.errors.OrganizationNameExistsException;
import lv.proq.ui.repository.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
                = organizationRepository.findOrganizationByName(organization.getName());

        if (entry == null) {
            return false;
        }

        return true;
    }

    @Override
    public List<Organization> findAllUsersByUsers(User user) {
        return organizationRepository.findAllUsersByUsers(user);
    }
}
