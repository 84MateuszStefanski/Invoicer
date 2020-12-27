package invoiceCreator;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;


public class Main {

    public static void main(String[] args) throws Exception {

        Client client = new Client("NazwaFirmy", "00-000", "Warszawa", "Ulica",
                "3a", "5552364785", "email@com.pl", 500079283L);

        Product product = new Product("Klucz pneumatyczny", "yt-0953",
                new BigDecimal("330.00"), new BigDecimal("10.00"));

        Product product2 = new Product("Zestaw kluczy torx", "yt-0512",
                new BigDecimal("25.00"), new BigDecimal("15.00"));


        RegisterClient registerClient = new RegisterClient();
        registerClient.registerClient(client);

        RegisterProduct registerProduct = new RegisterProduct();
        registerProduct.registerProduct(product);
        registerProduct.registerProduct(product2);
        System.out.println(registerProduct.getProductList());

        Sale sale = new Sale();
        TaxAndPriceCount taxAndPriceCount = new TaxAndPriceCount();
        DecimalFormat df = new DecimalFormat("#,###.00");
        System.out.println("Cena zakupu netto " + product.getPurchacePriceNet());
        System.out.println("Cena zakupu brutto " + df.format(taxAndPriceCount.calculateGrossPrice(product)));

        System.out.println("--------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------");

        System.out.print("Faktura nr: " + " " + sale.getInvoiceNr() + " ");
        System.out.print("       ");
        System.out.println("Data wystawienia: " + LocalDate.now());
        System.out.println(client.getCompanyName());
        System.out.println("Nip: " + client.getTaxIdNumber());

        System.out.println(product.getName() + " " + product.getCatalogNumber());
        System.out.println("Cena brutto za sztukę : " + df.format(taxAndPriceCount.calculateGrossRetailPrice(product)));
        System.out.println(product2.getName() + " " + product2.getCatalogNumber());
        System.out.println("Cena brutto za sztukę : " + df.format(taxAndPriceCount.calculateGrossRetailPrice(product2)));
        System.out.println("Do zapłaty:");
        System.out.println(df.format(sale.payForAll(product, new BigDecimal("3.0"))
                .add(sale.payForAll(product2, new BigDecimal("3.0")))));

        System.out.println("--------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------");

        //todo popracować nad narzucaniem marży 

        //todo przerobić metodę sale.payForAll tak by przyjmowałą dowolną liczbę produktów
        //todo ??przerobić zmienne quantity na typy proste i przerobić metodę payForAll żeby przyjmowała takie argumenty o ile taką praktykę się stosuje(do weryfikacji)
        //todo zrobić tak aby przy wydruku ilość sztuk była przyjmowana z argumentu a nie wpisywana ręcznie

    }
}
