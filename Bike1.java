//创建一个无参数no-args的构造函数
public class Bike1{
	Bike1(){          //创建了无参数的构造函数  //记得加上() 构造函数是函数
		System.out.println("Bike is created");
	}

	public static void main(String[] args){
		Bike1 b=new Bike1(); //这里创建对象时就会调用构造函数 所以结果打印出了Bike is created
	}


}