package src;

import javax.swing.*;
import java.util.Random;

public class platellerkrone {
    public static void main(String[] args) {
        Random gen = new Random();
        int tal = gen.nextInt(2);
        System.out.println(tal);

        if (tal == 0)
            System.out.println("plat");
        System.out.println("tillykke du har vundet");


         System.out.println("krone");
            System.out.println("Desværre du har tabt");
    }
        }







