public class StringOperations{
	public static void main(String[] args){
		String name="Java";
		int num=name.length();
		String newName="A"+name.substring(1,num-1)+"Z";
		//1.
		System.out.println(newName);

		//2.
		System.out.println("www."+name+".tld");

		//3.
		System.out.println("www."+name+"1331");


	}
}