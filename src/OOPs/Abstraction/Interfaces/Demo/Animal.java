package OOPs.Abstraction.Interfaces.Demo;

public interface Animal {
    void sound();
    default void run(){
        //we can write body using default
    }
}
class Lion implements Animal{
    public void sound(){
        System.out.println("Roar");
    }
    public void run(){
        System.out.println("Running...");
    }
}
class Driver{
    public static void main(String[] args) {
        Lion l=new Lion();
        l.sound();
        l.run();
    }
}