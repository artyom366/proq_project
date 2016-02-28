package lv.proq.ui.domain.organization;

import javax.persistence.*;

/**
 * Created by Artyom on 1/16/2016.
 *
 */

@Entity
@Table(name = "org_locations")
public class OrgLocation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String iln;
    private belongTo belongTo;
    private String country;
    private String countryCode;
    private String city;
    private String street;
    private String houseNumber;
    private String officeNumber;
    private String postalCode;

    private enum belongTo {
        SELF,
        PARTNER
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIln() {
        return iln;
    }

    public void setIln(String iln) {
        this.iln = iln;
    }

    public OrgLocation.belongTo getBelongTo() {
        return belongTo;
    }

    public void setBelongTo(OrgLocation.belongTo belongTo) {
        this.belongTo = belongTo;
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
}
