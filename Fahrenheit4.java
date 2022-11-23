//引入Scanner 调用main
//用户输入day和fahrenheit
//用%s %f输出
//用if-else if-else判断

import java.util.Scanner;
public class Fahrenheit4{
	public static void main(String[] args){
		
		final int Min_F=50;
		final int Max_F=100;
		
		Scanner input=new Scanner(System.in);

		System.out.print("Pls enter the day:");
		String day=input.next();

		System.out.print("enter Fahrenheit:");
		int fahrenheit=input.nextInt();

		double celsius=(5.0/9)*(fahrenheit-32);

		System.out.printf("On %s the temperature is %.1f\n",day,celsius);

		if (fahrenheit>50 && fahrenheit<75){
			System.out.println("Go to park");	
		}
		else if (fahrenheit>=75 && fahrenheit<90){
			System.out.println("Swimming");
		}
		else{
			System.out.println("Stay at home");
		}
		
		System.out.println("goodbye");
	}
}