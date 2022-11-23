//写一个完整的 包括population 和ProduceRandomFACT
//variable和constant
//class Insect10
//constructor 
//move method
//calculateDistance
//eat method
//population 
//ProduceRandomFACT method
//main method


public class Insect10{
	private int X;
	private int Y;
	private double Weight;

	private static final double DIST_WEIGHT_LOSS_FACTOR=0.01;
	private static int population=0;
	private static final String[] FACT={
	"insect good",
	"insect beautiful",
	"insect lovely",
	"insect big",
	};  //这是一个array 不是函数

	public Insect10(int initX,int initY,double initWeight){
		X=initX;
		Y=initY;
		Weight=initWeight;	
		population++;  //main函数没调用一次构造函数insect数量就增加1
	}

	public void move(int newX,int newY){
		double distance=calculateDistance(X,Y,newX,newY);
		if (distance>0){
			X=newX;
			Y=newY;
			Weight=Weight*DIST_WEIGHT_LOSS_FACTOR*distance;
			System.out.printf("the insect move %.2f\n",distance);
		}else{
			System.out.println("did not move.");
		}
	}
	
	private static double calculateDistance(int x1,int y1,int x2,int y2){
		return Math.sqrt((x1-x2)*(x1-x2)-(y1-y2)*(y1-y2));
	}

	public void eat(double amount){
		Weight=Weight+amount;
	}

	public static String ProduceRandomFACT(){
		int index=(int)(Math.random()*((FACT.length-1)+1));
		return FACT[index];
	}

	public static void main(String[] args){
		System.out.println("the insect number is "+population);
		Insect10 buzz1=new Insect10(0,0,100);
		System.out.println("the insect number is "+population);
		Insect10 buzz2=new Insect10(10,10,200);
		System.out.println("the insect number is "+population);

		buzz1.move(300,40);
		buzz2.move(200,100);
		
		System.out.println(ProduceRandomFACT());
	}
	
	
}







