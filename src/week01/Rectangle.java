package week01;

public class Rectangle {
   private int length;
   private int width;
   public Rectangle (int length, int width) {
       this.length = length;
       this.width = width;
   }
   public void setLength(int length){
       if (length > 0) {
           this.length = length;
       } else {
           System.out.println("Die Länge kann nicht negativ oder 0 sein");
       }
   }
   public void setWidth(int width){
       if (width > 0) {
           this.length = length;
       } else {
           System.out.println("Die Breite kann nicht negativ oder 0 sein");
       }
   }
    public void calculateArea(){
       double area = width * length;
       System.out.println("Fläche:" + area);
    }
    public static void main (String[] args) {
        int initialWidth = 10;
        int initialLength = 5;
        Rectangle myRectangle = new Rectangle(initialLength, initialWidth);

        myRectangle.calculateArea();
    }
}
