/**
 * This class will create a WordGuess object
 * and call its methods to play a game.
 * 
 * @author RE
 * @author Rachel Engel
 * @version April 19, 2018
 * 
 */

import java.util.Scanner;

public class PlayWordGuess {

   /**
    * main method handles the loop that asks the user to
    * guess letters until the game is over.
    * 
    */
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String userInput;
      char guessLetter;
      
      // Set up a new game
      WordGuess game = new WordGuess();

      // Loop while the game isn't over yet.
        while (game.isGameOver() == false) {
 
      
      // ***** TODO 1: your code here
    
    	  
      // (call the isGameOver method on the game object to see if the game is done)
      
         // Print out: 
         //   how many guesses the user has left 
         //   (call the getGuessesLeft method on the game object)
      
  
          	 
         // ***** TODO 2: your code here
         //   the user's word, with underscores for unknown letters
         //   (call the getUserWordWithSpaces method on the game object)
        		 System.out.println("The user has: " + game.getGuessesLeft() + " guess(es) left.");

      
         // ***** TODO 3: your code here
         //   the letters guessed so far
         //   (call the ??? method on the game object)
      
          	  System.out.println(game.getUserWordWithSpaces());
      
         // ***** TODO 4: your code here
      
          	  System.out.println("You've guessed: " + game.getLettersGuessed()); 
      
         
         // Prompt the user to guess a letter
         //   (use the scanner to get a string and store the first letter in a char variable)
         // ***** TODO 5: your code here
       
          	
  
          	  
            	  System.out.println("What letter will you guess next?");
          	 userInput = scnr.next();
          	 guessLetter = userInput.charAt(0); 	 
          	 
          	 
         // ***** TODO 6: your code here
             // Use the game object to make the user's guess with the given letter.
         //   (call the ??? method on the game object)
          
          	 game.makeGuess(guessLetter);
      }
          	 
      // After the game is over, print out the result.
      // ***** TODO 7: your code here
      // (call the getGameResult method on the game object)
      System.out.println(game.getGameResult());

      // Close the scanner.
      scnr.close();
      
   } // end of the main method

}