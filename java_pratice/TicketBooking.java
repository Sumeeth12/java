import java.util.Scanner;
public class MovieTicketPrice {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Enter the time of the movie (24-hour format, e.g., 14.30 for 2:30 PM): ");
        double time = scanner.nextDouble();
        int price = getTicketPrice(age, time);
        if (price == 0) {
            System.out.println("You get a free ticket!");
        } else {
            System.out.println("The price of the ticket is " + price + ".");
        }
        scanner.close();
    }
    public static int getTicketPrice(int age, double time) {
        if (age < 5 || age >= 60) {
            return 0;
        }
        if (time < 12.00) {
            return 250;
        } else if (time >= 17.00 && time < 21.00) {
            return 300;
        } else {
            return 200;
        }
    }
}
