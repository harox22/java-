//做一个ProduceRandomFact
public class Insect8{
	
	private static final String[] FACTS={     //这个是一个array 不是函数
		"insect may be wingless or winged",
		"there are more than 1 mil insect species",
		"insect are cold blood",
		"spiders are not considered as insect."	,
		"something else",
		"ect",
	};   //这个是一个array 不是函数

	public static String ProduceRandomFact(){
		int index=(int)(Math.random()*((FACTS.length-1)+1));
		return FACTS[index];

	}
}

//Math.random() returns a random double value that is greater than or equal to 0 and less than 1; i.e., the range [0,1).
//(int)(Math.random() * ((max - min) + 1)). 从0到FACTS.length-1 也就是：
//(int)(Math.random() * (((FACTS.length - 1)-0) + 1));


