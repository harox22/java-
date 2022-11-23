//frog.java   fly.java   pond.java
public class Pond{
	public static void main(String[] args){
		Frog frog1=new Frog("Peepo");
		Frog frog2=new Frog("Pepe",10,15);
		
		Frog frog3=new Frog("Peepa",55,5);
		Frog frog4=new Frog("Strong");	

		Fly fly1=new Fly(1,3);
		Fly fly2=new Fly(6);
		Fly fly3=new Fly(1,1);	

		Frog.setSpecies("1331 Frogs");
		System.out.println(frog1.toString());

		frog1.eat(fly2);
		System.out.println(fly2.toString());

		frog1.grow(8);
		frog1.eat(fly2);
		System.out.println(fly2.toString());
		System.out.println(frog1.toString());
		System.out.println(frog4.toString());

		frog3.grow(4);
		System.out.println(frog3.toString());
		System.out.println(frog2.toString());
	}
}