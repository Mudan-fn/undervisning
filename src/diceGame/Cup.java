
import diceGame.Dice;

public static class cup {
    Dice d1 = new Dice();
    Dice d2 = new Dice();
    int result1;
    int result2;

    void roll() {
        result1 = d1.roll();
        result2 = d2.roll();
    }

    int getSum() {
        return result1 + result2;
    }


    public static void main(String[] args) {
        cup c = new cup();
        for (int i = 1; i <= 10; i++) {
            c.roll();
            System.out.println(c.getSum());
        }
    }
}