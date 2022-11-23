//寻找一个字符串是否在某个字符串数组中
public class array2{
	public static void main(String[] args){
		String[] array2={"how","are","you","now"};
		String target="hello";
		String result="not found";
		for (String single_string:array2){
			if (single_string.equals(target)){
				result="found";
				break;  //加个break 找到了后面的就不用找了 不然浪费时间
			}
		}
		System.out.println("the target string is "+result);

	}


}