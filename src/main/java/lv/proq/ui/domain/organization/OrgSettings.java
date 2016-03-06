package lv.proq.ui.domain.organization;

import javax.persistence.*;

/**
 * Created by Artyom on 2/7/2016.
 */

@Entity
@Table(name = "org_settings")
public class OrgSettings {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "is_trial_account")
    private Boolean isTrialAccount;

    @Column(name = "is_archive_enabled")
    private Boolean isArchiveEnabled;

    @Column(name = "tab_limit")
    private Integer tabLimit;

    @ManyToOne
    @JoinColumn(name = "organization")
    private Organization organization;

    public OrgSettings() {
    }

    public OrgSettings(Organization organization) {
        this.organization = organization;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getIsTrialAccount() {
        return isTrialAccount;
    }

    public void setIsTrialAccount(Boolean isTrialAccount) {
        this.isTrialAccount = isTrialAccount;
    }

    public Boolean getIsArchiveEnabled() {
        return isArchiveEnabled;
    }

    public void setIsArchiveEnabled(Boolean isArchiveEnabled) {
        this.isArchiveEnabled = isArchiveEnabled;
    }

    public Integer getTabLimit() {
        return tabLimit;
    }

    public void setTabLimit(Integer tabLimit) {
        this.tabLimit = tabLimit;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }
}
