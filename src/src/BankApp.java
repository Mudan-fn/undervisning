package src;

public class BankApp {
    public static void main(String[] arg) {
        String navn = "Ole Hansen";
        double saldo = 50.25;
        int knr = 1;

        saldo = saldo + 100;
        System.out.println("konto " + knr + ": " + saldo+ " " +navn);

        saldo = saldo * 1.05;
        System.out.println("Konto+ " + knr + ": " + saldo+ " "+navn);




    }
}