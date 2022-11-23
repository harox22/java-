import java.util.Scanner;
public class Celsius2{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("enter a Fahrenheit value:");
		int Fahrenheit=input.nextInt();
		System.out.print("Enter a day of the week:");
		String day=input.next();
		double celsius=(5.0/9)*Fahrenheit-32;
		System.out.println(day+" Fahrenheit: "+Fahrenheit);
		System.out.println(day+" Celsius: "+celsius);
	}
}