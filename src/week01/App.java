package week01;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Circle myCircle = new Circle(5);
        Rectangle MyRectangle = new Rectangle(3, 8);

        myCircle.calculateArea();
        MyRectangle.calculateArea();
    }
}