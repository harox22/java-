//要调用Insect12里的Insect类 新建buzz1 object 然后利用get函数打印出buzz1的X,Y和weight,
//然后利用set函数改变buzz1的X,再利用get函数打印出来
//然后新建buzz2对象，buzz2用了constructor reloading，利用get函数得到buzz2的X,Y和weight

public class Insect12Client{
	public static void main(String[] args){
		Insect12 buzz1=new Insect12(10,10,100);
		System.out.println(buzz1.getX());
		System.out.println(buzz1.getY());
		System.out.println(buzz1.getWeight());
		System.out.println(buzz1.getPopulation());

		//利用set函数重制X的值
		buzz1.setX(50);
		System.out.println(buzz1.getX());

				
		Insect12 buzz2=new Insect12(100); //这个是construction reloading，100是weight;
		System.out.println(buzz2.getX());
		System.out.println(buzz2.getY());
		System.out.println(buzz2.getWeight());
		System.out.println(buzz2.getPopulation());
	}
}