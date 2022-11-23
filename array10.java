//这个array10.java程序要调用array9.java里的class和method
//如何调用别的程序的class和method？用.就可以

public class array10{
	public static void main(String[] args){
		String[] another_array={"five","seven","ten"};
		System.out.println(array9.searchStringArray("five",another_array)); 
		//调用其他程序的class里的method，直接加上.就可以使用
		System.out.println(array9.searchStringArray("six",another_array));
	}
}
