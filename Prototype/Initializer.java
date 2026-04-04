public class Initializer {

    public static void main(String[] args) throws CloneNotSupportedException {
        ComputerShop shop1 = new ComputerShop();
        shop1.setShop("Colombo");
        shop1.InitializeComputers();
        //typecasting by using (ComputerShop)because clone() returns Object
        ComputerShop shop2 = (ComputerShop) shop1.clone();
        shop1.setShop("Kandy");

        System.out.println(shop1);
        System.out.println(shop2);

    }
}
