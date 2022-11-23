
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("List of operations: add subtract multiply divide alphabetize");
        System.out.println("Enter an operation:");
        String option = input.next();
        String option1 = option.toLowerCase();
        switch (option1) {
        case "add":
            try {
                System.out.println("Enter two integers:");
                int a = input.nextInt();
                int b = input.nextInt();
                System.out.println("Answer: " + (a + b));
            } catch (Exception e) {
                System.out.println("Invalid input entered. Terminating...");
            }
            break;
        case "subtract":
            try {
                System.out.println("Enter two integers:");
                int a1 = input.nextInt();
                int b1 = input.nextInt();
                System.out.println("Answer: " + (a1 - b1));
            } catch (Exception e) {
                System.out.println("Invalid input entered. Terminating...");
            }
            break;
        case "multiply":
            try {
                System.out.println("Enter two doubles:");
                double c = input.nextDouble();
                double d = input.nextDouble();
                System.out.printf("Answer: %.2f", c * d);
            } catch (Exception e) {
                System.out.println("Invalid input entered. Terminating...");
            }
            break;
        case "divide":
            try {
                System.out.println("Enter two doubles:");
                double e = input.nextDouble();
                double f = input.nextDouble();
                System.out.printf("%.2f", e / f);
            } catch (Exception e) {
                System.out.println("Invalid input entered. Terminating...");
            }
            break;
        case "alphabetize":
            System.out.println("Enter two words:");
            String g = input.next();
            String g1 = g.toLowerCase();
            String h = input.next();
            String h1 = h.toLowerCase();
            int result = g1.compareTo(h1);
            if (result == 0) {
                System.out.println("Answer: Chicken or Egg.");
            } else if (result > 0) {
                System.out.println("Answer: " + h + " comes before " + g + " alphabetically.");
            } else if (result < 0) {
                System.out.println("Answer: " + g + " comes before " + h + " alphabetically.");
            }
            break;
        default:
            System.out.println("Invalid input entered. Terminating...");
            break;
        }
    }
}