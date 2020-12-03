package invoiceCreator;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.text.DecimalFormat;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TaxCountTest {

    @Test
    void shouldCalculateTax() {
        //given
        Product product = new Product("Nazwa", "Nr katalogowy", new BigDecimal("100"), new BigDecimal("5"));
        BigDecimal tax = new BigDecimal(0.23);
        DecimalFormat df = new DecimalFormat("#,###.00");
        TaxCount taxCount = new TaxCount();

        //when
        BigDecimal result = taxCount.calculateTax(product);

        //then
        assertThat(result).isEqualTo(new BigDecimal("23.0000000000000009992007221626408863812685012817382812500"));
        // assertThat(result).isCloseTo(new BigDecimal("23.00"),new BigDecimal("0.1"));
        // assertEquals(new BigDecimal("23").stripTrailingZeros(), result.stripTrailingZeros());
        assertEquals(23, result.intValue());
    }

    @Test
    void shouldCalculateGrossPrice() {

        //given
        Product product = new Product("Nazwa", "Nr katalogowy", new BigDecimal("100"), new BigDecimal("5"));
        BigDecimal tax = new BigDecimal(0.23);
        TaxCount taxCount = new TaxCount();

        //when
        BigDecimal result = taxCount.calculateGrossPrice(product);

        //then
        assertThat(result).isEqualTo(new BigDecimal("123.0000000000000009992007221626408863812685012817382812500"));
        assertEquals(123, result.intValue());


    }
}