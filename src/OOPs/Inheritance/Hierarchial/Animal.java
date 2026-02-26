package OOPs.Inheritance.Hierarchial;

public class Animal {
    void eat(){
        System.out.println("Eating...");
    }
}
class Lion extends Animal {
    void roar(){
        System.out.println("Roaring...");
    }
}

class Tiger extends Animal{
    void roarTiger(){
        System.out.println("Tiger Roaring");
    }
}
class Driver1 {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();

        Lion l = new Lion();
        l.roar();
        l.eat();

        Tiger t = new Tiger();
        t.roarTiger();
        t.eat();
    }
}