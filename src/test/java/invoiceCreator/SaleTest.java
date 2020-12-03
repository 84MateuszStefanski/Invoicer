package invoiceCreator;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SaleTest {

    @Test
    void payForAll() throws Exception {

        //given
        Sale sale = new Sale();
        Product product = new Product("Nazwa", "Nr katalogowy", new BigDecimal("100"),new BigDecimal("5"));
        BigDecimal toPay = new BigDecimal("0");
        //when

        toPay = sale.payForAll(product, new BigDecimal("1"));

        //then

        assertThat(toPay.doubleValue()).isEqualTo(123.00);

    }
}