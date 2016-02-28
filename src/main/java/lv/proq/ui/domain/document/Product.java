package lv.proq.ui.domain.document;

import lv.proq.ui.domain.organization.Organization;
import lv.proq.ui.domain.rebate.IRebate;

import java.util.Date;
import java.util.List;

/**
 * Created by Artyom on 1/16/2016.
 */
public class Product {

    private String id;

    private Organization orgId;

    private String ean;

    private String description;

    private Float unitPackSize;

    private unitOfMeasure unitOfMeasure;

    private List<Quantity> quantities;

    private List<Code> codes;

    private List<Weight> weights;

    private List<Price> prices;

    private List<Amount> amounts;

    private List<IRebate> discount;

    private Float taxRate;

    private String taxCategoryCode;

    private String taxReference;

    private Float stock;

    private Date expiration;

    private List<Remark> remarks;


    private enum codeType {
        SENDER,
        RECEIVER,
        BATCH_NUMBER,
        SERIAL_NUMBER,
    }

    private enum quantityType {
        QUANTITY,
        QUANTITY_ORDERED,
        QUANTITY_DISPATCHED,
        QUANTITY_RECEIVED,
        QUANTITY_ACCEPTED
    }

    private enum margin {
        NET,
        GROSS,
        TAX
    }

    private enum unitOfMeasure {
        BOX,
        PCE,
        KGM
    }


    public class Code {

        private codeType codeType;
        private String code;

        public Product.codeType getCodeType() {
            return codeType;
        }

        public void setCodeType(Product.codeType codeType) {
            this.codeType = codeType;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }
    }

    public class Quantity {

        private quantityType quantityType;
        private Float quantity;

        public Product.quantityType getQuantityType() {
            return quantityType;
        }

        public void setQuantityType(Product.quantityType quantityType) {
            this.quantityType = quantityType;
        }

        public Float getQuantity() {
            return quantity;
        }

        public void setQuantity(Float quantity) {
            this.quantity = quantity;
        }
    }

    public class Weight {

        private margin margin;
        private Float weight;

        public margin getMargin() {
            return margin;
        }

        public void setMargin(margin margin) {
            this.margin = margin;
        }

        public Float getWeight() {
            return weight;
        }

        public void setWeight(Float weight) {
            this.weight = weight;
        }
    }

    public class Price {

        private margin margin;
        private Float price;

        public Product.margin getMargin() {
            return margin;
        }

        public void setMargin(Product.margin margin) {
            this.margin = margin;
        }

        public Float getPrice() {
            return price;
        }

        public void setPrice(Float price) {
            this.price = price;
        }
    }

    public class Amount {

        private margin margin;
        private Float value;

        public Product.margin getMargin() {
            return margin;
        }

        public void setMargin(Product.margin margin) {
            this.margin = margin;
        }

        public Float getValue() {
            return value;
        }

        public void setValue(Float value) {
            this.value = value;
        }
    }

    public class Remark {
        private String key;
        private String value;
    }

}
