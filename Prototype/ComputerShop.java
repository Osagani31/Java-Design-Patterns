import java.util.ArrayList;

public class ComputerShop implements Cloneable{

    private  String shop;

    private ArrayList<Computer> computers;

    public  void InitializeComputers() {
        for (int i=0; i<100; i++){
            Computer computer = new Computer();
            computer.setBrand("Computer"+(i+1));
            computer.setModel(i);
            getComputers().add(computer);
        }

    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    public ArrayList<Computer> getComputers() {
        return computers;
    }

    public void setComputers(ArrayList<Computer> computers) {
        this.computers = computers;
    }

    @Override
    public String toString() {
        return "ComputerShop{" +
                "shop='" + shop + '\'' +
                ", computers=" + computers +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
       ComputerShop shop = new ComputerShop();
       for (Computer c:getComputers()){
           shop.getComputers().add(c);
       }
       return shop;
    }
}
