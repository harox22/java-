//使用method，判断目标字符串是否在array中，并将result改为true或false
public class array9{
	public static void main(String[] args){
		String[] array9={"one","two","three"};
		System.out.println(searchStringArray("one",array9));
		System.out.println(searchStringArray("hello",array9));	
	}

	public static boolean searchStringArray(String target,String[] array){
		boolean result=false;
		for (String element:array){
			if (element.equals(target)){
				result=true;
				break;
			}
		}
		return result;
	}
}