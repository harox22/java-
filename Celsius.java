import java.util.Scanner;
public class Celsius{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Fahrenheit value:");
		int fahrenheit = input.nextInt();
		double celsius = (5.0/9)*(fahrenheit-32);
		System.out.println("Celsius:"+celsius);	
	} 
}