public class ComputerShop {



    public static void main(String[] args) {

        Computer dilshanC=new ComputerBuilder().setBrand("Asus")
                                        .setRam(16)
                                        .getComputer();
        Computer dilshanC2=new Computer("Dell",16,15.6,512);

        System.out.println(dilshanC);
        System.out.println(dilshanC2);

    }

}
