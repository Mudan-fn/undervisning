package src;

public class multiplikationstabelmethod {
    public static void main(String[] args) {
        for (int i=1; i<=10; i++) {
            printTabel(i);
        }
    }

    static void printTabel(int n){
        for (int j=1; j<=10; j++){
            System.out.print(n*j+"\t");
        }
        System.out.println();
    }
}








