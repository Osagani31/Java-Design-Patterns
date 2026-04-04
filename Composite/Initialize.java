import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
public class Initialize {

    public static void main(String[] args) {
        Box box=new Box(
                Arrays.asList(
                        new Box(
                                Collections.emptyList(),
                                Arrays.asList(
                                        new Product("Shoes", 100),
                                        new Product("Umbrella", 200),
                                        new Product("Wallet", 300)
                                )
                        ),
                        new Box(
                                Collections.emptyList(),
                                Arrays.asList(
                                        new Product("Phone", 1000),
                                        new Product("Shirt", 2000),
                                        new Product("Bag", 3000)
                                )
                        )
                ),
                Collections.emptyList() // Added missing argument for products
        );

        double cost=box.CalculateCost();
        System.out.println("Total cost: " + cost);
    }



}