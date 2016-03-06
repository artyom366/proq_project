package lv.proq.ui.domain.user;

import javax.persistence.*;

/**
 * Created by Artyom on 2/27/2016.
 */

@Entity
@Table(name = "authorities")
public class Authority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "username")
    private User username;

    @Column(name = "authority")
    private String authority;

    public Authority() {
    }

    public Authority(User username, String authority) {
        this.username = username;
        this.authority = authority;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUsername() {
        return username;
    }

    public void setUsername(User username) {
        this.username = username;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}
