package lv.proq.ui.domain.user;

import javax.persistence.*;

/**
 * Created by Artyom on 1/14/2016.
 */

@Entity
@Table(name = "user_phones")
public class UserPhone {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "phone")
    private String phone;

    @JoinColumn(name = "user")
    private User userName;

    public UserPhone() {
    }

    public UserPhone(String phone, User user) {
        this.phone = phone;
        this.userName = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public User getUser() {
        return userName;
    }

    public void setUser(User user) {
        this.userName = user;
    }
}
