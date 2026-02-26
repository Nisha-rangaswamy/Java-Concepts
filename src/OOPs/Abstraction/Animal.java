package OOPs.Abstraction;

abstract class Animal {
    abstract void sound();
    void run(){
        System.out.println("Running");

    }
}
class Lion extends Animal{
    void sound(){
        System.out.println("Roars");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Meow");
    }
}

class Driver{
    public static void main(String[] args) {
        Lion l=new Lion();
        Cat c=new Cat();
        l.sound();
        l.run();
        c.sound();
        c.run();
    }
}