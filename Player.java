import java.util.Scanner;

public class Player {
	
	
	public static final int DEFAULT_PLAYER = 0;
	public static final String DEFAULT_SYMBOL = "X";
	
	int player;
	String symbol;
	
    public Player() { // 1st (default) Constructor
		this.player = DEFAULT_PLAYER;
		this.symbol = DEFAULT_SYMBOL;
	}
	
	public Player(int player, String symbol) { // 3rd Constructor
		this.player = player;
		this.symbol = symbol;
	}
	public void playTurn(int[][] board) {
	
		Scanner obj = new Scanner(System.in);
		
        while(true) {

        	if(this.player == 0) {
        		System.out.print("Player, Enter your desired position [1-9]: ");
        	}

            else {
                System.out.print("Player " + this.player + ", Enter your desired position [1-9]: ");
            }
            	
            int pos = obj.nextInt();
            int row = 0;
            int col = 0;
            if(pos < 10 & pos > 0) {
                row = (pos-1)/3;
                col = (pos - (row*3))-1;
        	}
            if(board[row][col] != 0 | pos > 9 | pos < 1) {System.out.println(pos + " is not a valid move.");}
            	
            else {
                if(this.symbol == "X") {board[row][col] = 1;}
                else {board[row][col] = 4;}
                break;
            }
        }
	}
}
