//Canine是父类，创建一个size变量，然后子类Dog会用super(size)引用

public class Canine{
	protected double size;
	
	public Canine(double size){
		this.size=size();  //this是什么
	}

	public final void bark(){  //bark方法前面加了个final 那么bark方法就没法overriding了
		System.out.println("Woof Woof");
	}
}


/*
//abstract版本的class Canine
public abstract class Canine{       //如果一个class有abstract method，那么这个class要加上abstractc修饰符
	protected double size;
	public Canine(double size){
		this.size=size;
	}

	public void bark(){
		System.out.println("Woo Woo");
	}

	public abstract void groom();   //加上了一个abstract的method groom，abstract method只有declaration没有definition。连{ }都没有啊。。

}






*/