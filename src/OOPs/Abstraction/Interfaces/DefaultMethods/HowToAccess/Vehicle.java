package OOPs.Abstraction.Interfaces.DefaultMethods.HowToAccess;

public interface Vehicle {
    default void start(){
        System.out.println("Vehicle started");
    }
}

class Car implements Vehicle{
    void CarFunction(){
        System.out.println("Car Started");
    }
}

class Bike implements Vehicle{
    public void start(){
        System.out.println("Bike Started");
    }
}

class Driver{
    public static void main(String[] args) {
        Vehicle v1= new Car();
        v1.start();

        Vehicle v2=  new Bike();
        v2.start();
    }
}
