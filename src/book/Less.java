package book;

public class Less {
    public static void main(String[] args) {
        Box mybox = new Box();
        Box mybox2 = new Box();
        double vol;

        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        vol = mybox.volume();
        System.out.println("Обєм рівен " + vol);

        vol = mybox2.volume();
        System.out.println("Обєм рівен " + vol);
    }
}
