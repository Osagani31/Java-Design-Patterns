public class ComputerBuilder {

    private String brand;

    private int ram;

    private double Display_Size ;

    private long Storage;

    public ComputerBuilder setBrand(String brand) {
         this.brand = brand;
         return this;
    }

    public ComputerBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public ComputerBuilder setDisplay_Size(double display_Size) {
        Display_Size = display_Size;
        return this;
    }

    public ComputerBuilder setStorage(long storage) {
        Storage = storage;
        return this;
    }

    public Computer getComputer() {
        return new Computer(brand,ram,Display_Size,Storage);
    }

}
