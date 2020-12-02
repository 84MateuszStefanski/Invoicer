package invoiceCreator;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws Exception{

        Client client = new Client("NazwaFirmy","00-000","Warszawa", "Ulica",
                "3a","5552364785","email@com.pl",500079283L);

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
        TaxCount taxCount = new TaxCount();
        DecimalFormat df = new DecimalFormat("#,###.00");

        System.out.println("Faktura nr: " + " " + sale.getInvoiceNr());
        System.out.println("Data wystawienia: " + LocalDate.now());
        System.out.println(product.getName() + " " + product.getCatalogNumber());
        System.out.println("Cena brutto za sztukę : " + df.format(taxCount.calculateGrossPrice(product)));
        System.out.println("Do zapłaty:");
        System.out.println(df.format(sale.payForAll(product, new BigDecimal("1.0"))));

      //  System.out.println(df.format(sale.payForAllitems(new BigDecimal("5.0"), product, product2)));

        //todo przerobić metodę sale.payForAll tak by przyjmowałą dowolną liczbę produktów
        //todo przerobić zmienne quantity na typy proste i przerobić metodę payForAll żeby przyjmowała takie argumenty
        //todo zrobić tak aby przy wydruku ilość sztuk była przyjmowana z argumentu a nie wpisywana ręcznie

        System.out.println(product.equals(product2));
        System.out.println(product.hashCode());
        System.out.println(product2.hashCode());

        //poniżej kod treningowy nie związany z apliakcją





        try {
            Formatter f = new Formatter("D:\\Programowanie\\Java.Workplace\\test.txt");
            f.format("%s %s %s", "1","John", "Smith \r\n");
            f.format("%s %s %s", "2","Amy", "Brown \r\n");
            f.format("%s"," Legia Warszawa");
            f.close();
        } catch (Exception e) {
            System.out.println("Error");
        }


        try {
            File x = new File("D:\\Programowanie\\Java.Workplace\\test.txt");
            Scanner sc = new Scanner(x);
            while(sc.hasNext()) {
                System.out.println(sc.next());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error");
        }


        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 6; i++) {
            list.add(i);
        }
        int x = 0;
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            x+= it.next();
        }
        System.out.println(x);

        int f=1, i=2;
        while(++i<5)
            f*=i;
        System.out.println(f);

















    }
}
