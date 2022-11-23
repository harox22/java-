//用for做nested loops
//调用main函数
//for三元表达式做外循环 变量base
//for三元表达式做内循环 变量pow 打印base和pow的乘积
public class Powers{
	public static void main(String[] args){
		final int Limit=5;
		
		for(int base=1;base<Limit;base++){
			//System.out.println("base:"+base);
			
			for(int pow=4;pow>0;pow--){
				int result=base*pow;
				System.out.println("base:"+base);
				System.out.println("pow:"+pow);			
				System.out.println("the result is:"+result+"\n");
			}
		}
	}
}