//frog.java   fly.java   pond.java

public class Frog{
	private String name;
	private int age;
	private double tongueSpeed;
	private boolean isFroglet;
	private static String species="Rare Pepe";
	private boolean latest_isFroglet;
	public static double min_tongue=5;

	//constructor
	public Frog(String name,int age,double tongueSpeed){
		this.name=name;
		this.age=age;
		this.tongueSpeed=tongueSpeed;
		this.isFroglet=false;
		this.latest_isFroglet();
	}

	public Frog(String name,double ageInYears){
		this(name,(int)(ageInYears*12),5);
	}

	public Frog(String name){
		this(name,5,5);
	}	
	
	//method
	public void grow(int add_age){
        	int increase_factor = 1;
		int decrease_factor = -1;
      		int increase = this.age < 12 ? (int)Math.min(Math.ceil(12.0 - this.age), add_age) * increase_factor:0;
        	int decrease = this.age + add_age > 30 ? (int)(this.age + add_age - 30) * decrease_factor:0;
        	this.age += add_age;
        	this.latest_isFroglet();
        	this.tongueSpeed = Math.max(this.tongueSpeed + increase + decrease, min_tongue);
    }

	public void latest_isFroglet(){
		if (this.age>1 && this.age<7){
			this.isFroglet=true;
		}
		else
			this.isFroglet=false;
	}
	
	public void eat(Fly fly){
		if (fly.isDead()==false){
			if (this.tongueSpeed>fly.getSpeed()){
			//eat==true;
				if (fly.getMass()>=0.5*this.age)
					this.grow(1);
				fly.setMass(0);
			}else{
				fly.setMass(fly.getMass()+1);
			}
		}
	}	
	
	public String toString(){
		if (isFroglet==true){
			return String.format("My name is %s and I’m a rare froglet! I’m %d months old and my tongue has a speed of %.2f.",this.name,this.age,this.tongueSpeed);
		}
		else{
			return String.format("My name is %s and I’m a rare frog. I’m %d months old and my tongue has a speed of %.2f.",this.name,this.age,this.tongueSpeed);
		}
	}

	public static void setSpecies(String newspecies){
		species=newspecies;
	}

	public static String getSpecies(){
		return species;
	}

	public static void main(String[] args){
		Frog frog1=new Frog("f1");
		System.out.println(frog1.toString());

		Frog frog2=new Frog("f2",20,8.8);
		System.out.println(frog2.toString());
	}
}







