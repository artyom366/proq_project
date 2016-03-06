package lv.proq.ui.domain.organization;

import javax.persistence.*;

/**
 * Created by Artyom on 1/14/2016.
 */

@Entity
@Table(name = "org_address")
public class OrgAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "county")
    private String country;

    @Column(name = "country_code")
    private String countryCode;

    @Column(name = "city")
    private String city;

    @Column(name = "street")
    private String street;

    @Column(name = "house_number")
    private String houseNumber;

    @Column(name = "office_number")
    private String officeNumber;

    @Column(name = "postal_code")
    private String postalCode;

    @ManyToOne
    @JoinColumn(name = "organization")
    private Organization organization;

    public OrgAddress() {
    }

    public OrgAddress(Organization organization) {
        this.organization = organization;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }
}