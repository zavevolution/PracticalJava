package book;

public class Box {
    double width;
    double height;
    double depth;

    void volume() {
        System.out.println("Обєм рівний ");
        System.out.println(width * height * depth);
    }
}
