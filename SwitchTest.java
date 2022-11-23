//电话按键
//引入Scanner 调用main函数
//用户输入，定义为selection
//用switch分情况，不同switch对应不同menuOption
//输出menuOption
import java.util.Scanner;
public class SwitchTest{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("pls enter the selection:");
		int selection=input.nextInt();

		String menuOption;

		switch(selection){
			case 0:  //如果selection=0
				menuOption="Operator";
				break;
			case 1:
				menuOption="Customer Service";
				break;

			case 2:
				menuOption="Billing";
				break;
			case 3:
				menuOption="Hang up";
				break;	
			default:   //记得写default默认值
				menuOption="Retry Selection";
				break;
		}
		System.out.println(menuOption);
	}	
}