import java.time.LocalDate;
import java.util.ArrayList;

public class BankApp3 {
    public static void main(String[] args) {
        ArrayList<BankAppp2.Account> List=new ArrayList<>();

    Indlaan a1=new Indlaan("Jill", 3);
    a1.deposit(100);
    a1.withdraw(50);



    Hojrente a2=new Hojrente("Bob", 10, 100000, LocalDate.of(2023,12,24));
    a2.deposit(20);
    a2.withdraw(100000);


    List.add(a1);
    List.add(a2);
    for (BankAppp2.Account a:List){
        a.annualInterest();
        a.deposit(100);
        a.printTransactions();
        System.out.println();

    }
    }
}
     class Indlaan extends BankAppp2.Account {
    Indlaan(String ow, double rate){
        super(ow, rate);
    }

    public void withdraw(double amount){
        if (amount>balance) {
            System.out.println("Der er ikke penge nok på kontoen");
        }
        else {
           super.withdraw(amount);

        }

    }

}
class Hojrente extends BankAppp2.Account {
    LocalDate releaseDate;

    Hojrente(String ow, double rate, double startbalance, LocalDate date){
        super(ow,rate);
       super.deposit(startbalance);
        releaseDate=date;


    }

    public void deposit(double amount){
        System.out.println("Der kan ikke sættes penge ind på denne konto");

    }
    public void withdraw(double amount){
        LocalDate today=LocalDate.now();
        if(today.isBefore(releaseDate)) {
            System.out.println("Pengene er bundet indtil "+releaseDate);
        }
        else {
            super.withdraw(amount);
        }
    }
// polomofo,  forskellig opjekter men behandle ens. de har forskellig måde at opfør sig på men man ka stadig væk


}
//class kredit extends Account {
//kredit



//class borneopsparing extends Account {
    //borneopsparing

