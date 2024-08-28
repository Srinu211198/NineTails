class Calci {
    int a;
    public int add(int n1, int n2){

        int r  = n1+ n2;

        return r;
    }

    
}

public class Demo {
    public static void main(String[] args) {
        int num1 =2;
        int num2 =5;

        Calci b = new Calci();

        int result = b.add(num1,num2);

        System.out.println(result);

    //     int result = num1 + num2;
    //     System.out.println(result);
    }
    
}
