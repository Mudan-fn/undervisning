public class opgave2 {
    public static void main(String[] args) {
        ;

        ;
        int y = 3 * 7 * 7 + 6 * 7 + 9;
        System.out.println("y" + y);
//        areal(3,5);
//        omregner(5.5);
        tilfælgdigtal();
        tilddeling();

    }

    static void areal(int længde, int bredde) {
        int areal = længde * bredde;
        System.out.println("areal er " + areal);

    }

    static void omregner(double dollars) {
        double euro = dollars * 0.9;
        System.out.println(" omregner er " + euro);

    }

    static void tilfælgdigtal() {
        double a = Math.random();
        double b = Math.random();
        double c = Math.random();
        double total = a + b + c;
        double gennemsnit = total / 3;

        System.out.println(" gennemsnit er " + gennemsnit);
        System.out.println(" total er " + total);
    }

    static void tilddeling()
    {
        int a, b, c, d;
        a = 5;
        b = 6;
        c = 7;
        d = 8;
        System.out.println("a er "+a+", b er "+b+", c er "+c+" og d er "+d);

        a = b + d;
        d = c + a;
        System.out.println("a er "+a+", b er "+b+", c er "+c+" og d er "+d);

        b = a;
        d = c;
        System.out.println("a er "+a+", b er "+b+", c er "+c+" og d er "+d);
    }
}

