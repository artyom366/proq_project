package lv.proq.ui.domain.organization;

import javax.persistence.*;

/**
 * Created by Artyom on 1/14/2016.
 */

@Entity
@Table(name = "org_phones")
public class OrgPhone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "phone")
    private String phone;

    @ManyToOne
    @JoinColumn(name = "organization")
    private Organization organization;

    public OrgPhone() {
    }

    public OrgPhone(Organization organization) {
        this.organization = organization;
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

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }
}
