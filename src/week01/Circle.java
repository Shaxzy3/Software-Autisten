package week01;

public class Circle {
    private int radius;
    //getter für den Radius
    public Circle(int radius) {
        this.radius = radius;
    }

    public void setRadius(int radius){
        if (radius > 0) {
            this.radius = radius;
        }
        else {
            System.out.println("Der Radius k ann nicht negativ, oder 0 sein");
        }
    }
    public void calculateArea() {
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Fläche:" + area);
    }
    public static void main(String[] args) {
        int initialRadius = 10;
        Circle myCircle = new Circle(initialRadius);

        myCircle.calculateArea();

        int newRadius = 15;
        myCircle.setRadius(newRadius);

        myCircle.calculateArea();
    }

}
