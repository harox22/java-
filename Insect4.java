//目标是计算昆虫距离
//新建class Insect4
//给出变量坐标x,坐标y和体重weight
//创建构造函数。后面有不同的对象，所以使用参数化构造函数。
//move method，计算出移动了多少，打印出来. 还要考虑没移动的情况
//calculateDistance作为help method
//eat method 算出新的体重
//创建main函数，给出参数，起始坐标，最终坐标

public class Insect4{
	int X;   //为什么要用private不同public呢
	int Y;
	double Weight;
	final double DIST_WEIGHT_LOSS_FACTOR=0.001;
	
	public Insect4(int initX,int initY,int initWeight){
		X=initX;
		Y=initY;
		Weight=initWeight;
	}

	public void move(int newX,int newY){
		double distance=calculateDistance(X,Y,newX,newY);
		if (distance>0){
			X=newX;
			Y=newY;
			Weight=Weight*DIST_WEIGHT_LOSS_FACTOR*distance;
			System.out.printf("%.2f\n",distance);
		}else{
			System.out.println("Did not move.");
		}
	}

	private static double calculateDistance(double x1,double y1,double x2,double y2){
		return Math.sqrt((y2-y1)*(y2-y1)+(x2-x1)*(x2-x1));
	}

	public void eat(double amount){
		Weight=Weight+amount;
	}
	
	public static void main(String[] args){
		Insect4 buzz1=new Insect4(3,4,10);  //这里给定的是起始坐标和体重
		Insect4 buzz2=new Insect4(10,20,100); 

		buzz1.move(30,40);  //这里给定的是结束坐标
		buzz2.move(10,20);

	}

}