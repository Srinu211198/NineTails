import java.util.Scanner;

public class DataType {
    public static void main(String[] args) {
    
        System.out.println("Calculating Percentage");
        Scanner sc = new Scanner(System.in);
        System.out.println("Full marks is");
        int f = sc.nextInt();
        System.out.println("Enter marks for sub1");
        int a = sc.nextInt();
        System.out.println("Enter marks for sub2");
        int b = sc.nextInt();
        System.out.println("Enter marks for sub3");
        int c = sc.nextInt();
        System.out.println("Enter marks for sub4");
        int d = sc.nextInt();
        System.out.println("Enter marks for sub5");
        int e = sc.nextInt();

       float sum = a+b+c+d+e;
       float per = ((sum/(f*5))*100);
        System.out.println("Percentage is");
        System.out.println(per);
    }
}