package lv.proq.ui.domain.organization;

import lv.proq.ui.domain.user.User;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Artyom on 1/10/2016.
 */

@Entity
@Table(name = "organizations")
public class Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String registrationNumber;
    private String vatNumber;
    private String iln;
    private Float defaultTaxRate;
    private Boolean enabled;

    @OneToMany(cascade = CascadeType.ALL)
    private List<OrgAddress> addresses;

    @OneToMany(cascade = CascadeType.ALL)
    private List<OrgEmail> emails;

    @OneToMany(cascade = CascadeType.ALL)
    private List<OrgLocation> locations;

    @OneToMany(cascade = CascadeType.ALL)
    private List<OrgPhone> phones;

    @OneToMany(cascade = CascadeType.ALL)
    private List<User> users;

    @OneToOne(cascade = CascadeType.ALL)
    private OrgSettings orgSettings;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getVatNumber() {
        return vatNumber;
    }

    public void setVatNumber(String vatNumber) {
        this.vatNumber = vatNumber;
    }

    public String getIln() {
        return iln;
    }

    public void setIln(String iln) {
        this.iln = iln;
    }

    public Float getDefaultTaxRate() {
        return defaultTaxRate;
    }

    public void setDefaultTaxRate(Float defaultTaxRate) {
        this.defaultTaxRate = defaultTaxRate;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public List<OrgAddress> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<OrgAddress> addresses) {
        this.addresses = addresses;
    }

    public List<OrgEmail> getEmails() {
        return emails;
    }

    public void setEmails(List<OrgEmail> emails) {
        this.emails = emails;
    }

    public List<OrgLocation> getLocations() {
        return locations;
    }

    public void setLocations(List<OrgLocation> locations) {
        this.locations = locations;
    }

    public List<OrgPhone> getPhones() {
        return phones;
    }

    public void setPhones(List<OrgPhone> phones) {
        this.phones = phones;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public OrgSettings getOrgSettings() {
        return orgSettings;
    }

    public void setOrgSettings(OrgSettings orgSettings) {
        this.orgSettings = orgSettings;
    }
}
