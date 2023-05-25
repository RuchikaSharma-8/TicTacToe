// Testing if SSH keys work
public class Board {
	
    private int[][] board = new int[3][3];
	
	public void instructionBoard() {
	
        System.out.println("This is a new game. Board numbers are as follows:");
		System.out.println(" 1 | 2 | 3 ");
		System.out.println("---|---|---");
		System.out.println(" 4 | 5 | 6 ");
		System.out.println("---|---|---");
		System.out.println(" 7 | 8 | 9 ");
	
	}
	
	public void displayBoard() {

        System.out.println(printBoardRow(0));	
		System.out.println("---|---|---");
        System.out.println(printBoardRow(1));
		System.out.println("---|---|---");
        System.out.println(printBoardRow(2));
	}

    private String printBoardRow(int row) {

        StringBuilder rowBuilder = new StringBuilder(" ");
        for(int i=0;i<board[0].length;i++){
            if(board[row][i] == 0) rowBuilder.append(" ");
            if(board[row][i] == 1) rowBuilder.append("X");
            if(board[row][i] == 4) rowBuilder.append("O");
            if(i==2) {rowBuilder.append(" ");}
            else {rowBuilder.append(" | ");}
        }
        rowBuilder.deleteCharAt(rowBuilder.lastIndexOf(" "));
        return rowBuilder.toString();
    }
 
    public boolean placePiece(int position, String pieceType) {
        
        int row = (position-1)/3;
        int col = (position - (row*3))-1;
        	
        if(board[row][col] == 0) {
        	
      		if (pieceType.equals("X")) board[row][col] = 1;
            if (pieceType.equals("O")) board[row][col] = 4;
           		return true;
        }
        return false; 
    }

    public boolean positionEmpty(int position) {
        
        int row = (position-1)/3;
        int col = (position - (row*3))-1;
        	
        if(board[row][col] == 0) {return true;}
        return false; 
    }

    public boolean isFull(int[][] board) { 
        
        for(int row = 0; row < board.length; row++) {
        	
            for(int col = 0; col < board[0].length; col++) {
            		
                if(board[row][col] == 0) return false;
            }
        }
        return true;
    }
	   
    public int[][] getBoard() {return board;} 
}
