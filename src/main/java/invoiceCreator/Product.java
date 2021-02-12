package invoiceCreator;

import java.math.BigDecimal;

public class Product {

    private String name;
    private String catalogNumber;
    private BigDecimal purchacePriceNet;
    private BigDecimal quantity;

    

    public String getName() {
        return name;
    }

    public String getCatalogNumber() {
        return catalogNumber;
    }

    public BigDecimal getPurchacePriceNet() {
        return purchacePriceNet;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCatalogNumber(String catalogNumber) {
        this.catalogNumber = catalogNumber;
    }

    public void setPurchacePriceNet(BigDecimal purchacePriceNet) {
        this.purchacePriceNet = purchacePriceNet;
    }
}
