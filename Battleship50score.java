//玩家一和玩家二的船坐标
//玩家一hit的坐标
//玩家二hit的坐标

//新建玩家一船坐标2d array 含5个坐标
//新建玩家一船坐标2d array 含5个坐标

//循环以下
//新建游戏棋盘
//如果玩家一hit到玩家二，则打印玩家一hit，坐标改为x，否则坐标保留为0；将玩家一的船坐标减少一；
//如果玩家二hit到玩家一，则打印玩家二hit，坐标改为x，否则坐标保留为0；将玩家二的船坐标减少一；

//玩家一和玩家二的初始血都是5，每hit到一次减少一份血 循环直到一方血为0 结束

//搞一个循环的method
//

import java.util.Scanner;
public class Battleship50score{
	public static void main(String[] args){
		//欢迎语
		System.out.println("Welcome to Battleship!");
		System.out.println();
		System.out.println("PLAYER 1, ENTER YOUR SHIPS’ COORDINATES.");

		Scanner input =new Scanner(System.in);	
		String errorMessage="Invalid coordinates. Choose different coordinates.";
		
		//初始化玩家一的船坐标，行和列的array：player1_ship_row和player1_ship_col
		//初始化玩家一的船坐标，行和列的array
		int[] player1_ship_row={0,0,0,0,0};
		int[] player1_ship_col={0,0,0,0,0};
		int[] player2_ship_row={0,0,0,0,0};
		int[] player2_ship_col={0,0,0,0,0};

		//玩家一和玩家二的初始血都是5
		int player1_blood=5;
		int player2_blood=5;

		//玩家一的船坐标输入array 与打印在console的array1 
		int[][] array=new int[5][2];
		String[][] array1={{"-","-","-","-","-","-"},{"-","-","-","-","-","-"},{"-","-","-","-","-","-"},{"-","-","-","-","-","-"},{"-","-","-","-","-","-"},{"-","-","-","-","-","-"}};
		array1[0][0]=""; array1[0][1]="0";array1[0][2]="1";array1[0][3]="2";array1[0][4]="3";array1[0][5]="4";array1[1][0]="0";array1[2][0]="1";array1[3][0]="2";array1[4][0]="3";array1[5][0]="4";	
	
		//用户在array里输入玩家一的行坐标和列坐标
		for (int counter=0;counter<=4;counter++){	
			System.out.println("Enter ship "+(counter+1)+" location:");
			if (input.hasNextInt()){
				int num_row=input.nextInt();
				array[counter][0]=num_row;
					if (input.hasNextInt()){
						int num_col=input.nextInt();
						array[counter][1]=num_col;

						//如果玩家一输入的坐标与之前的重复 就重新输入
						for (int counter_dup=0;counter_dup<counter;counter_dup++){
							if ((counter!=0)&&(num_row==array[counter_dup][0])&&(array[counter_dup][1]==num_col)){
								System.out.println("You already have a ship there. Choose different coordinates.");
								counter--;
								break;
							}	
						}
						
						//如果输入的玩家一的坐标超过5，就重新输入
						if (num_row>5 || num_col>5){
							System.out.println("Invalid coordinates. Choose different coordinates.");
							counter--;
							
						
						}else{
						//将玩家一的船坐标在array1上标为@
						//将合格的玩家一的船坐标放到	玩家一行和列的一维array：player1_ship_row和player1_ship_col
							array1[num_row+1][num_col+1]="@";
							player1_ship_row[counter]=num_row+1;
							player1_ship_col[counter]=num_col+1;
						}
						
					}else{
					System.out.println(errorMessage);
					}
			}else{
				System.out.println(errorMessage);
			}			
		}	
			
		//打印玩家一的船坐标图
		for(int i=0;i<array1.length;i++){
    			for(int j=0;j<array1[i].length;j++){
    				System.out.print(array1[i][j]+" ");
			
    	 		}
		System.out.println("");
		}



		//初始化玩家二的船坐标，行和列的array：player2_ship_row和player2_ship_col
		//初始化玩家二的船坐标，行和列的array2
		System.out.println("PLAYER 2, ENTER YOUR SHIPS’ COORDINATES.");
		int[][] array2=new int[5][2];
		String[][] array3={{"-","-","-","-","-","-"},{"-","-","-","-","-","-"},{"-","-","-","-","-","-"},{"-","-","-","-","-","-"},{"-","-","-","-","-","-"},{"-","-","-","-","-","-"}};
		array3[0][0]="";array3[0][1]="0";array3[0][2]="1";array3[0][3]="2";array3[0][4]="3";array3[0][5]="4";array3[1][0]="0";array3[2][0]="1";array3[3][0]="2";array3[4][0]="3";array3[5][0]="4";	
	
		//用户在array2里输入玩家二的行坐标和列坐标
		for (int counter=0;counter<=4;counter++){	
			System.out.println("Enter ship "+(counter+1)+" location:");
			if (input.hasNextInt()){
				int num_row=input.nextInt();
				array2[counter][0]=num_row;
				if (input.hasNextInt()){
					int num_col=input.nextInt();
					array2[counter][1]=num_col;
						
					///如果玩家二输入的坐标与之前的重复 就重新输入
					for (int counter_dup=0;counter_dup<counter;counter_dup++){
						if ((counter!=0)&&(num_row==array2[counter_dup][0])&&(array2[counter_dup][1]==num_col)){
							System.out.println("You already have a ship there. Choose different coordinates.");
							counter--;
							break;		
						}	
					}

					////如果输入的玩家二的坐标超过5，就重新输入
					if (num_row>5 || num_col>5){
						System.out.println("Invalid coordinates. Choose different coordinates.");
						counter--;	
					}else{	
						//将玩家二的船坐标在array3上标为@
						//将合格的玩家二的船坐标放到	玩家二行和列的一维array：player2_ship_row和player2_ship_col
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
			
		//打印玩家二的船坐标图
		for(int i=0;i<array3.length;i++){
    			for(int j=0;j<array3[i].length;j++){
    				System.out.print(array3[i][j]+" ");
			
    	 		}
		System.out.println("");
		}


//以下开始hit
		//新建player12_hit，玩家一二的操作在player12_hit上记录
		String[][] player12_hit={{"-","-","-","-","-","-"},{"-","-","-","-","-","-"},{"-","-","-","-","-","-"},{"-","-","-","-","-","-"},{"-","-","-","-","-","-"},{"-","-","-","-","-","-"}};
		player12_hit[0][0]="";player12_hit[0][1]="0";player12_hit[0][2]="1";player12_hit[0][3]="2";player12_hit[0][4]="3";player12_hit[0][5]="4";player12_hit[1][0]="0";player12_hit[2][0]="1";player12_hit[3][0]="2";player12_hit[4][0]="3";player12_hit[5][0]="4";

	
		//将玩家一的hit表示在player12_hit上
		//玩家一输入hit的坐标
		int[][] dul1={{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0}};
		
		for(int counter=1;counter<2;counter++){
			System.out.print("Player 1, enter hit row/column:\n");
			if (input.hasNextInt()){
				int player1_hit_row=input.nextInt();
				
					if (input.hasNextInt()){
						int player1_hit_col=input.nextInt();
						
						//如果已经输入过的，则输出You already fired on this spot. Choose different coordinates.
						for (int counter_dup=0;counter_dup<25;counter_dup++){
							dul1[counter_dup][0]=player1_hit_row;
							dul1[counter_dup][1]=player1_hit_col;
							if ((player1_hit_row==dul1[counter_dup][0])&&(dul1[counter_dup][1]==player1_hit_col)){
								System.out.println("You already fired on this spot. Choose different coordinates.");
								counter_dup--;
								break;		
							}	
						}
						//如果玩家一hit的坐标超过5 则重新输入
						if ((player1_hit_row>5) || (player1_hit_col>5)){
							System.out.println("Invalid coordinates. Choose different coordinates.");
							counter--;
						}else{
							//将玩家一hit的坐标表示在player12_hit上，用0表示
							player12_hit[player1_hit_row+1][player1_hit_col+1]="O";

							//默认玩家一没有hit到 如果hit到 则改result_text为hit到
							String result_text="PLAYER 1 MISSED!";

							//如果玩家一hit的坐标是玩家二的船坐标，则输出玩家一hit到了玩家二，且标记为X
							//玩家二血减少1
							//如果玩家二血为0，则结束游戏
							for(int i=0;i<=4;i++){
								if ((player1_hit_row+1==player2_ship_row[i] )&&( player1_hit_col+1==player2_ship_col[i] )){
									System.out.println("player1 hit player2");
									player12_hit[player1_hit_row+1][player1_hit_col+1]="X";
									player2_blood--;
									if (player2_blood==0){
										System.out.println("PLAYER 1 WINS! YOU SUNK ALL OF YOUR OPPONENT’S SHIPS!");
										break;
									}
								}else{
									System.out.println("[PLAYER 1 MISSED!");
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
		//输出result_text
		//System.out.println(result_text);
		//输出player12_hit图
		for(int i=0;i<player12_hit.length;i++){
    				for(int j=0;j<player12_hit[i].length;j++){
    					System.out.print(player12_hit[i][j]+" ");
     				}
			System.out.println("");
		}
//player2 hit
		//玩家二还是在player12_hit上进行hit
		int[][] dul2={{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0}};
		//玩家二输入hit的坐标
		for(int counter=1;counter<2;counter++){
			System.out.print("Player 2, enter hit row/column:\n");
			if (input.hasNextInt()){
				int player2_hit_row=input.nextInt();
					if (input.hasNextInt()){
						int player2_hit_col=input.nextInt();
						
						//如果已经输入过的，则输出You already fired on this spot. Choose different coordinates.
						for (int counter_dup=0;counter_dup<25;counter_dup++){
							dul2[counter_dup][0]=player2_hit_row;
							dul2[counter_dup][1]=player2_hit_col;
							if ((player2_hit_row==dul2[counter_dup][0])&&(dul2[counter_dup][1]==player2_hit_col)){
								System.out.println("You already fired on this spot. Choose different coordinates.");
								counter_dup--;
								break;		
							}	
						}

						//如果玩家二输入的坐标大于5，则重新输入
						if (player2_hit_row>5 || player2_hit_col>5){
							System.out.println("Invalid coordinates. Choose different coordinates.");						
							counter--;								
						}else{
							//如果玩家二hit到玩家一的坐标，则输出玩家二hit到玩家一 并且玩家二hit的坐标改为x，
							//如果玩家二hit到玩家一的坐标，则玩家一减少血一份
							player12_hit[player2_hit_row+1][player2_hit_col+1]="O";
							String result_text="player2 missed";
							for(int i=0;i<=4;i++){
								if ((player2_hit_row+1==player1_ship_row[i] )&&(player2_hit_col+1==player1_ship_col[i] )){
									System.out.println("player2 hit player1");
									player12_hit[player2_hit_row+1][player2_hit_col+1]="X";
									player1_blood--;
									if (player1_blood==0){
										System.out.println("PLAYER 2 WINS! YOU SUNK ALL OF YOUR OPPONENT’S SHIPS!");
										break;
									}
								}else{
									System.out.println("[PLAYER 2 MISSED!");
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
		//输出text_result
		//System.out.println(result_text);
		//输出player12_hit图
		for(int i=0;i<player12_hit.length;i++){
    			for(int j=0;j<player12_hit[i].length;j++){
    				System.out.print(player12_hit[i][j]+" ");
     			}
		}
	}
}



















