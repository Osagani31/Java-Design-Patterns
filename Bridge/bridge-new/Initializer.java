public class Initializer {
    public static void main(String[] args) {
        USAWorkShop usaWorkShop=new USAWorkShop(new Bmw());
        usaWorkShop.process();

        JapanWorkShop japanWorkShop=new JapanWorkShop(new Audi());
        japanWorkShop.process();

    }

}
