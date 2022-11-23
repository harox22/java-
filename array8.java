//method
//调用main函数
//定义searchStringArray method
//判断一个string在不在array中

public class array8{
	public static void main(String[] args){
		String[] array8={"one","thirty","two"};
		String result=searchStringArray("zero",array8); //这里的result和searchStringArray的result在不同的范围 所以不用担心会有冲突
		System.out.println(result);
	
		result=searchStringArray("one",array8);
		System.out.println(result);
	}

	public static String searchStringArray(String target,String[] array){
		String result="not found";
		for (String element:array){
			if (element.equals(target)){
				result="found";
				break;
			}
		}
		
		return result;
	}



}