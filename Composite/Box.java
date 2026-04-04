import java.util.ArrayList;
import java.util.List;

public class Box {

    private List<Product> products;
    private List<Box> boxes;


    public Box(List<Box> boxes, List<Product> products) {
        this.products = products;
        this.boxes = boxes;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Box> getBoxes() {
        return boxes;
    }

    public void setBoxes(List<Box> boxes) {
        this.boxes = boxes;
    }

    public double CalculateCost() {

        double sum=products.stream().mapToDouble(
                Product::getCost
        )
                .sum();
        for(Box box:boxes) {
            sum+=box.CalculateCost();
        }
        return sum;
    }
}
