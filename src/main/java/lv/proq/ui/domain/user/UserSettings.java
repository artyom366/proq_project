package lv.proq.ui.domain.user;

import lv.proq.ui.domain.organization.Organization;

import javax.persistence.*;


@Entity
@Table(name = "user_settings")
public class UserSettings {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "locale")
    private String locale;

    @OneToOne(cascade=CascadeType.ALL)
    private Organization defaultOrganization;

    @ManyToOne
    @JoinColumn(name = "username")
    private User userName;

    public UserSettings() {
    }

    public UserSettings(String locale, Organization defaultOrganization, User userName) {
        this.locale = locale;
        this.defaultOrganization = defaultOrganization;
        this.userName = userName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public Organization getDefaultOrganization() {
        return defaultOrganization;
    }

    public void setDefaultOrganization(Organization defaultOrganization) {
        this.defaultOrganization = defaultOrganization;
    }

    public User getUserName() {
        return userName;
    }

    public void setUserName(User userName) {
        this.userName = userName;
    }
}
