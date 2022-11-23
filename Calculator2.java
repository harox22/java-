import java.util.Scanner;

public class Calculator{

	public static void main(String[] args){

		System.out.println("List of operations: add subtract multiply divide alphabetize");

		Scanner input = new Scanner(System.in);

		System.out.println("Enter an operation: ");

		String operation;
		operation = input.nextLine();
		operation = operation.toLowerCase();

		String error = "Invalid input entered. Terminating...";


		switch(operation){

			case "add":
				int add1;
				int add2;
				System.out.println("Enter two integers: ");
				if (input.hasNextInt()) {
					add1 = input.nextInt();
				} else {
					System.out.println(error);
					break;
				}
				if (input.hasNextInt()) {
					add2 = input.nextInt();
				} else {
					System.out.println(error);
					break;
				}
				System.out.println("Answer: " + (add1 + add2));
				break;

			case "subtract":
				int sub1;
				int sub2;
				System.out.println("Enter two integers: ");
				if (input.hasNextInt()) {
					sub1 = input.nextInt();
				} else {
					System.out.println(error);
					break;
				}
				if (input.hasNextInt()) {
					sub2 = input.nextInt();
				} else {
					System.out.println(error);
					break;
				}
				System.out.println("Answer: " + (sub1 - sub2));
				break;

			case "multiply":
				double mul1;
				double mul2;
				System.out.println("Enter two doubles: ");
				if (input.hasNextDouble()) {
					mul1 = input.nextDouble();
				} else {
					System.out.println(error);
					break;
				}
				if (input.hasNextDouble()) {
					mul2 = input.nextDouble();
				} else {
					System.out.println(error);
					break;
				}
				System.out.printf("Answer: %.2f%n", (mul1 * mul2));
				break;

			case "divide":
				double div1;
				double div2;
				System.out.println("Enter two doubles: ");
				if (input.hasNextDouble()) {
					div1 = input.nextDouble();
				} else {
					System.out.println(error);
					break;
				}
				if (input.hasNextDouble()) {
					div2 = input.nextDouble();
				} else {
					System.out.println(error);
					break;
				}
				if (div2 == 0) {
					System.out.println(error);
					break;
				}
				else {
					System.out.printf("Answer: %.2f%n", (div1/div2));
				}
				break;

			case "alphabetize":
				String first;
				String second;
				System.out.println("Enter two words: ");

				first = input.next();
				second = input.next();

				//firstL = first.toLowerCase();
				//secondL = second.toLowerCase();

				int result = first.toLowerCase().compareTo(second.toLowerCase());

				if (result > 0) {
					System.out.println("Answer: " + second + " comes before " + first + " alphabetically.");
				}
				else if (result == 0) {
					System.out.println("Answer: Chicken or Egg.");
				}
				else {
					System.out.println("Answer: " + first + " comes before " + second + " alphabetically.");
				}
				break;
			default:
				System.out.println(error);


		}
	}
}