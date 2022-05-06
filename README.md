# TicTacToe
# AI Agent using Minimax Algorithm

HOW TO RUN THE PROGRAM :-

To run the program (play the game), enter the following commands in the terminal in the same order:

javac Board.java
javac GameResolver.java
javac Player.java
javac Computer.java
javac TicTacToe.java
java TicTacToe

If you've already compiled and run the program once, just use the command "java TicTacToe" to run it again.
-------------------------------------------------------------------------------------------------------------

ABOUT THE CLASSES :-

The code is organised in 5 different classes, each with it's own resposibility. Let's take a look at the
different methods/functionalities of each class:

Board :- It contains the code to manipulate the Tic Tac Toe game board. Only by interacting with methods of 
this class can any changes be made to the board. Methods in the Board class:

i) instructionBoard: Displays the board numbers once at the start of program.
ii) displayBoard: Displays the board each time after a turn is played.
iii) printBoardRow: A helper function used by displayboard function to print a single row.
iv) placePiece: Places pieces on the board after each turn.
v) positionEmpty: Checks if a given position is empty on the board.
vi) isFull: Checks if board is full and no moves can be played.
vii) getBoard: Returns the board.

************

GameResolver :- It contains the code to determine if someone has won by checking if there are 3 pieces of the 
same type in a line. Methods in the GameResolver class:

i) checkWinner: Checks if someone has won or game ended in draw 
ii) displayWinner: Prints the winner at the end of the game.

************

Player :- It contains code to play the player's turn. Methods in the Player class:

i) playTurn: Takes user input and places the piece at the entered postion of board.

************

Computer :- It contains code to take care of the computer's turn. This AI will consider all possible scenarios 
and make the most optimal move. Methods in the Computer class:

i) getKey: A lookup table to determinne who won.
ii) checkStatus: Checks if someone has won or game ended in draw.
iii) playTurn: Plays the most optimal move after considering all possible outcomes using minimax function.
iv) minimax: Function which considers all the possible ways the game can go and returns the best value for that 
move, assuming the opponent also plays optimally. It uses Minimax Algorithm to do the same.

************

TicTacToe :- It contains the game logic. The main function is in this class. Working of the main function:

i)main: At the start of the game, the user is given 2 options to choose between two versions of the game- 
Single Player(Player vs Computer) or Multi Player(Player vs Player). Upon chossing one, the board numbers are
displayed and the player is asked to make the first move. Game ends when someone wins or board is full and 
result is displayed.


--------------------------------------------------------------------------------------------------------------


