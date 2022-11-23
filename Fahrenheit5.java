//while用于fahrenheit中
//引入Scanner 调用main
//初始化最小值和最大值
//用户输入fahrenheit
//判断fahrenheit 大于最大值就用while
//用%s %f 输出
//用if-else if-else 判断输出

import java.util.Scanner;
public class Fahrenheit5{
	public static void main(String[] args){

		int Max_f=140;
		int Min_f=50;		

		Scanner input=new Scanner(System.in);
		System.out.print("Pls enter the fahrenheit:");
		int fahrenheit=input.nextInt();

		while (fahrenheit>Max_f){
			System.out.println("error,pls re-enter the fahrenheit:");
			fahrenheit=input.nextInt();
		}

		System.out.print("enter the day:");
		String day=input.next();
		
		double celsius=(5.0/9)*(fahrenheit-32);

		System.out.printf("%s the fahrenheit is %.1f\n",day,celsius);
		
		if (fahrenheit<50)
			System.out.println("go skating");
		
		else if ((fahrenheit>50) && (fahrenheit<75))
			System.out.println("go to park");
		
		else if ((fahrenheit>75) && (fahrenheit<90))
			System.out.println("go swimming");
		
		else
			System.out.println("stay at home");
		
		
		System.out.println("goodbye");
	}
}

