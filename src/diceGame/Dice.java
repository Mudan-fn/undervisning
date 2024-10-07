package diceGame;

import java.util.Random;

public class Dice {
    static Random gen=new Random(); // static betyder at der kun er en fælles variabel.
    public int roll(){

        int result= gen.nextInt(6)+1;
        return result;

    }

    public static void main(String[] args) {
        Dice dice=new Dice();
        for (int i=1; i<=10; i++) // vi kalder på roll ti gang. forloops gik på det. også while loop
            System.out.println(dice.roll());
    }




    }

