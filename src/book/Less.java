package book;

public class Less {
    public static void main(String[] args) {
        Box mybox = new Box();
        Box mybox2 = new Box();

        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        System.out.println("Обєм рівен " + mybox.volume());

        System.out.println("Обєм рівен " + mybox2.volume());
    }
}
