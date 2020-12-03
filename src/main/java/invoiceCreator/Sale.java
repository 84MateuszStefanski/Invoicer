package invoiceCreator;

import java.math.BigDecimal;

public class Sale {

    private BigDecimal quantity = new BigDecimal(0);
    private int invoiceNr = 1;

    // metoda zwraca pełną kwotę do zapłaty za jeden produkt
    public BigDecimal payForAll(Product product, BigDecimal quantity) throws Exception {

        BigDecimal payAll;
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

    // metoda która ma liczyć całkowity koszt za kilka produktów
//    public BigDecimal payForAllitems(BigDecimal quantity, Product... products) throws Exception {
//
//        BigDecimal payAllItems ;
//        TaxAndPriceCount taxCount = new TaxAndPriceCount();
//        double productQuantity = product.getQuantity().doubleValue();
//        double saleQuantity = quantity.doubleValue();
//
//        if (productQuantity >= saleQuantity) {
//            for(int i = 0; i < products.length; i++){
//            payAllItems = taxCount.calculateGrossPrice(product).multiply(quantity);
//            product.setQuantity(product.getQuantity().subtract(quantity));
//            invoiceNr++;}
//        } else {
//            throw new Exception("Brak produktu");
//        }
//        return payAllItems;
//    }


    public int getInvoiceNr() {
        return invoiceNr;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }
}
