import java.util.Scanner;
public class Celsius8{
	public static void main(String[] args){
		System.out.print("type something:");
		Scanner input=new Scanner(System.in);
		int Fahrenheit=input.nextInt();
		String day=input.nextLine().trim();
		double celsius=(5.0/9)*(Fahrenheit-32);
		System.out.println(day + " Fahrenheit: "+Fahrenheit);
		System.out.printf("%s Celsius: %f\n",day,celsius);
		System.out.printf("the day is %s.\n",day);
		System.out.printf("the celsius is %f\n",celsius);
	}
}