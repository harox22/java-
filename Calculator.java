//引入Scanner 调用main
//打印出5个输入选项
//用户输入 +-*/ 若错误结束程序break
//用switch 加减乘除排序
//用if-else 如果0为分母 break
//加减用int
//乘除用printf  .2f
//排序 用ascii 用+-=输出结果 用compareTo


import java.util.Scanner;
public class Calculator{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);

		String errorMessage="Invalid input entered. Terminating...";
		System.out.println("List of operations: add subtract multiply divide alphabetize");
		System.out.print("Enter an operation:");
		String operation=input.next();
		
		switch(operation.toLowerCase()){ 
		   
			case "add":
				System.out.print("Enter two integers:");
				if (input.hasNextInt()){
					int num_add_1=input.nextInt();
					if (input.hasNextInt()){
						int num_add_2=input.nextInt();
						int add_result=num_add_1 + num_add_2;
						System.out.print("Answer:"+add_result+"\n");
						System.out.println();
					}else{
						System.out.print(errorMessage);
					}
				}else{
					System.out.print(errorMessage);
				}
				break;			
		
			case "subtract":    
				System.out.print("Enter two integers:");
				if (input.hasNextInt()){
					int num_abs_1=input.nextInt();
					if (input.hasNextInt()){
						int num_abs_2=input.nextInt();
						int abs_result=num_abs_1 - num_abs_2;
						System.out.print("Answer:"+abs_result);
						System.out.println();
					}else{
						System.out.print(errorMessage);
					}
				}else{
					System.out.print(errorMessage);
				}
				break;
		
			case "multiply":
				System.out.print("Enter two doubles:");
				if (input.hasNextDouble()){
					double num_mul_1=input.nextDouble();
					if (input.hasNextDouble()){
						double num_mul_2=input.nextDouble();
						double mul_result=num_mul_1 * num_mul_2;
						System.out.printf("Answer: %.2f\n",mul_result);
						System.out.println();
					}else{
						System.out.print(errorMessage);
					}
				}else{
					System.out.print(errorMessage);
				}
				break;
		
			case "divide":   
				System.out.print("Enter two doubles:");
				if (input.hasNextDouble()){
					double num_div_1=input.nextDouble();
					if (input.hasNextDouble()){
						double num_div_2=input.nextDouble();
						double result_div=num_div_1 / num_div_2;
						if (num_div_2!=0){
							System.out.printf("Answer: %.2f\n",result_div);
						}else{
							System.out.println(errorMessage);
						}
					}else{
						System.out.println(errorMessage);
					}
				}else{
					System.out.println(errorMessage);
				}			
				break;

		

			case "` alphabetize ":   
				System.out.print("Enter two words:");
				String num_alp_1=input.next().replace("\"","");
				String num_alp_2=input.next().replace("\"","");;
				
				
				int result_alp=num_alp_1.compareTo(num_alp_2);
				if (result_alp==0){
					System.out.println("Answer: Chicken or Egg.");
					System.out.println();	
					break;
				}else if (result_alp<0){
					System.out.println(num_alp_1+" comes before "+num_alp_2+" alphabetically.");
					System.out.println();	
					break;
				}else if (result_alp>0){
					System.out.println(num_alp_2+" comes before "+num_alp_1+" alphabetically.");	
					System.out.println();
					break;
				}default:
					System.out.println(errorMessage);
					System.out.println();
					break;	
		}		
	}
}

