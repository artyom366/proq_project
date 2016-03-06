package lv.proq.ui.domain.organization;

import javax.persistence.*;

/**
 * Created by Artyom on 1/14/2016.
 */

@Entity
@Table(name = "org_emails")
public class OrgEmail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "email")
    private String email;

    @ManyToOne
    @JoinColumn(name = "organization")
    private Organization organization;

    public OrgEmail() {
    }

    public OrgEmail(Organization organization) {
        this.organization = organization;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }
}
