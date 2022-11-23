//引入Scanner  调用main
//用户输入day和fahrenheit
//使用%s,%f输出结果
//使用if判断

import java.util.Scanner;
public class Fahrenheit{
	public static void main(String[] args){

		Scanner input= new Scanner(System.in);
		
		System.out.print("pls enter the day:");
		String day=input.next();
		
		System.out.print("pls enter the Fahrenheit:");
		int Fahrenheit=input.nextInt();

		double Celsius=(5.0/9)*(Fahrenheit-32);

		System.out.println(day+" Fahrenheit is: "+Fahrenheit);

		System.out.printf("%s celsius is: %.1f\n",day,Celsius);
		
		if (Fahrenheit>70)
			System.out.println("Go to parrrk.");


	}
}