//Dog是Canine的子类
public class Dog extends Canine{    //Dog是Canine的一个字类
	protected String name;

	public Dog(String name,double size){
		super(size);
		this.name=name;   //这个怎么理解啊？
	}

	public void fetch(){
		System.out.println("Run");
		System.out.println("Clinch");
		System.out.println("Return");
	}

	public static void main(String[] args){
		Dog spot=new Dog("Spot",9.6);
		spot.bark();  //dog的bark直接从canine super class继承的
	}
}