package invoiceCreator;

import java.math.BigDecimal;

public class TaxCount {

    private final BigDecimal tax = new BigDecimal(0.23);
    BigDecimal grossPrice;
    BigDecimal taxValue;

    public BigDecimal calculateTax(Product product) {
        taxValue = product.getPurchacePriceNet().multiply(tax);
        return taxValue;
    }

    public BigDecimal calculateGrossPrice(Product product) {
        grossPrice = new BigDecimal(0.0);
        grossPrice = product.getPurchacePriceNet().add(calculateTax(product));
        return grossPrice;
    }

    public BigDecimal getGrossPrice() {
        return grossPrice;
    }

    public BigDecimal getTaxValue() {
        return taxValue;
    }

}
