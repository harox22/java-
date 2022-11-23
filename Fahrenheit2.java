//引入scanner 调用main
//初始化最低温度和最高温度
//用户输入温度和日期
//raining给个初始值为false 用户输入 如果为y 则raining变为false
//用if else判断，用&&表示并且，如果在最低和最高温度之间 并且不下雨 则出去玩 否则呆在家

import java.util.Scanner;
public class Fahrenheit2{
	public static void main(String[] args){
	
	//用final 无法再修改变量值
	final int Min_F=50;
	final int Max_F=100;

	Scanner input=new Scanner(System.in);

	System.out.print("pls enter the Fahrenheit:");
	int Fahrenheit=input.nextInt();

	System.out.print("the day:");
	String day=input.next();

	double celsius = (5.0/9)*(Fahrenheit-32);

	System.out.printf("On %s the Fahrenheit is %.1f.\n",day,celsius);

	boolean raining = false;  //先假定raining为false raining居然是个boolean..
	System.out.println("Is it raining?(y/n):"); 
	String rainInput=input.next().toLowerCase();//用户可能输入大写Y或N,统一换成小写
	
	//判断是否下雨 如果下雨就把raining改为true
	if (rainInput.startsWith("y")){    //只要是y开头就行 以防用户输入yes
		raining=true;
	}

	if ( Fahrenheit >= Min_F && Fahrenheit <= Max_F && !raining ){
		System.out.println("Go to parrrrrk");
	}
	else {
		System.out.println("stay at home");
	}
	
	}

}