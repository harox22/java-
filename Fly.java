//frog.java   fly.java   pond.java
public class Fly{
	private double mass;
	private double speed;

	//Constructors
	public Fly(double mass,double speed){
		this.mass=mass;
		this.speed=speed;
	}

	public Fly(){
		this(10);
	}

	public Fly(double mass){
		this(5,10);
	}

	//Methods
	public double getMass(){
		return this.mass;
	}

	public void setMass(double mass){
		this.mass=mass;
	}

	public double getSpeed(){
		return this.speed;
	}

	public void setSpeed(double speed){
		this.speed=speed;
	}

	public String toString(){
		if (this.mass==0){
			return String.format("I’m dead, but I used to be a fly with a speed of %.2f.",this.speed);
		}
		else
			return String.format("I’m a speedy fly with %.2f speed and %.2f mass.",this.speed,this.mass);
		
	}

	public void grow(int add_mass){
		double increase_mass_factor = 1.0;
		double decrease_mass_factor = -0.5;
		double speedChange;
		int max_increase_mass = (int)Math.ceil(20.0 - this.mass);
		speedChange = 20-this.mass > 0 ? Math.min(max_increase_mass, add_mass) * increase_mass_factor:0;
        	speedChange += this.mass + add_mass - 20 > 0 ? Math.floor(this.mass + add_mass - 20) * decrease_mass_factor:0;
	
		this.mass=this.mass+add_mass;
		this.speed=this.speed+speedChange;
					
	}
	
	public boolean isDead(){
		if (mass==0){
			return true;
		}
		else{
			return false;
		}
	}
}












