import java.util.Scanner;

public class RectangleArea {
  public static void main(String[] args) {
        double length = getInput("length");
        double width = getInput("width");
        double area = calculateArea(length, width);
        displayOutput(area);
    }
    public static double getInput(String dimension) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the " + dimension + " of the rectangle: ");
        return scanner.nextDouble();
    }
    public static double calculateArea(double length, double width) {
        return length * width;
    }
    public static void displayOutput(double area) {
        System.out.println("The area of the rectangle is: " + area);
    }
}
