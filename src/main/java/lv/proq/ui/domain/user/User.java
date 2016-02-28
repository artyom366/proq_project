package lv.proq.ui.domain.user;



import javax.persistence.*;
import java.util.List;


/**
 * Created by Marina on 2/22/2016.
 */

@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(name = "username")
    private String username;

    @Column(name = "name")
    private String name;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "surname")
    private String surname;

    @Column(name = "password")
    private String password;

    @Column(name = "enabled")
    private Boolean enabled;

    @OneToMany(cascade = CascadeType.ALL)
    private List<UserEmail> emails;

    @OneToMany(cascade = CascadeType.ALL)
    private List<UserPhone> phones;

    @OneToOne(cascade = CascadeType.ALL)
    private UserSettings userSettings;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public List<UserEmail> getEmails() {
        return emails;
    }

    public void setEmails(List<UserEmail> emails) {
        this.emails = emails;
    }

    public List<UserPhone> getPhones() {
        return phones;
    }

    public void setPhones(List<UserPhone> phones) {
        this.phones = phones;
    }

    public UserSettings getUserSettings() {
        return userSettings;
    }

    public void setUserSettings(UserSettings userSettings) {
        this.userSettings = userSettings;
    }
}
