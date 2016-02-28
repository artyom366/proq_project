package lv.proq.ui.domain.document;

import lv.proq.ui.domain.organization.Organization;

import java.util.Date;
import java.util.List;

/**
 * Created by Artyom on 1/14/2016.
 */
public class Matching {

    private String id;

    private Organization orgId;

    private String connectionId;

    private Date created;

    private Date updated;

    private List<Match> match;



    public class Match {

        private String property;
        private String value;
        private List<To> to;

        public String getProperty() {
            return property;
        }

        public void setProperty(String property) {
            this.property = property;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public List<To> getTo() {
            return to;
        }

        public void setTo(List<To> to) {
            this.to = to;
        }

        public class To {

            private String property;

            private String value;

            public String getProperty() {
                return property;
            }

            public void setProperty(String property) {
                this.property = property;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }
        }
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Organization getOrgId() {
        return orgId;
    }

    public void setOrgId(Organization orgId) {
        this.orgId = orgId;
    }

    public String getConnectionId() {
        return connectionId;
    }

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    public List<Match> getMatch() {
        return match;
    }

    public void setMatch(List<Match> match) {
        this.match = match;
    }



}
