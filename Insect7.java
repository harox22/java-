//计算insect的move distance，再加上insect的population
//class Insect7
//constructor
//move method和calculateDistance
//eat method
//main函数和population

public class Insect7{
	private int X;
	private int Y;
	private double Weight;
	public static final double DIST_WEIGHT_LOSS_FACTOR=0.01;
	private static int population;

	public Insect7(int initX,int initY,double initWeight){
		X=initX;
		Y=initY;
		Weight=initWeight;
		population++;	//每调用一次Insect7 constructor就增加一个insect population
	}

	public void move(int newX,int newY){
		double distance=calculateDistance(X,Y,newX,newY);
		System.out.printf("%.2f\n",distance);	
		if (distance>0){
			X=newX;
			Y=newY;
			System.out.printf("the insect move %.2f\n",distance);
		}else{
			System.out.println("the insect did not move.");
		}
		
	}
	
	private static double calculateDistance(int x1,int y1,int x2,int y2){
		return Math.sqrt((x1-x2)*(x1-x2)-(y1-y2)*(y1-y2));
	}
	
	public void eat(double amount){
		Weight=Weight+amount;
		System.out.printf("the new weight is:%.2f\n",Weight);
	}
	
	public static void main(String[] args){
		System.out.printf("the insect number is "+population+"\n");
		Insect7 buzz1=new Insect7(0,0,100);
		System.out.printf("the insect number is "+population+"\n");
		Insect7 buzz2=new Insect7(50,50,200);
		System.out.printf("the insect number is "+population+"\n");

		buzz1.move(0,0);
		buzz2.move(0,50);
	}
}