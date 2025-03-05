package CustomerChallenge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class CustomerTest {

    @Test
    void FullCustomerConstructor() {
        Customer customer = new Customer("Cory", BigDecimal.valueOf(10000.00), "randy@lahey.com");

        String name = customer.getName();
        BigDecimal limit = customer.getCreditLimit();
        String email = customer.getEmailAddress();

        Assertions.assertEquals("Cory", name);
        Assertions.assertEquals(BigDecimal.valueOf(10000.00), limit);
        Assertions.assertEquals("randy@lahey.com", email);
    }

    @Test
    void NoArgsCustomerConstructor() {
        Customer customer = new Customer();

        String name = customer.getName();
        BigDecimal limit = customer.getCreditLimit();
        String email = customer.getEmailAddress();

        Assertions.assertEquals("Unknown name", name);
        Assertions.assertEquals(BigDecimal.ZERO, limit);
        Assertions.assertEquals("Unknown email address.", email);
    }

    @Test
    void NoLimitCustomerConstructor() {
        Customer customer = new Customer("Cory", "randy@lahey.com");

        String name = customer.getName();
        BigDecimal limit = customer.getCreditLimit();
        String email = customer.getEmailAddress();

        Assertions.assertEquals("Cory", name);
        Assertions.assertEquals(BigDecimal.ZERO, limit);
        Assertions.assertEquals("randy@lahey.com", email);
    }
}