package Generics;

class Test1<T> {
    T obj;
    Test1(T obj){//Constructor
       this.obj=obj;
    }
}

class Driver{
    public static void main(String[] args) {
        Test1<Integer> obj1=new Test1<>(15);
        Test1<String> onj2=new Test1<>("Hello");
    }
}
