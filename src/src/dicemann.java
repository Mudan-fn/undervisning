package src;

import java.util.Random;

public class dicemann {
    public static void main(String[] args) {
        Random gen = new Random();
        int tal = gen.nextInt(6) + 1;
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
    }
}
