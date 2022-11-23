public class Wolf extends Canine{  //Wolf也是Canine的子类，那就是Dog的sibling
	protected int rank;  //Wolf和Dog是sibling，都是Canine的子类，Wolf没有name变量，Dog没有rank变量，Wolf和Dog都有从Canine继承的size变量

	public Wolf(double size,int rank){
		super(size);
		this.rank=rank;
	}

	public int getRank(){
		return rank;
	}

	public void bark(){   //这个bark是wolf自己的bark method，不是继承自canine的，也就是所谓的overriding parent's method.
		for(int i=1;i<3;i++)
			super.bark();  //又继承了Canine父类的bark变量
	}

	public static void main(String[] args){
		Wolf alpha=new Wolf(17.1,1);
		alpha.bark();
	}
}