package book;

public class Less {
    public static void main(String[] args) {
        Box mybox = new Box(10.0, 20.0, 15.0);
        Box mybox2 = new Box(3, 6, 9);
        double vol;

        vol = mybox.volume();
        System.out.println("Обєм рівен " + vol);

        vol = mybox2.volume();
        System.out.println("Обєм рівен " + vol);
    }
}
