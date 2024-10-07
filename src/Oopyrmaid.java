public class Oopyrmaid {
    private int side;
    private int height;
    public Oopyrmaid (int side, int height){
        this.side=side;
        this.height=height;


    }
    public void volume(){
        int volume = side*side*height/4;
        System.out.println(volume);
    }

    @Override
    public String toString() {
       return"volume af denne pyramide, " + (side * side * height / 4);
    }

}





