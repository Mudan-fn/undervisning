package src;

import javax.swing.*;
import java.util.Arrays;
import java.util.Random;

public class diceman2 {
    public static void main(String[] args) {
        Random gen = new Random();
        int tal = gen.nextInt(6) + 1;
    
        switch (tal) {
            case 1:
                System.out.println("mandag");
                break;
            case 2:
                System.out.println("tirsdag");
                break;
            case 3:
                System.out.println("onsdag");
                break;
            case 4:
            case 5:
                System.out.println("Torsdag eller Fredag");
                break;
            default:
                System.out.println("Weekend");


        }
        JOptionPane.showMessageDialog(  null, ""+tal);
    }
}