//新建class Insect3,初始化三个变量X,Y和weight
//创建参数化构造函数Insect3 带参数initX initY 和initWeight
//新建eat方法,参数为吃进去的amount，生成新的weight
//新建move方法，参数为新的坐标x和y，利用calculateDistance函数算出distance
//新建calculateDistance方法，
//调用main函数 创建对象 穿进weight 初始xy和最终xy 算出distance


public class Insect3{
	private double Weight;
	private int X;
	private int Y;
	double DIST_WEIGHT_LOSS_FACTOR=1;
	
	//constructor
	public Insect3(double initWeight,int initX,int initY){
		Weight=initWeight;
		X=initX;
		Y=initY;
	}

	//eat method
	public void eat(double amount){
		System.out.println("Yumy Yumy");
		Weight=Weight+amount;	
	}

	//move method
	public void move(int newX,int newY){
		double distance=calculateDistance(X,Y,newX,newY);
		if (distance>0){
			X=newX;  //把x坐标更新了 
			Y=newY;	 //把y坐标更新了
			Weight=Weight*DIST_WEIGHT_LOSS_FACTOR*distance;
			System.out.printf("%.2f\n",distance);
		}
		else   //否则如果distance=0
			System.out.println("Staying put");  //如果distance==0 那就没有动
	}

	private static double calculateDistance(double x1,double y1,double x2,double y2){
		return Math.sqrt((y2-y1)*(y2-y1)+(x2-x1)*(x2-x1));
	}

	public static void main(String[] args){
		Insect3 bug1=new Insect3(10,100,90);
		Insect3 bug2=new Insect3(9.5,-300,400);

		bug1.move(1,10);
		bug2.move(-300,400);
	}
}














