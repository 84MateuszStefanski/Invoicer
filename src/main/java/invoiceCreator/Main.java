package invoiceCreator;

import javax.xml.crypto.Data;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws Exception{

        Client client = new Client("NazwaFirmy","00-000","Warszawa", "Ulica",
                "3a","5552364785","email@com.pl",500079283L);

        Product product = new Product("Klucz pneumatyczny", "yt-0953",
                new BigDecimal("330.00"), new BigDecimal("10.00"));

        RegisterClient registerClient = new RegisterClient();
        registerClient.registerClient(client);

        RegisterProduct registerProduct = new RegisterProduct();
        registerProduct.registerProduct(product);

        Sale sale = new Sale();
        TaxCount taxCount = new TaxCount();
        DecimalFormat df = new DecimalFormat("#,###.00");

        System.out.println("Faktura nr: " + " " + sale.getInvoiceNr());
        System.out.println("Data wystawienia: " + LocalDate.now());
        System.out.println(product.getName() + " " + product.getCatalogNumber());
        System.out.println("Cena brutto za sztukę : " + df.format(taxCount.calculateGrossPrice(product)));
        System.out.println("Do zapłaty:");
        System.out.println(df.format(sale.payForAll(product, new BigDecimal("5.0"))));

        //todo przerobić metodę sale.payForAll tak by przyjmowałą dowolną liczbę produktów
        //todo przerobić zmienne quantity na typy proste i przerobić metodę payForAll żeby przyjmowała takie argumenty
        //todo zrobić tak aby przy wydruku ilość sztuk była przyjmowana z argumentu a nie wpisywana ręcznie







    }
}