import java.util.Scanner;

public class CWHJ_CBSE {
    public static void main(String[] args) {

        int tot =0;
        System.out.println("Enter the mark of student");
        Scanner sc = new Scanner(System.in);        

        for(int i =1;i<=5;i++)
        {
            System.out.println("Enter the marks for subject "+i);
            tot += sc.nextInt();
        }
        
        System.out.println("The Total marks obtained by Student are: "+tot);
        System.out.println("The Percentage obtained by Student is: "+(tot/5));    
    }
}
