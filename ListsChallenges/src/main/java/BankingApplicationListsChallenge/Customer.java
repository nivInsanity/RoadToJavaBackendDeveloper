package BankingApplicationListsChallenge;

import lombok.Data;
import java.util.ArrayList;

@Data
public class Customer {
    public String name;
    //positive transactions are credit, negative are debit
    ArrayList<Double> listOfTransactions;

    public Customer(String name) {
        this.name = name;
        this.listOfTransactions = new ArrayList<>();
    }
}
