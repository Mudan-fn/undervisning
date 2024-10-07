import java.util.ArrayList;

public class FigurApp {
    public static void main(String[] args) {
        ArrayList<Figur>list=new ArrayList<>();
        list.add(new Rektangel(3,7));
        list.add(new Punkt());
        list.add( new Cirkel(3));
        list.add(new Cirkel(7));
        list.add(new Linje(5));

        for(Figur f:list){
            System.out.println(f);
            System.out.println("\t areal="+f.beregnAreal());
        }

    }
}
abstract class Figur {
abstract double beregnAreal ();
abstract double beregnOmkreds();
}

class Punkt extends Figur {
     double beregnAreal (){
         return 0;
     }
     double beregnOmkreds(){
         return 0;
     }

}
class Linje extends Figur {
double l; //Længden af linjestykket
Linje(double l){
    this.l=l;
}
         double beregnAreal () {
             return 0;
    }
         double beregnOmkreds() {
             return 2*l;
    }

}
class Cirkel extends Figur{
double r; // radius
 Cirkel(double r){
     this.r=r; // this bruges fordi varabiel har ens navn.
 }
         double beregnAreal (){
             return Math.PI *r*r;
         }
         double beregnOmkreds(){
             return 2*Math.PI*r;
         }
public String toString(){
             return "Cirkel r="+r;
}
}
class Rektangel extends Figur {
    double h; //højde
    double b; //bredde
    Rektangel(double h, double b){
        this.h=h;
        this.b=b;
    }
    double beregnAreal (){
             return h*b;
         }
         double beregnOmkreds(){
             return 2*(h+b);
         }
      public String toString(){ // tostring er en metode der danne en tekst string der repræsentation af et objekt.
        return "Rektangel ("+h+","+b+")";
      }
}