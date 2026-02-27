package GarbageCollection.Eligibility.ObjectCreatedInsideMethod;

public class Demo {
    static void createObject(){
        Demo obj=new Demo();
    }

    public static void main(String[] args) {
        createObject();
    }
}

