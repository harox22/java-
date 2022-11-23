//sparse array and null cheacking 稀疏数组 和空值的处理
//调用main
//新建array，设置array各个元素值
//定义查找目标
//定义result的默认值为not found
//使用for遍历array的元素
//用equal判断查找目标是否和元素相等。使用&& 如果是空值就利用short circuit evaluation跳过
//如果找到目标，就break，不继续找
//输出结果

public class array3{
	public static void main(String[] args){
		String[] array3=new String[5];
		array3[0]="how";
		array3[1]="are";
		array3[3]="you";  //注意没有index2 因为为空值null
		array3[4]="now";

		String target_str="hello";

		String result="not found";  //默认result为not found 如果找到了再改为found

		for (String single_str:array3){
			if (single_str != null && single_str.equals(target_str)){
				result="found";
				break;
			}
		}
		System.out.println("the result is "+result);	
	}
}