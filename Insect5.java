//目标是计算insect移动的距离
//先创建class Insect5 有变量X,Y和Weight
//创建构造函数
//创建方法move
//创建方法eat
//调用main函数

public class Insect5{
	int X;
	int Y;
	double Weight;
	double DIST_WEIGHT_LOSS_FACTOR=0.01;
	
	public Insect5(int initX,int initY,double initWeight){
		X=initX;
		Y=initY;
		Weight=initWeight;
		
	}
	
	public void move(int newX,int newY){	  //结束时的坐标	
		double distance=calculateDistance(X,Y,newX,newY);
		if (distance>0){
			X=newX;
			Y=newY;
			Weight=Weight*DIST_WEIGHT_LOSS_FACTOR*distance;
			System.out.printf("the insect move %.2f\n",distance);
		}else
			System.out.println("did not move.");
		
	}

	private static double calculateDistance(int x1,int y1,int x2,int y2){
		return Math.sqrt((x2-x1)*(x2-x1)-(y2-y1)*(y2-y1));
	}

	public void eat(double amount){
		Weight=Weight+amount;
		System.out.printf("the weight is %.2f\n",Weight);
	}

	public static void main(String[] args){
		Insect5 buzz1=new Insect5(10,20,100);
		Insect5 buzz2=new Insect5(30,40,90);

		buzz1.move(80,80);
		buzz2.move(30,40);	
		buzz1.eat(10);
		buzz2.eat(10);
	}
}





