//调用main函数
//创建一个二维数组
//初始化最小值最大值
//用嵌套循环判断数组里的每个元素都处于最小值和最大值之间
//输出结果

public class array6{
	public static void main(String[] args){
		double[][] array2d={{22,33,44},{55,66,77}};

		final double min_tem=10;
		final double max_tem=100;
	
		for (int row=0;row<array2d.length;row++){
			for (int col=0;col<array2d[row].length;col++){
				if ((array2d[row][col]>min_tem) && (array2d[row][col]<max_tem)){
					System.out.println("go to park");
				}
			}
		}
	}

}