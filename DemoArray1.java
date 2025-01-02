public class DemoArray1 {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.rno= 21;
        s1.name = "Krishna";
        s1.marks= 87;

        Student s2 = new Student();
        s2.rno= 22;
        s2.name = "Bal ram";
        s2.marks= 91;

        Student s3 = new Student();
        s3.rno= 20;
        s3.name = "Radha";
        s3.marks= 97;


        Student stud[] = new Student[3];

        stud[0] = s1;
        stud[1] = s2;
        stud[2] = s3;

        for(Student n : stud){

            System.out.println("Name : "+n.name+" --> Rno :"+n.rno);

        }
        
    }
}

class Student {
    int rno;
    String name;
    int marks;    
}
