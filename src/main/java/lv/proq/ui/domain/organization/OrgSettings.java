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

    private Boolean isTrialAccount;
    private Boolean isArchiveEnabled;
    private Integer tabLimit;

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
}
