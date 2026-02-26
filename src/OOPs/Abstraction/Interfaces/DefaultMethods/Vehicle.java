package OOPs.Abstraction.Interfaces.DefaultMethods;

public interface Vehicle {
    void start();

    default void stop(){
        System.out.println("Engine stopped");
    }
}
class Audi implements Vehicle{
    public void start(){
        System.out.println("Audi has started");
    }
}
class BMW implements Vehicle{
    public void start(){
        System.out.println("BMW has started");
    }
}
class RollsRoyce implements Vehicle{
    public void start(){
        System.out.println("RollsRoyce has started");
    }
}
class Driver{
    public static void main(String[] args) {
        Audi c1=new Audi();
        c1.start();
        c1.stop();

        BMW c2=new BMW();
        c2.start();
        c2.stop();

        RollsRoyce c3=new RollsRoyce();
        c3.start();
        c3.stop();
    }
}
