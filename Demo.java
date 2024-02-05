public class Demo {
    public static void main(String[] args){
        int num1 = 45;
        int num2 = 5;

        // Object declaration
        Calculate cal = new Calculate();

        int result = cal.add(num1,num2);

        System.out.println(result);
    }
}

class Calculate{
    public int add(int n1,int n2){

        int r = n1+n2;
        return r;    
    }
}