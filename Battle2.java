import java.util.Scanner;
public class Battle2{
	public static void main(String[] args){
		String[][] board = {{"red","black","black","black","black","black","black","black"},{"black","black","black","black","black","black","black","black"},{"black","black","black","black","black","black","black","black"},{"black","black","black","black","black","black","black","black"},{"black","black","black","black","black","black","black","black"},{"black","black","black","black","black","black","black","black"},{"black","black","black","black","black","black","black","black"},{"black","black","black","black","black","black","black","black"}};
		
		
		System.out.println(stillRed(board));

	}
	

	public static boolean stillRed(String[][] board){
		board = new String[8][8];
		
    		for (int r = 0; r <8; r++) {
     			for (int c = 0; c < 8; c++) {
       				if (board[r][c]!= null && board[r][c].equals("red")) {
                			return true;
            			}
        		}
    		}
		return false;
	}
    	
}