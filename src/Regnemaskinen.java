import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Regnemaskinen {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        double a = 0;
        double b = 0;
        double res = 0;
        char op;
        boolean KeepGoing = true;

        while (true) {
            System.out.println("Velkommen til Regnemaskinen");
            System.out.println(" + for addition");
            System.out.println(" - for subtraktion");
            System.out.println(" * for multiplikation");
            System.out.println(" / for division");
            System.out.println(" q for quit");

            System.out.println("indtast operator:");
            op = keyboard.next().charAt(0);
            if (op == 'q') break;
            a=readDouble();
            b=readDouble();



        }


        System.out.println("indtast b");
        b = keyboard.nextDouble();

        switch (op) {


            case '+': res = a + b;    break;



            case '-': res = a - b; break;


            case '*':
                res = a * b;
                break;
            case '/':
                res = a / b;
                break;
            default:
                System.out.println("Ugyldig operator");



        }
        System.out.println("resultat:" + a + op + b + "=" + res);


        System.out.println("Tak for i dag");


    }

    static double readDouble() {
        double n = 0;
        boolean ok = false;
        while (!ok) {
            try {
                System.out.println("indtast a");
                n = keyboard.nextDouble();
                ok = true;

            } catch (InputMismatchException e) {
                System.out.println("Ulovlig input. prøv igen");
            }

        }

        return n;
    }

}