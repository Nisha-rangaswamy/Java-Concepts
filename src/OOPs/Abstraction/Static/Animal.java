package OOPs.Abstraction.Static;

abstract class Animal {
    static void info(){
        System.out.println("Animals are living beings");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Barks");
    }
}
class Driver{
    public static void main(String[] args) {
        Animal.info();
        Dog d=new Dog();
        d.sound();
    }
}