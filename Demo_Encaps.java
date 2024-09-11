
class Human {

// As the variables are private they can't accessed by other classes but can be access with in this class
    
    private String name = "goku";
    private int age = 24 ;   
    
    // Here  we are creating public method to access the private variables
    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    //Here are we are creating methods to get values to the private variables
    public void setName(String n){
        name = n;
    }
    public void setAge(int a){
        age = a;
    }

}

// From the above method we can observe that some how we are binding the methods and private variables
public class Demo_Encaps {

    public static void main(String args[]){
        System.out.println("This program explains about ENCAPSULATION");
        Human h = new Human();
    //    h.age = 21;  // this gives an error as we are trying to access the private variables directly
    //    h.name = "Srinu";

        // we can set the values of the private varibles of other classes by using their public methods
        h.setAge(26);
        h.setName("vegeta");

    System.out.println(h.getName()+":"+h.getAge());


    }
    
}