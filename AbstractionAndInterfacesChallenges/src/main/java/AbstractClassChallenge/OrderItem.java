package AbstractClassChallenge;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class OrderItem {
    private int quantity;
    private ProductForSale productForSale;
}
