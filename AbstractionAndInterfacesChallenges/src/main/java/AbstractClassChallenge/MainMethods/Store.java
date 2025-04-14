package AbstractClassChallenge.MainMethods;

import AbstractClassChallenge.Items.GraphicTablet;
import AbstractClassChallenge.Items.MobilePhone;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Store {
    private static List<ProductForSale> product = new ArrayList<>();
    private static List<OrderItem> order = new ArrayList<>();

    public static void main(String[] args) {
        product.add(new MobilePhone("Xiaomi", new BigDecimal("280"), "Redmi 14C"));
        product.add(new GraphicTablet("Huion", new BigDecimal("498"), "Tablet for graphic designers"));

        System.out.println("==== Available products: ====");
        showAvailableProducts();

        addItemToOrder(product.get(0), 2);
        addItemToOrder(product.get(1), 5);

        System.out.println("\n=== RECEIPT ===");
        printOrderReceipt();
    }

    public static void addItemToOrder(ProductForSale product, int quantity) {
        order.add(new OrderItem(quantity, product));
    }

    public static void printOrderReceipt() {
        BigDecimal total = BigDecimal.ZERO;

        for (OrderItem item : order) {
            item.printLineItem();
            total = total.add(item.getTotalPrice());
        }
        System.out.printf("\nTotal amount: %.2f PLN\n", total.doubleValue());
    }

    private static void showAvailableProducts() {
        for (ProductForSale product : product) {
            product.showDetails();
        }
    }

}
