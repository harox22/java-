public class Insect11Client{
	public static void main(String[] args){
		System.out.println(Insect11.ProduceRandomFACT());
		Insect11 buzz1=new Insect11(13,31,100);

		//getter
		System.out.println(buzz1.getWeight());
		
		System.out.println("original X is:"+buzz1.getX());
		//setter
		buzz1.setX(250);
		//getter
		System.out.println("latest X is:"+buzz1.getX());

		System.out.println("original Y is:"+buzz1.getY());
		//setter
		buzz1.setY(-250);   //负数的话Y的值不会变化
		//getter
		System.out.println("the latest Y is:"+buzz1.getY());

		System.out.println(Insect11.getPopulation());
		
	}
}