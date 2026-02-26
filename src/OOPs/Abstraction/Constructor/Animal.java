package OOPs.Abstraction.Constructor;

abstract class Animal {
    Animal(){
        System.out.println("Animal Constructor");
    }
    abstract void sound();
}
class Dog extends Animal{
    Dog(){
        System.out.println("Dog constructor");
    }
    void sound(){
        System.out.println("Dog Barks");
    }
}
class Driver{
    public static void main(String[] args) {
        Dog d=new Dog();
        d.sound();
    }
}

/*
Why does Abstract class have constructor?
->Constructors are used for initializing common data!
->When a child class object is initialized, the parent class constructor runs first
->Parent Constructor is getting executed because of inheritance not because of object creation
 */