
class Human{
    private int age;
    private String name;
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
   public Human(){
    System.out.println("In constructor");
    this.age= 20;
    this.name= "Naruto";
   }   

   public Human(int age, String name){
    this.age = age;
    this.name = name;
    System.out.println("This is a parameterized constructor");
   }

}


public class DemoConstruct {
    public static void main(String[] args) {
        System.out.println("This program explains about the constructor and THIS keyword as well");
        Human h = new Human(22,"Sasuke");
        System.out.println(h.getName()+":"+h.getAge());

        // h.setAge(26);
        // h.setName("vegeta");


    }
    
}
