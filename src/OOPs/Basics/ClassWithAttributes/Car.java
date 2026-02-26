package OOPs.Basics.ClassWithAttributes;

class Car {
    String BrandName;
    int ManuDate;
    String Color;

    public Car(String BrandName,int ManuDate,String C){
        this.BrandName=BrandName;//c1.BrandName=Audi
        this.ManuDate=ManuDate;//ManuDate=MDate remove this keyword
        Color=C;
    }
    void printDetails(){
        System.out.printf("Car BrandName is %s\n",BrandName);
        System.out.printf("Car ManuDate is %d\n",ManuDate);
        System.out.printf("Car Color is %s\n",Color);
    }
}
class Driver{
    public static void main(String[] args) {
        Car c1=new Car("Audi",2000,"Red");
        Car c2=new Car("BMW",2026,"Black");
        c1.printDetails();
        c2.printDetails();
    }
}