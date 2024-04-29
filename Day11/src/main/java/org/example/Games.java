package org.example;

import java.util.Random;

public class Games {

    public static boolean quess(int[] skaitli) {
        Random r = new Random();
        int toGuess = r.nextInt(16);

        for(int i = 0; i < 3; i++){
            if(skaitli[i] == toGuess){
                return true;
            }
        }
        return false;

    }
}
