package Generics;
class Test2<K,V> {
    K key;
    V val;

    Test2(K key, V val){
        this.key=key;
        this.val=val;
    }
    void display(){
        System.out.println(key + " " + val);
    }
}
class Driver1{
    public static void main(String[] args) {
        Test2<String,Integer> obj1=new Test2<>("Nisha",1000);
        obj1.display();
    }
}
