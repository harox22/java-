import java.util.Scanner;
public class Battleship{
	public static void main(String[] args){
		//String[][] board = new String[5][5]；
		System.out.println("Welcome to Battleship!");
		System.out.println();
		System.out.println("PLAYER 1, ENTER YOUR SHIPS’ COORDINATES.");

		Scanner input =new Scanner(System.in);	
		String errorMessage="Invalid coordinates. Choose different coordinates.";
		
		int[][] array=new int[5][2];
		String[][] array1={{"-","-","-","-","-","-"},{"-","-","-","-","-","-"},{"-","-","-","-","-","-"},{"-","-","-","-","-","-"},{"-","-","-","-","-","-"},{"-","-","-","-","-","-"}};
		array1[0][0]="";
		array1[0][1]="0";
		array1[0][2]="1";
		array1[0][3]="2";
		array1[0][4]="3";
		array1[0][5]="4";
		array1[1][0]="0";
		array1[2][0]="1";
		array1[3][0]="2";
		array1[4][0]="3";
		array1[5][0]="3";	
	

		for (int counter=0;counter<=4;counter++){	
			System.out.println("Enter ship "+(counter+1)+" location:");
			if (input.hasNextInt()){
				int num_row=input.nextInt();
				if (num_row>5){
					System.out.println(errorMessage);
					coninue;

				}
					array[counter][0]=num_row;
					if (input.hasNextInt()){
						int num_col=input.nextInt();
						array[counter][1]=num_col;
						for (int counter_dup=0;counter_dup<counter;counter_dup++){
							if ((counter!=0)&&(num_row==array[counter_dup][0])&&(array[counter_dup][1]==num_col)){
								System.out.println("You already have a ship there. Choose different coordinates.");
								counter--;
								break;
							}	
						}
						array1[num_row+1][num_col+1]="@";
						//System.out.println(num_row+""+num_col+"@");
					}else{
					System.out.println(errorMessage);
					}
			}else{
				System.out.println(errorMessage);
			}			
		}	
			

		for(int i=0;i<array1.length;i++){
    			for(int j=0;j<array1[i].length;j++){
    				System.out.print(array1[i][j]+" ");
			
    	 		}
		System.out.println("");
		}



		//player 2
		System.out.println("PLAYER 2, ENTER YOUR SHIPS’ COORDINATES.");
		int[][] array2=new int[5][2];
		String[][] array3={{"-","-","-","-","-","-"},{"-","-","-","-","-","-"},{"-","-","-","-","-","-"},{"-","-","-","-","-","-"},{"-","-","-","-","-","-"},{"-","-","-","-","-","-"}};
		array3[0][0]="";
		array3[0][1]="0";
		array3[0][2]="1";
		array3[0][3]="2";
		array3[0][4]="3";
		array3[0][5]="4";
		array3[1][0]="0";
		array3[2][0]="1";
		array3[3][0]="2";
		array3[4][0]="3";
		array3[5][0]="3";	
	

		for (int counter=0;counter<=4;counter++){	
			System.out.println("Enter ship "+(counter+1)+" location:");
			if (input.hasNextInt()){
				int num_row=input.nextInt();
				
					array2[counter][0]=num_row;
					if (input.hasNextInt()){
						int num_col=input.nextInt();
						array2[counter][1]=num_col;
						for (int counter_dup=0;counter_dup<counter;counter_dup++){
							if ((counter!=0)&&(num_row==array2[counter_dup][0])&&(array2[counter_dup][1]==num_col)){
								System.out.println("You already have a ship there. Choose different coordinates.");
								counter--;
								break;
							}	
						}
						array3[num_row+1][num_col+1]="@";
						//System.out.println(num_row+""+num_col+"@");
					}else{
					System.out.println(errorMessage);
					}
			}else{
				System.out.println(errorMessage);
			}			
		}	
			

		for(int i=0;i<array3.length;i++){
    			for(int j=0;j<array3[i].length;j++){
    				System.out.print(array3[i][j]+" ");
			
    	 		}
		System.out.println("");
		}	
	}
}