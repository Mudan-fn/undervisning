import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class BankAppp2 {

        public static void main(String[] args) {

            Account a1=new Account("Joe Pass", 2.5);
            Account a2=new Account("Jimmy Henderix", 2.5);


            a1.deposit(200);
            a1.deposit(1000);
            a1.withdraw(400);
     //       a1.balance=100000;
            a1.annualInterest();

            a1.printTransactions();
            System.out.println();
            a2.printTransactions();
            System.out.println();

        }


    static class Account {
        private int accountNo;
        protected String owner;
        protected double balance;         // indestående i kr
        protected double interestRate; // rentesats i %
        private ArrayList<Transaction> transactions=new ArrayList<>();
        static private int no0faccounts=0;


        Account(String ow, double rate){
            no0faccounts++;
            accountNo=no0faccounts;
            owner=ow;
            balance=0;
            interestRate=rate;
        }

        public Account(int ac, String ow) {

        }


        public void deposit(double amount){
            balance=balance+amount;
            transactions.add(new Transaction("Indsat", amount, balance));
        }


        public void withdraw(double amount){
            balance=balance-amount;
            transactions.add(new Transaction("Hævet", amount, balance));
    }



        public void annualInterest(){
            double intrest=balance*interestRate/100;
            balance=balance+intrest;
            transactions.add(new Transaction("Rente", intrest, balance));



        }
        public void printTransactions(){
            System.out.println(this);
            System.out.println("Tekst\tDato\t\tBeløb\tSaldo");
            for(Transaction t: transactions){
                System.out.println(t);
            }
        }


        public String toString(){
            return "Kontonr "+accountNo+": "+owner+" "+balance;
        }
    }

}
  class Transaction {
    String text;
    LocalDate date;
    double amount;
    double newBalance;


    Transaction(String text, double amount, double newBalance){
        this.text=text;
        date=LocalDate.now();
        this.amount=amount;
        this.newBalance=newBalance;
    }
    public String toString (){
      return text+"\t"+date+"\t"+amount+"\t"+newBalance;

    }


  }
