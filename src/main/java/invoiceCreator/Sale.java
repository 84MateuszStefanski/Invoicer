package invoiceCreator;

import java.math.BigDecimal;

public class Sale {

    private Client client;
    private Product product;
    private BigDecimal quantity = new BigDecimal(0);
    private int invoiceNr = 1;


    // metoda zwraca pełną kwotę do zapłaty za jeden produkt
    public BigDecimal payForAll(Product product, BigDecimal quantity) throws Exception {

        BigDecimal payAll;
        TaxCount taxCount = new TaxCount();
        double productQuantity = product.getQuantity().doubleValue();
        double saleQuantity = quantity.doubleValue();

        if (productQuantity >= saleQuantity) {
            payAll = taxCount.calculateGrossPrice(product).multiply(quantity);
            product.setQuantity(product.getQuantity().subtract(quantity));
            invoiceNr++;
        } else {
            throw new Exception("Brak produktu");
        }
        return payAll;
    }

    public int getInvoiceNr() {
        return invoiceNr;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }
}
