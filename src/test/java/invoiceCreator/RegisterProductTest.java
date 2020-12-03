package invoiceCreator;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RegisterProductTest {

    @Test
    void shouldRegisterProduct() {

        //given
        RegisterProduct registerProduct = new RegisterProduct();
        Product product = new Product("Nazwa", "Nr katalogowy", new BigDecimal("100"),new BigDecimal("5"));

        //when
        registerProduct.registerProduct(product);

        //then
        assertThat(registerProduct.getProductList().size()).isEqualTo(1);

    }

    @Test
    void shouldRegisterManyProducts() {

        //given
        RegisterProduct registerProduct = new RegisterProduct();
        Product product = new Product("Nazwa", "Nr katalogowy", new BigDecimal("100"),new BigDecimal("15"));
        Product product1 = new Product("Nazw", "Nr kat", new BigDecimal("10"),new BigDecimal("52"));
        Product product2 = new Product("Naz", "Nr katal", new BigDecimal("1000"),new BigDecimal("3"));
        Product product3 = new Product("Na", "Nr k", new BigDecimal("1"),new BigDecimal("12"));
        Product product4 = new Product("N", "Nr katalog", new BigDecimal("100"),new BigDecimal("5"));

        //when
        registerProduct.registerProduct(product);
        registerProduct.registerProduct(product1);
        registerProduct.registerProduct(product2);
        registerProduct.registerProduct(product3);
        registerProduct.registerProduct(product4);

        //then
        assertThat(registerProduct.getProductList().size()).isEqualTo(5);

    }

}