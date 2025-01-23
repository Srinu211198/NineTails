package Java_Programs;

import java.util.Scanner;

public class SumProd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a numer:");
        int d = sc.nextInt();
        int sum=0,prod=1,i=0;
        while(d>0){
            i = d%10;
            sum +=i;
            prod *=i;
            d = d/10;
        }
        System.out.println("Sum is :"+sum);
        System.out.println("Product is :"+prod);
        
        if(sc != null){
            sc.close();
        }
}
}