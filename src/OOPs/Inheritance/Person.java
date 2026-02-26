package OOPs.Inheritance;

public class Person {
    String FName;
    String LName;

    Person(String FName,String LName){
        this.FName=FName;
        this.LName=LName;
    }
}

class Student extends Person{
    int usn;

    Student(String FName,String LName,int usn){
        super(FName,LName);
        this.usn=usn;
    }
}

class Driver{
    public static void main(String[] args) {
        Student s1=new Student("Nisha","Rangaswamy",1012);

    }
}