import java.io.*;
import java.util.ArrayList;


public class Studentlist {
    public static void main(String[] arg) throws IOException {
        FileReader fil = new FileReader("studentlist.txt");
        BufferedReader ind = new BufferedReader(fil);
        ArrayList<String> List = new ArrayList<>();

        String linje = ind.readLine();
        while (linje != null) {

            String[] bidder = linje.split(",");  // opdel i bidder efter,
            String navn = bidder[1];
            System.out.println(navn);
            linje = ind.readLine();
            {
                List.sort(null);
                for (String s : List) {
                    System.out.println(s);
                }

            }

        }
        save(List);
    }
    static void save(ArrayList<String> l)throws IOException  {
        FileWriter fil = new FileWriter("StudentListSorted.txt");
        PrintWriter ud = new PrintWriter(fil);
        for (int i = 0; i < 5; i++) {
            String navn = "person" + i;
            String køn;
            if (Math.random() > 0.5) køn = "m";
            else køn = "k";
            int alder = 10 + (int) (Math.random() * 60);

            ud.println(navn + " " + køn + " " + alder);
        }
        System.out.println("Filen er gemt");
    }

}

