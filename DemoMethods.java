public class DemoMethods{
    public static void main(String a[]){

        int money = 10;

        Computer obj = new Computer();

        obj.playmusic();
        System.out.println(obj.getaPen(money));

    }
    
}

/**
 *  Computer
 
*/
class  Computer {
    public void playmusic(){
        System.out.println("Playing Music");
    }  

    public String getaPen(int cost){
        if (cost >= 10)
            return "pen";
        
        return "Nothing";
    }
}