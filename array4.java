public class array4{
	public static void main(String[] args){
		double sum=0;
		for (String num:args){
			sum+=Double.parseDouble(num); //将num从string类型变成double类型
		}
		double average=(args.length>0)?(sum/args.length):0;
		System.out.println("average is "+average);
	}	
}