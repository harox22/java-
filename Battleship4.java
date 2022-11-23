//还差如果两个玩家的坐标输入大于5 没法报错重新输入


import java.util.Scanner;
public class Battleship4{
	public static void main(String[] args){
		//String[][] board = new String[5][5]；
		System.out.println("Welcome to Battleship!");
		System.out.println();
		System.out.println("PLAYER 1, ENTER YOUR SHIPS’ COORDINATES.");

		Scanner input =new Scanner(System.in);	
		String errorMessage="Invalid coordinates. Choose different coordinates.";
		
		int[] player1_ship_row={0,0,0,0,0};
		int[] player1_ship_col={0,0,0,0,0};
		int[] player2_ship_row={0,0,0,0,0};
		int[] player2_ship_col={0,0,0,0,0};
		
		

		//player 1
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
		array1[5][0]="4";	
	

		for (int counter=0;counter<=4;counter++){	
			System.out.println("Enter ship "+(counter+1)+" location:");
			if (input.hasNextInt()){
				int num_row=input.nextInt();
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
						if (num_row>5 || num_col>5){
							System.out.println("Invalid coordinates. Choose different coordinates.");
							counter--;
							
						
						}else{
							
							array1[num_row+1][num_col+1]="@";
							player1_ship_row[counter]=num_row+1;
							player1_ship_col[counter]=num_col+1;
						}
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
		array3[5][0]="4";	
	

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
					if (num_row>5 || num_col>5){
						System.out.println("Invalid coordinates. Choose different coordinates.");
						counter--;	
					}else{	
						array3[num_row+1][num_col+1]="@";
						player2_ship_row[counter]=num_row+1;
						player2_ship_col[counter]=num_col+1;	
				
					}
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


//player1_hit	
		
		String[][] player1_hit={{"-","-","-","-","-","-"},{"-","-","-","-","-","-"},{"-","-","-","-","-","-"},{"-","-","-","-","-","-"},{"-","-","-","-","-","-"},{"-","-","-","-","-","-"}};
		player1_hit[0][0]="";
		player1_hit[0][1]="0";
		player1_hit[0][2]="1";
		player1_hit[0][3]="2";
		player1_hit[0][4]="3";
		player1_hit[0][5]="4";
		player1_hit[1][0]="0";
		player1_hit[2][0]="1";
		player1_hit[3][0]="2";
		player1_hit[4][0]="3";
		player1_hit[5][0]="4";
		for(int counter=1;counter<2;counter++){
			System.out.print("Player 1, enter hit row/column:\n");
			if (input.hasNextInt()){
				int hit_row=input.nextInt();
				
					
					if (input.hasNextInt()){
						int hit_col=input.nextInt();
						
						if (hit_row>5 || hit_col>5){
							System.out.println("Invalid coordinates. Choose different coordinates.");
							
							counter--;
							
					
								
						}else{
							player1_hit[hit_row+1][hit_col+1]="O";
//这里	
							for(int i=0;i<=4;i++){
								if ((hit_row+1==player2_ship_row[i] )&&( hit_col+1==player2_ship_col[i] )){
									System.out.println("player1 hit player2");
									player1_hit[hit_row+1][hit_col+1]="X";
								}
							}
						}
						
						
					}else{
					System.out.println(errorMessage);
					}
			}else{
				System.out.println(errorMessage);
			}		

		}
		System.out.println("PLAYER 1 MISSED!"); //测试用
		for(int i=0;i<player1_hit.length;i++){
    				for(int j=0;j<player1_hit[i].length;j++){
    					System.out.print(player1_hit[i][j]+" ");
    	 			}
			System.out.println("");
			}


//player2 hit
		
		String[][] player2_hit={{"-","-","-","-","-","-"},{"-","-","-","-","-","-"},{"-","-","-","-","-","-"},{"-","-","-","-","-","-"},{"-","-","-","-","-","-"},{"-","-","-","-","-","-"}};
		player2_hit[0][0]="";
		player2_hit[0][1]="0";
		player2_hit[0][2]="1";
		player2_hit[0][3]="2";
		player2_hit[0][4]="3";
		player2_hit[0][5]="4";
		player2_hit[1][0]="0";
		player2_hit[2][0]="1";
		player2_hit[3][0]="2";
		player2_hit[4][0]="3";
		player2_hit[5][0]="4";
		for(int counter=1;counter<2;counter++){
			System.out.print("Player 2, enter hit row/column:\n");
			if (input.hasNextInt()){
				int hit_row=input.nextInt();
				
					
					if (input.hasNextInt()){
						int hit_col=input.nextInt();
						
						if (hit_row>5 || hit_col>5){
							System.out.println("Invalid coordinates. Choose different coordinates.");
							
							counter--;
							
					
								
						}else{
							player2_hit[hit_row+1][hit_col+1]="O";
							for(int i=0;i<=4;i++){
								if ((hit_row+1==player1_ship_row[i] )&&( hit_col+1==player1_ship_col[i] )){
									System.out.println("player2 hit player1");
									player2_hit[hit_row+1][hit_col+1]="X";
								}
							}
						}
						
						
					}else{
					System.out.println(errorMessage);
					}
			}else{
				System.out.println(errorMessage);
			}		

		}
		System.out.println("PLAYER 2 MISSED!"); //测试用
		for(int i=0;i<player2_hit.length;i++){
    				for(int j=0;j<player2_hit[i].length;j++){
    					System.out.print(player2_hit[i][j]+" ");
    	 			}
			System.out.println("");
			}



	
	
	}
}



















