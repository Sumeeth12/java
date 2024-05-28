import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of side a: ");
        float a= sc.nextFloat();
        System.out.print("Enter the length of side b: ");
        float b = sc.nextFloat();
        System.out.print("Enter the length of side c: ");
        float c= sc.nextFloat();
        if ( a == b && b == c) {
            System.out.println("It is an equilateral triangle");
        } else if (a == b || a == c || b == c) {
            System.out.println("It  is  an isosceles triangle");
        } else {
            System.out.println("It is a scalene triangle.triangl");
        }    
    }
}

