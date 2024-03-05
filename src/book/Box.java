package book;

public class Box {
    double width;
    double height;
    double depth;

    void volume() {
        System.out.print("Обєм рівний ");
        System.out.println(width * height * depth);
    }
}
