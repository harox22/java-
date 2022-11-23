//有参数的构造函数，叫做参数化构造函数
//为什么要有参数 是为了给不同的对象提供不同的初始化值


//先构造一个Student4的类
//Student4类有变量int id和String name
//新建构造函数Student4，有参数int i和string n。将i和n赋值给id和name
//新建display函数，打印出id和name
//调用main函数，新建两个实例s1和s2，s1和s2带有不同的参数。
//s1和s2调用display函数，那么打印出来的也是不同的id和name

class Student4{
	int id;
	String name;
	
	Student4(int i,String n){
		id=i;   //也就是说，后面要将1033赋值给id，Jay赋值给name
		name=n;
	}

	void display(){   //display函数 记得加上()
		System.out.println(id+" "+name);
	}

	public static void main(String[] args){
		Student4 s1=new Student4(1033,"Jay");    
//这里实例对象带参数了，所以前面需要带参数的构造函数。这样每个实例对象都有不同的初始化变量值
		Student4 s2=new Student4(1301,"Peter");
		s1.display();
		s2.display();
	}

}
