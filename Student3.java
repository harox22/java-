//构造一个class 叫做student3
//给student3这个类初始化int id和String name
//student3类中构造一个method 叫做display。display没有返回值，display要打印出id 和name
//调用main函数，给student3这个类创建两个对象 s1和s2
//s1和s2调用display方法，这时候会调用构造函数。虽然代码中没有构造函数，但是编译器自动提供了一个默认构造函数default constructor.由于没有给id和name赋值，输出的结果是int和string的默认值0和null。

class Student3{
	int id;
	String name;

	void display(){
		System.out.println(id+" "+name);
	}

	public static void main(String[] args){
		Student3 s1=new Student3();
		Student3 s2=new Student3();
		s1.display();
		s2.display();
	}
}