public class Rectangle {
    public static void main(String[] args) {


        int circumference = (calculateCircumference( 32,  12));
        System.out.println(circumference);

        int area = (calculateArea(32, 12));
        System.out.println(area);

    }
   public static int calculateCircumference (int width, int lenght) {
        int circumference = 2 * (width + lenght);
        return circumference;
   }
    public static int calculateArea (int width, int lenght) {
        return width * lenght;
    }
}
