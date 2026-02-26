package OOPs.ConsDemo;

class Student {
    String name;
    int usn;

    //Traditional constructor
    Student(String name, int usn){
        this.name=name;
        this.usn=usn;
    }

    //Copy Constructor
    Student(Student s){
        this.name=s.name;
        this.usn=s.usn;
    }

    void display(){
        System.out.println(name + " " + usn);
    }
}

class Driver1{
    public static void main(String[] args) {
        Student s1=new Student("Nisha",1012);
        Student s2=new Student(s1);
        Student s3 = s2;
        s1.display();//Nisha 1012
        s2.display();//Nisha 1012 (clone or copied)
        s3.display();
    }
}
