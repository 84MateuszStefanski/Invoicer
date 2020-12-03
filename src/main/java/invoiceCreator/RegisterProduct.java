package invoiceCreator;

import java.util.ArrayList;
import java.util.List;

public class RegisterProduct {

    private List<Product> productList = new ArrayList<>();

    public void registerProduct(Product product) {
        productList.add(product);
    }

    public List<Product> getProductList() {
        return productList;
    }
}
