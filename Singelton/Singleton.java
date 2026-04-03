public class Singleton {

private static Singleton singleton;

private Singleton(){

}

public static Singleton getInstance(){
    if (singleton==null){
        return singleton=new Singleton();
    }
    return singleton;

}



}
