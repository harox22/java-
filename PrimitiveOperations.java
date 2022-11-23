public class PrimitiveOperations{
	public static void main(String[] args){
		
		int a=100;
		double b=1.11,c=2.22;
		char f='f';
		
		//1. 
		System.out.println(a);
		System.out.println(b);
	
		//2.
		c = a * b;
		System.out.println(c);
	
		//3. 4.
		double d = (double) a;
		int e = (int) b;
		System.out.println(d);
		System.out.println(e);

		//5.
		String strf=String.valueOf(f);
		String upperf = strf.toUpperCase();
		System.out.println(upperf);

		//6.
		//System.out.println(f);
		int h=(int) f;
		//System.out.println(h);
		int i=h-32;
		//System.out.println(i);
		char g = (char) i;
		System.out.println(g);	
	}
}
    