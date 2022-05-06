public class GameResolver {
	
    static String winner = "";
	public static String checkWinner(int[][] board) {
	
		int line = 0;
		Board seed = new Board();
		for(int i = 0; i<8; i++) {
		
			switch (i) {
				case 0: 
				    line = board[0][0] + board[0][1] + board[0][2];
				    break;
				case 1: 
				    line = board[1][0] + board[1][1] + board[1][2];
				    break;
				case 2: 
				    line = board[2][0] + board[2][1] + board[2][2];
				    break;
				case 3: 
				    line = board[0][0] + board[1][0] + board[2][0];
				    break;     
				case 4: 
				    line = board[0][1] + board[1][1] + board[2][1];
				    break;
				case 5: 
				    line = board[0][2] + board[1][2] + board[2][2];
				    break;
				case 6: 
				    line = board[0][0] + board[1][1] + board[2][2];
				    break;
				case 7: 
				    line = board[0][2] + board[1][1] + board[2][0];
				    break;
			}
		    if(line == 3) {
                winner = "X"; 
                return winner;
            }
		    else if(line == 12) {
                winner = "O";
                return winner;
            }
		}
        if(seed.isFull(board)) {winner = "T";}
		return winner;
	}	
    
    public static void displayWinner(int obj) {

        if(winner.equals("X") & obj == 1) {System.out.println("Player wins!");}
        else if(winner.equals("X") & obj == 2) {System.out.println("Player 1 wins!");}
        else if(winner.equals("O") & obj == 1) {System.out.println("Computer won.");}
        else if(winner.equals("O") & obj == 2) {System.out.println("Player 2 wins!");}
        else {System.out.println("Game ended in a draw.");}
    }
}



























