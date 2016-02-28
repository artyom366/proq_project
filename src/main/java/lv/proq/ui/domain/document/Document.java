package lv.proq.ui.domain.document;


import lv.proq.ui.domain.organization.OrgAddress;
import lv.proq.ui.domain.organization.Organization;
import org.springframework.data.annotation.Id;
//import org.springframework.data.couchbase.core.mapping.Field;

import java.util.Date;
import java.util.List;


/**
 * Created by Artyom on 1/12/2016.
 */

//@org.springframework.data.couchbase.core.mapping.Document(expiry = 0)
public class Document {

    //@Id
    private String id;

    //@Field
    private String number;

    private type type;

    private Integer nameCode;

    private source documentSource;

    private currency currency;

    private Integer functionCode;

    private Date documentDate;

    private Date receivedDate;

    private Date deliveryDate;

    private Date paymentDueDate;

    private List<Reference> references;

    private List<Party> parties;

    private OrgAddress orgAddress;

    private List<Product> products;

    private Integer totalLines;

    private List<Summary> summaries;

    private List<Tax> taxes;

    private Boolean estimateLines;

    private Boolean estimateSummary;

    private List<Remark> remarks;

    private List<Attachment> attachments;



    private enum type {
        ORDER,
        ORDRSP,
        DESADV,
        RECADV,
        INVOCE,
        RETANN,
        SLSRPT,
        INVRPT,
        LOCCAT,
        DELCAT,
        PRODCAT,
        PRICAT,
        HANMOV
    }

    private enum source {
        HTTP,
        WEB
    }

    private enum currency {
        EUR,
        USD,
        RUR
    }

    private enum role {
        SENDER,
        RECEIVER,
        BUYER,
        SELLER,
        PAYER,
        PAYEE,
        INVOICE,
        SHIP_FROM,
        ULTIMATE_CUSTOMER
    }

    private enum totalType {
        QUANTITY,
        NET_AMOUNT,
        TAX_AMOUNT,
        GROSS_AMOUNT,
        NET_WEIGHT,
        GROSS_WEIGHT,
        DISCOUNT
    }



    public class Reference {

        private String id;
        private String number;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }
    }

    public class Party {

        private Organization organization;
        private role role;

        public Organization getOrganization() {
            return organization;
        }

        public void setOrganization(Organization organization) {
            this.organization = organization;
        }

        public Document.role getRole() {
            return role;
        }

        public void setRole(Document.role role) {
            this.role = role;
        }
    }

    public class Remark {
        private String key;
        private String value;

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    public class Summary {

        private totalType totalType;
        private Float total;

        public Document.totalType getTotalType() {
            return totalType;
        }

        public void setTotalType(Document.totalType totalType) {
            this.totalType = totalType;
        }

        public Float getTotal() {
            return total;
        }

        public void setTotal(Float total) {
            this.total = total;
        }
    }

    public class Tax {

        private Float taxRate;
        private Float taxAmount;
        private Float taxableAmount;
        private String taxCategoryCode;

        public Float getTaxRate() {
            return taxRate;
        }

        public void setTaxRate(Float taxRate) {
            this.taxRate = taxRate;
        }

        public Float getTaxAmount() {
            return taxAmount;
        }

        public void setTaxAmount(Float taxAmount) {
            this.taxAmount = taxAmount;
        }

        public Float getTaxableAmount() {
            return taxableAmount;
        }

        public void setTaxableAmount(Float taxableAmount) {
            this.taxableAmount = taxableAmount;
        }

        public String getTaxCategoryCode() {
            return taxCategoryCode;
        }

        public void setTaxCategoryCode(String taxCategoryCode) {
            this.taxCategoryCode = taxCategoryCode;
        }
    }

    public class Attachment {

        private String type;
        private String encoding;
        private String name;
        private String content;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getEncoding() {
            return encoding;
        }

        public void setEncoding(String encoding) {
            this.encoding = encoding;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Document.type getType() {
        return type;
    }

    public void setType(Document.type type) {
        this.type = type;
    }

    public Integer getNameCode() {
        return nameCode;
    }

    public void setNameCode(Integer nameCode) {
        this.nameCode = nameCode;
    }

    public source getDocumentSource() {
        return documentSource;
    }

    public void setDocumentSource(source documentSource) {
        this.documentSource = documentSource;
    }

    public Document.currency getCurrency() {
        return currency;
    }

    public void setCurrency(Document.currency currency) {
        this.currency = currency;
    }

    public Integer getFunctionCode() {
        return functionCode;
    }

    public void setFunctionCode(Integer functionCode) {
        this.functionCode = functionCode;
    }

    public Date getDocumentDate() {
        return documentDate;
    }

    public void setDocumentDate(Date documentDate) {
        this.documentDate = documentDate;
    }

    public Date getReceivedDate() {
        return receivedDate;
    }

    public void setReceivedDate(Date receivedDate) {
        this.receivedDate = receivedDate;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public Date getPaymentDueDate() {
        return paymentDueDate;
    }

    public void setPaymentDueDate(Date paymentDueDate) {
        this.paymentDueDate = paymentDueDate;
    }

    public List<Reference> getReferences() {
        return references;
    }

    public void setReferences(List<Reference> references) {
        this.references = references;
    }

    public List<Party> getParties() {
        return parties;
    }

    public void setParties(List<Party> parties) {
        this.parties = parties;
    }

    public OrgAddress getOrgAddress() {
        return orgAddress;
    }

    public void setOrgAddress(OrgAddress orgAddress) {
        this.orgAddress = orgAddress;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Integer getTotalLines() {
        return totalLines;
    }

    public void setTotalLines(Integer totalLines) {
        this.totalLines = totalLines;
    }

    public List<Summary> getSummaries() {
        return summaries;
    }

    public void setSummaries(List<Summary> summaries) {
        this.summaries = summaries;
    }

    public List<Tax> getTaxes() {
        return taxes;
    }

    public void setTaxes(List<Tax> taxes) {
        this.taxes = taxes;
    }

    public Boolean getEstimateLines() {
        return estimateLines;
    }

    public void setEstimateLines(Boolean estimateLines) {
        this.estimateLines = estimateLines;
    }

    public Boolean getEstimateSummary() {
        return estimateSummary;
    }

    public void setEstimateSummary(Boolean estimateSummary) {
        this.estimateSummary = estimateSummary;
    }

    public List<Remark> getRemarks() {
        return remarks;
    }

    public void setRemarks(List<Remark> remarks) {
        this.remarks = remarks;
    }

    public List<Attachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }
}
