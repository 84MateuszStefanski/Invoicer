package invoiceCreator;

import java.math.BigDecimal;
import java.util.Scanner;

public class Sale {

    private BigDecimal quantity = new BigDecimal(0);
    private int invoiceNr = 1;
    private BigDecimal payAll = new BigDecimal("0.0");
    Product product = new Product();
    Scanner sc = new Scanner(System.in);
    TaxAndPriceCount taxCount = new TaxAndPriceCount();

    // metoda zwraca pełną kwotę do zapłaty za jeden produkt
    public BigDecimal payForAll(Product product, BigDecimal quantity) throws Exception {

        TaxAndPriceCount taxAndPriceCount = new TaxAndPriceCount();
        double productQuantity = product.getQuantity().doubleValue();
        double saleQuantity = quantity.doubleValue();

        if (productQuantity >= saleQuantity) {
            payAll = taxAndPriceCount.calculateGrossRetailPrice(product).multiply(quantity);
            product.setQuantity(product.getQuantity().subtract(quantity));
            invoiceNr++;
        } else {
            throw new Exception("Brak produktu");
        }
        return payAll;
    }



//     metoda która ma liczyć całkowity koszt za kilka produktów
    public BigDecimal payForAllitems() throws Exception {

        BigDecimal payAllItems ;
        quantity = sc.nextBigDecimal();

        double productQuantity = product.getQuantity().doubleValue();
        double saleQuantity = quantity.doubleValue();

        if (productQuantity >= saleQuantity) {
            payAllItems = taxCount.calculateGrossRetailPrice(product).multiply(quantity);
            product.setQuantity(product.getQuantity().subtract(quantity));
            invoiceNr++;
        } else {
            throw new Exception("Out of stock");
        }
        return payAllItems;
    }


    public int getInvoiceNr() {
        return invoiceNr;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPayAll() {
        return payAll;
    }
}
