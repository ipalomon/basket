package app.services;
import java.util.Random;

public class GenerateUUId {
    public static int generateUUId(){
        Random rand = new Random();
        // Generate random integers in range 0 to top, if top=10 random 0 to 9
        return rand.nextInt(10000);
    }
}
