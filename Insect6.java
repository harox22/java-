//class Insect6
//constructor
//move method
//calculateDistance
//eat method
//main函数


public class Insect6{
	int X;    //....为什么要是private
	int Y;    
	double Weight;
	double DIST_WEIGHT_LOSS_FACTOR=0.01;  //为什么要是public static final?

	public Insect6(int init_X,int init_Y,double init_Weight){
		X=init_X;
		Y=init_Y;
		Weight=init_Weight;
	}

	public void move(int final_X,int final_Y){
		double distance=calculateDistance(X,Y,final_X,final_Y);

		if (distance>0){
			X=final_X;
			Y=final_Y;
			Weight=Weight*distance*DIST_WEIGHT_LOSS_FACTOR;
			System.out.printf("the insect move %.2f\n",distance);
		}else{
			System.out.println("did not move.");
		}
	}

	private static double calculateDistance(int x1,int y1,int x2,int y2){
		return Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
	}


	public void eat(double amount){
		Weight=Weight+amount;
	}

	public static void main(String[] args){
		Insect6 buzz1=new Insect6(10,20,100);
		Insect6 buzz2=new Insect6(30,40,200);
		buzz1.move(120,140);
		buzz2.move(50,60);
	}



}