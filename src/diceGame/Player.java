package diceGame;


public  class Player {
    cup cup= new cup();
        String name;
        public int sum=0;
        public Player(String name){
            this.name=name;
        }


    public void turn() {
        cup.roll();
        sum+=cup.getSum();
    }

    @Override
    public String toString() {
        return name;
    }


    public static void main(String[] args) {
    Player p=new Player ("Bob");
    for (int i=1; i<=10; i++);
    p.turn();
        System.out.println(p.sum);
        while (p.sum<100){
            p.turn();
        System.out.println(p.sum);
    }
  }

}


