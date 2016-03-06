package lv.proq.ui.transfer;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class TrialAccountDTO {

    @Size(min = 6, max = 20)
    private String userName;

    @Pattern(regexp=".+@.+\\..+")
    private String email;

    private String phone;

    @NotBlank
    private String country;

    @Size(min = 1, max = 20)
    private String password;

    @Size(min = 1, max = 20)
    private String businessName;

    private String webSite;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }
}
