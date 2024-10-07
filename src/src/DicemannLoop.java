package src;

import java.util.Random;
import java.util.Scanner;

public class DicemannLoop {
    public static void main(String[] args) {
        int tal=0;
        boolean keepgoing=true;
        Scanner keyboard=new Scanner(System.in) ;

        while (keepgoing) {
        Random gen = new Random();
         tal = gen.nextInt(6) + 1;
        String activity = "";

        if (tal == 1) {
            activity = "breakfast";
        }
        if (tal == 2) {
            activity = "study";
        }
        if (tal == 3) {
            activity = "Swim";
        }
        if (tal == 4) {
            activity = "Go fishing";
        }
        if (tal == 5) {
            activity = "Call mom";
        }
        if (tal == 6) {
            activity = "Back to bed";
        }
        System.out.println(activity);
     //   if (tal==6) keepgoing=false;
        System.out.println("Vil du stoppe");
        String ans= keyboard.next();
        if (ans.equals("y")) keepgoing=false;
        }
        System.out.println("bye bye");
    }
}
