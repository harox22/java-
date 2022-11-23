//constructor
//create a Main class
public class Main{
	int x;   //create a class attribute.

	//create a class constructor for the Main class
	public Main(){
		x=5;  //set the initial value for the class attribute
	}

	
	public static void main(String[] args){
		Main myobj=new Main();  
		//the above create an object of class Main(this will call the constructor)

		System.out.println(myObj.x);
	}
}