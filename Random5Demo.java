package Java_Programs;

import java.util.Random;

//import java.util.Random;

public class Random5Demo {
    public static void main(String[] args) {
        Random random = new Random();
        
        for (int i = 0; i < 5; i++) {
            int randomNumber = random.nextInt(101); // Generates a random number between 0 and 100
            System.out.println(randomNumber);
        }
    }
}