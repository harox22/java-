//调用main函数
//while外循环 变量outerCouter递增
//while内循环 innerCouter递增 打印helloword
public class HelloWorldLoop3{
	public static void main(String[] args){
		
		int outerCounter=0;
		while (outerCounter<3){

			int innerCounter=0;
			System.out.println("outerCounter is:"+outerCounter);

			while(innerCounter<5){
				System.out.println("helloword"+innerCounter);
				innerCounter++;
			}
			outerCounter++;
		}
	}
}