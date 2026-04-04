public class Computer {

    private String brand;

    private int ram;

    private double Display_Size ;

    private long Storage;

    public Computer(String brand, int ram, double display_Size, long storage) {
        this.brand = brand;
        this.ram = ram;
        Display_Size = display_Size;
        Storage = storage;
    }

    @Override
    public String toString() {
        return "ComputerShop{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", Display_Size=" + Display_Size +
                ", Storage=" + Storage +
                '}';
    }
}
