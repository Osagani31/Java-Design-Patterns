public abstract class WorkShop {


    protected Engine engine;

    public WorkShop(Engine engine){
        this.engine = engine;
    }

    abstract void setType();

    abstract void setSpeed();

    public void process(){
        setType();
        setSpeed();
        engine.assemble();
        System.out.println("Processing...");
    }

}
