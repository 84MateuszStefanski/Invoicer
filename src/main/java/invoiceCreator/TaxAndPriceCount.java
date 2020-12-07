package invoiceCreator;

import java.math.BigDecimal;

public class TaxAndPriceCount {

    private final BigDecimal tax = new BigDecimal(0.23);
    private BigDecimal grossPrice;
    private BigDecimal taxValue;
    private BigDecimal margin = new BigDecimal("0.2");
    private BigDecimal netRetailPrice = new BigDecimal("0.0");
    private BigDecimal grossRetailPrice = new BigDecimal("0.0");

    //purchase price
    public BigDecimal calculateTax(Product product) {
        taxValue = product.getPurchacePriceNet().multiply(tax);
        return taxValue;
    }

    //purchase price
    public BigDecimal calculateGrossPrice(Product product) {
        grossPrice = product.getPurchacePriceNet().add(calculateTax(product));
        return grossPrice;
    }

    public BigDecimal calculateNetRetailPrice(Product product) {
        netRetailPrice = product.getPurchacePriceNet().add(product.getPurchacePriceNet().multiply(margin));
        return netRetailPrice;
    }

    public BigDecimal calculateGrossRetailPrice(Product product) {
        grossRetailPrice = calculateNetRetailPrice(product).add(netRetailPrice.multiply(tax));
        return grossRetailPrice;
    }



    public BigDecimal getGrossPrice() {
        return grossPrice;
    }

    public BigDecimal getTaxValue() {
        return taxValue;
    }

    public BigDecimal getNetRetailPrice() {
        return netRetailPrice;
    }

    public BigDecimal getGrossRetailPrice() {
        return grossRetailPrice;
    }
}
