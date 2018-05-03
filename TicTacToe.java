/*
 * Rachel Engel
 * Due: Thursday, May 3, 2018
 */

import java.util.Scanner;
public class TicTacToe {

    public static void printBoard(char[][] board) {
   	 int rows = board.length;
   	 int cols = board[0].length;
   	 
   	 for(int i = 0; i<rows; i++) {
   		 for(int j = 0; j<cols; j++) {
   			 System.out.print(board[i][j]+" ");
   		 }
   		 System.out.println();
   	 }
    }
    
    public static char [][] initBoard(char[][]board) {
   	 int rows= board.length;
   	 int cols = board[0].length;
   	 
   	 for(int i = 0; i<rows; i++) {
   		 for(int j=0; j<cols; j++) {
   			 board[i][j] = '-';
   		 }
   	 }
   	 return board;
    }
    
    
    public static boolean checkWinHorizontal(char[][]board) {
    	boolean isWin = false;
   for (int i = 0; i < board.length; i++) {
    	if (board[i][0] == board[i][1] && board[i][0] == board[i][2] && board[i][1] != '-') {
    		isWin = true;
    	}
    	}
    		
    	return isWin;
    
    }
   
    public static boolean checkWinVertical (char[][]board) {
    	boolean isWin = false;
    	for (int i = 0; i < board.length; i++) {
    		if (board[0][i] == board[1][i] && board[0][i] == board [2][i] && board[0][i] != '-') {
    			isWin = true;
    		}
    	}
    	return isWin;
    }
   
   public static boolean checkWinDiagonal (char [][]board) {
   	boolean isWin = false;
    if ((board[0][0] & board[1][1] & board[2][2]) == 'X') {
    	 isWin = true;
    }
    if ((board[2][0] & board[1][1] & board[0][2]) == 'X') {
    	 isWin = true;
    }
       
    if ((board[0][0] & board[1][1] & board[2][2]) == 'O') {
        isWin = true;
    }
    
    if ((board[2][0] & board[1][1] & board[0][2]) == 'O') {
       
   }
 return isWin;
   }
    
    
    public static void main(String[] args) {
   	 Scanner scnr = new Scanner(System.in);
   	 final int BOARD_SIZE=3;
   	 int playerTurn = 1;
   	 boolean gameOver= false;
   	 int userRow=0;
   	 int userCol = 0;
   	 
   	 char [][] gameBoard= new char[BOARD_SIZE][BOARD_SIZE];
   	 
   	 gameBoard =initBoard(gameBoard);
   	 printBoard(gameBoard);
   	 
   	 while(gameOver==false) {
   System.out.println("Which row will you go?");
   userRow = scnr.nextInt();
  System.out.println("Which column will you go?");
   		userCol = scnr.nextInt();
   			
   			
   			 if (playerTurn == 1 && (gameBoard [userRow -1][userCol -1] == '-')) {	 
   				gameBoard [userRow -1][userCol -1] = 'X';
   			
   			 }
   			 else if (playerTurn == 2 && (gameBoard [userRow -1][userCol -1] == '-')) {
   				 gameBoard[userRow -1][userCol -1] = 'O';
   				
   			 }
   			 else {
   				 System.out.println("Woops! Invalid Move. Forfeit a turn.");
   				 
   			 }
   			printBoard(gameBoard);	 
   		
   	 
   	 if (checkWinHorizontal(gameBoard)) {
   		 System.out.println("Congratulations Player " + playerTurn + " you won!" );
   		 gameOver = true;
   	 }
   	 if (checkWinVertical(gameBoard)) {
   		 System.out.println("Congratulations Player " + playerTurn + "cyou won!" );
   		gameOver = true;
   	 }
   	 if (playerTurn == 1) {
   		 playerTurn = 2;
   	 }
   	 else {
   		 playerTurn = 1;
   	 }
   	 if (checkWinDiagonal(gameBoard)) {
   		 System.out.println("Congratulations Player " + playerTurn + " you won!" );
   		 gameOver = true;
   	 }
   	 	}	 
   	 scnr.close();
    }
}

