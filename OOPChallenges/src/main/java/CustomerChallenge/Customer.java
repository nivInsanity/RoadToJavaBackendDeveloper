package CustomerChallenge;

import java.math.BigDecimal;

public class Customer {

    private final String name;
    private BigDecimal creditLimit;
    private String emailAddress;

    public String getName() {
        return name;
    }

    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public Customer(String name, BigDecimal creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public Customer() {
        this("Unknown name", BigDecimal.ZERO, "Unknown email address.");
    }

    public Customer(String name, String emailAddress) {
        this(name, BigDecimal.ZERO, emailAddress);
    }

}
