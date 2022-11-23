//加入constructor reloading其实就是constructor的参数从3个变成一个
//使用setter和getter

public class Insect12{
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

	private static final int Default_X=0;
	private static final int Default_Y=0;

	
	//constructor1 ,constructor reloading~~~
	public Insect12(double initWeight){  //所以有两个相同名字的Insect11 constructor也可以
		X=Default_X;
		Y=Default_Y;
		Weight=initWeight;
		population++;
	}

	//constructor2
	public Insect12(int initX,int initY,double initWeight){
		X=initX;
		Y=initY;
		Weight=initWeight;	
		population++;  //main函数每调用一次构造函数insect数量就增加1
	}

	//getter 
	public double getWeight(){
		return Weight;
	}

	//getter 
	public double getX(){
		return X;
	}

	//getter 
	public double getY(){
		return Y;
	}

	//getter
	public static int getPopulation(){
		return population;
	}

	//setter
	public void setX(int newX){
		if (isLegalX(newX)){  //下面需要定义isLegal函数
			X=newX;
		}
	}

	//setter
	public void setY(int newY){
		if (isLegalY(newY)){   //只有isLegal为true时，才能用newY代替Y.如果是负数的话 那么setY的if语句不会执行，Y的值不会改变
			Y=newY;
		}
	}

	//isLegalX函数用于上面的setter
	public static boolean isLegalX(int newX){
		return (newX>=0?true:false);
	}

	public static boolean isLegalY(int newY){
		return (newY>=0?true:false);    //如果是负数的话 那么setY的if语句不会执行，Y的值不会改变
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







