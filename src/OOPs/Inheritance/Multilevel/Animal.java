package OOPs.Inheritance.Multilevel;

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

class BabyLion extends Lion{
    void cry(){
        System.out.println("Crying...");
    }
}

class Driver1{
    public static void main(String[] args) {
        Animal a=new Animal();
        a.eat();

        Lion l=new Lion();
        l.roar();
        l.eat();

        BabyLion blion=new BabyLion();
        blion.cry();
        blion.roar();
        blion.eat();
    }
}