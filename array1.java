//方法二 用for遍历array里的element
public class array1{
	public static void main(String[] args){
		double[] weight={34,56,78,90,54};
		double sum=0;
		for(double single_weight:weight){
			sum=sum+single_weight;
		}
		double average_weight=sum/weight.length;
		System.out.println("the average weight is:"+average_weight);	
	}
}