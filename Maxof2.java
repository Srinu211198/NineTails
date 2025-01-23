package Java_Programs;
public class Maxof2 {

    public static void main(String[] args) {
        
        if (args.length < 2) {
            System.out.println("Please provide two integer arguments.");
            return;
        }
        int i = Integer.parseInt(args[0]);
        int j = Integer.parseInt(args[1]);

        if(i>j){
            System.out.println(i+"is the max of "+i+" "+j);

        }
        else{
            System.out.println(j+"is max of "+i+" "+j);
        }
    }
} 