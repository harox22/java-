//constructor
//create a Main class
public class Main1{
	int x;   //create a class attribute.

	//create a class constructor for the Main class
	public Main1(){   //public是个modifier 其实也可以去掉
		x=5;  //set the initial value for the class attribute
	}

	
	public static void main(String[] args){
		Main1 myObj=new Main1();  
		//the above create an object of class Main(this will call the constructor)

		System.out.println(myObj.x);
	}
}