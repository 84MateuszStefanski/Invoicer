package invoiceCreator;

import java.math.BigDecimal;

public class Product {

    private String name;
    private String catalogNumber;
    private BigDecimal purchacePriceNet;
    private BigDecimal quantity;

    public Product(String name, String catalogNumber, BigDecimal purchacePriceNet, BigDecimal quantity) {
        this.name = name;
        this.catalogNumber = catalogNumber;
        this.purchacePriceNet = purchacePriceNet;
        this.quantity = quantity;
    }

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

}
