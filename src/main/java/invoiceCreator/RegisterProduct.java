package invoiceCreator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegisterProduct {

    private List<Product> productList = new ArrayList<>();
    String userChoice;

    public void registerProduct() {
        Scanner scanner = new Scanner(System.in);
        Product product = new Product();
        userChoice = scanner.nextLine();
        BigDecimal userChoice2 = new BigDecimal("scanner.nextBigDecimal()");
        System.out.println("Enter your product name and press enter");
        product.setName(userChoice);
        System.out.println("Enter your product catalog number and press enter");
        product.setCatalogNumber(userChoice);
        System.out.println("Enter your product purchace price net and press enter");
        product.setPurchacePriceNet(userChoice2);
        System.out.println("Enter how many pieces you want to add and press enter");
        product.setQuantity(userChoice2);
        productList.add(product);
    }

    public List<Product> getProductList() {
        return productList;
    }
}
