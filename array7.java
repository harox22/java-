//ragged array
//新建一个两行的array
//新建array的第一行
//给array的第一行赋值
//新建array第二行
//给array的第二行赋值

public class array7{
	public static void main(String[] args){
		double[][] array7=new double[2][]; //新建2行的array
		
		//新建array第一行
		array7[0]=new double[3];
		array7[0][0]=23;
		array7[0][1]=34;
		array7[0][2]=44;

		//新建array第二行
		array7[1]=new double[4];
		array7[1][0]=445;
		array7[1][1]=65;
		array7[1][2]=89;
		array7[1][3]=2;

	}
}