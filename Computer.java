public class Computer{

    public int getKey(String winner) {
        if(winner.equals("X")) {return -1;}
        else if(winner.equals("O")) {return 1;}
        else if(winner.equals("T")) {return 0;}
        return 0;
    }

	public static String checkStatus(int[][] board) {
	
		int line = 0;
        String winner = "";
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

    public int minimax(int[][] board, int depth, boolean isMaximizing) {

        String winner = checkStatus(board);
        if(!winner.equals("")) {
            int key = getKey(winner);
            return key;
        }

        if(isMaximizing) {
            int bestScore = Integer.MIN_VALUE;
            for(int i = 0; i < 3; i++) {
                for(int j = 0; j < 3; j++) {
                    if(board[i][j] == 0) {
                        board[i][j] = 4;
                        int score = minimax(board, depth + 1, !isMaximizing);
                        board[i][j] = 0;
                        bestScore = Math.max(score, bestScore);
                    }
                }
            }
            return bestScore;
        }
        else {
            int bestScore = Integer.MAX_VALUE;
            for(int i = 0; i < 3; i++) {
                for(int j = 0; j < 3; j++) {
                    if(board[i][j] == 0) {
                        board[i][j] = 1;
                        int score = minimax(board, depth + 1, !isMaximizing);
                        board[i][j] = 0;
                        bestScore = Math.min(score, bestScore);
                    }
                }
            }
            return bestScore;
        }
    }

    public void playTurn(int[][] board) {

        int bestScore = Integer.MIN_VALUE;
        int[] bestMove = new int[2];
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(board[i][j] == 0) {
                    board[i][j] = 4;
                    int score = minimax(board, 0, false);
                    board[i][j] = 0;
                    if(score > bestScore) {
                        bestScore = score;
                        bestMove[0] = i;
                        bestMove[1] = j;
                    }
                }
            }
        }
        board[bestMove[0]][bestMove[1]] = 4;
    }
}

























