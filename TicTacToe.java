import java.util.Scanner;

public class TicTacToe {
	public static void main(String[] args) {

        System.out.println("Welcome to Tic Tac Toe");

        Scanner myObj = new Scanner(System.in);
        System.out.println("Select an option:");
        System.out.println("1. Single Player");
        System.out.println("2. Multi Player");
            
        Board board = new Board();
		int obj = myObj.nextInt();

        switch (obj) {
            case 1:
                System.out.println("Player 1 [X]  -  Computer [O]");
                board.instructionBoard();
                Player player = new Player();
                Computer computer = new Computer();
                while(true) {
                    player.playTurn(board.getBoard());
                    board.displayBoard();
                    if(GameResolver.checkWinner(board.getBoard()).equals("X") | board.isFull(board.getBoard())) {break;}
                    computer.playTurn(board.getBoard());
                    board.displayBoard();
                    if(GameResolver.checkWinner(board.getBoard()).equals("O") | board.isFull(board.getBoard())) {break;}                      
                }
                GameResolver.displayWinner(obj);
                break;
            case 2:
                System.out.println("Player 1 [X]  -  Player 2 [O]");
                board.instructionBoard();
                Player player1 = new Player(1, "X");
                Player player2 = new Player(2, "O");
                while(true) {
                    player1.playTurn(board.getBoard());
                    board.displayBoard();
                    if(GameResolver.checkWinner(board.getBoard()).equals("X") | board.isFull(board.getBoard())) {break;}
                    player2.playTurn(board.getBoard());
                    board.displayBoard(); 
                    if(GameResolver.checkWinner(board.getBoard()).equals("O") | board.isFull(board.getBoard())) {break;}
                }
                GameResolver.displayWinner(obj);
                break;
        }
	}	
}





















