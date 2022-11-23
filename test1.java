//a simple point class

/public modifier
/*
public class Point{
	public double x;
	public double y;
}
*/

//private modifier
public class Point{
	private double x;
	private double y;
	
	//private modifier need the setter and the getter	
	public void setX(double new_x){
		x=new_x;
	}

	public double getX(){
		return x;
	}

	//constructor
	public Point(double a,double b){
		x=a;
		y=b;
	}

	//constructor example 2
	public Point(double x,double y){
		this.x=x;  //this的作用：only necessary when the variable name is the same to specify instance variable
		this.y=y;
		
	}

	//constructor example 3
	public Point(double a){  //只有一个参数表示这个参数是x
		this(a,0);  //x=a,y=0
	}
}
















