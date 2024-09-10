class Mobile {
    int price;
    String Name;
    String Brand;
    String Type;    

    void show(){
        System.out.println(Name+":"+Brand+":"+Type+":"+price);
    }
}

public class Demo_Static {
    public static void main(String[] args) {
        System.out.println("This Program contains Static variables, methods & blocks:");

        Mobile obj1 = new Mobile();
        obj1.Brand = "Apple";
        obj1.Name = "I PHONE 13 pro";
        obj1.price = 1000;
        obj1.Type = "Smart Phone";

        obj1.show();


    }
}
