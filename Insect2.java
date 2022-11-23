//新建insect class
//instance varible X Y和Weight
//新建构造函数，包含参数initX initY和initWeight
//调用main函数，创建两个不含参数的对象bug1 bug2(会报错)，和两个含参数的对象buzz1，buzz2

public class Insect2{
	int X;
	int Y;
	double Weight;

	public Insect2(int initX,int initY,double initWeight){
		X=initX;
		Y=initY;
		Weight=initWeight;
		System.out.println(X+" "+Y+" "+Weight);
	}

	public static void main(String[] args){
		//Insect2 bug1=new Insect2();  //带参数的构造函数，这里()必须有参数，不然会报错
		//Insect2 bug2=new Insect2();
		Insect2 buzz1=new Insect2(1,2,33.4);
		Insect2 buzz2=new Insect2(4,6,77.8);
	}

}