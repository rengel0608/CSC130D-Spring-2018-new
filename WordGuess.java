import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.io.*;

/**
 * Starter code for a word-guessing game.
 * 
 * @author RE
 * @author Rachel Engel
 * @version April 19, 2018
 *
 */

public class WordGuess {

   // Private member variables
   private int maxGuesses = 0;         // controls how hard the game is.
   private int guessesLeft = 0;        // how many guesses the user has left.
   private String wordToGuess = "";    // this is the word the user is trying to guess.
   private String userWord = "";       // this gets filled in as the user guesses.
   private String lettersGuessed = ""; // This variable will hold which letters have been guessed.

   /**
    * Constructor sets up initial values for the private member variables.
    */
   public WordGuess() {
      maxGuesses = 15;
      guessesLeft = maxGuesses;

      // Get the word to be guessed.
      wordToGuess = selectRandomWord();

      // Initialize the user's word with underscores
      // for letters that haven't been guessed.
      userWord = repeatSymbol('_', wordToGuess.length());
   }

   /**
    * Getter method for guessesLeft.
    */
   public int getGuessesLeft() {
      return guessesLeft;
   }

   /**
    * Getter method for wordToGuess.
    */
   public String getWordToGuess() {
      return wordToGuess;
   }

   /**
    * Getter method for userWord.
    */
   public String getUserWord() {
      return userWord;
   }

   /**
    * Getter method for lettersGuessed.
    */
   public String getLettersGuessed() {
      return lettersGuessed;
   }

   /**
    * For pretty printing, return the user's word
    * with spaces between the letters.
    */
   public String getUserWordWithSpaces() {
      return insertSpaces(userWord);
   }

   /**
    * Handles everything that needs to happen when the user
    * guesses a letter.
    */
   public void makeGuess(char letter) {
      // Decrease the number of guesses remaining.
      // ***** TODO 1: your code here
	   guessesLeft--;
	   
      // Add the current letter being guessed to the string 
      // variable keeping track of guesses.
      // ***** TODO 2: your code here
	   	lettersGuessed = lettersGuessed + letter;
	   
      // No need to change this part.
      // Update the user's word by filling in the letter just guessed.
	  // Loop through each character in the word to be guessed. 
      // If a given character in the word is the character currently 
      // being guessed, call the replaceCharAtIndex method to switch
      // the underscore at that position with the correct character.
      // For example, if the wordToGuess is "easy" and userWord is "_a_y"
      // and the current guess is 's', then update userWord to be "_asy"
      for (int i = 0; i < wordToGuess.length(); i++) {
         if (wordToGuess.charAt(i) == letter) {
            userWord = replaceCharAtIndex(userWord, letter, i);
         }
      }

   }

   /**
    * Make a string by repeating the given character
    * as many times as requested.
    * E.g., repeatSymbol('*', 3) would return the string "***"
    */
   public String repeatSymbol(char symbol, int count) {
      String outString = "";

      // ***** TODO 3: your code here
      for (int i = 0; i< count; i++) { 
    	  outString = outString + symbol;
      
      }
      return outString;
   }

   /**
    * Replace a character at a given index in a string with a new character.
    * E.g., replaceChar("****", x, 2) would return the string "**x*"
    */
   public String replaceCharAtIndex(String original, char c, int index) {
      String outString = "";

      // ***** TODO 4: your code here
      
      char [] charArray = original.toCharArray();
      charArray[index] = c;
      outString = new String(charArray);
     
      
      return outString;
   }

   /**
    * Return a string just like the given string, but
    * with a space between every letter.
    * There should be no space after the last character.
    * E.g., insertSpaces("abc") would return the string "a b c"
    */
   public String insertSpaces(String s) {
      String outString = "";

      // ***** TODO 5: your code here
      
      s.replace("", " ").trim(); outString = s;
      return outString;
   }

   /**
    * Determine whether the game is over and return either true or false.
    * The game is over if the user doesn't have any guesses left or
    * has correctly guessed the word (i.e., userWord is the same as 
    * wordToGuess).
    */
   public boolean isGameOver() {
      boolean gameOver = false;
      
      // ***** TODO 6: your code here
      if (guessesLeft == 0) {
    	  gameOver = true;
      }
    	  else if (userWord.equals(wordToGuess)) {
      gameOver = true;
   
   }    
      
      return gameOver;
   }

   /**
    * Return a string describing the game outcome. There are 3 possibilities:
    * 1. The user correctly got the word, e.g., return:
    *    Good job! You got the word example.
    * 2. The user used all their guesses but didn't get the word, e.g., return:
    *    You lose! The word was example. You guessed XX% of the letters.
    * 3. The game isn't over yet, return:
    *    The game is still going!
    */
   public String getGameResult() {
      String outString = "";

      // ***** TODO 7: your code here
      
      if (userWord.equals (wordToGuess)) {
    	  System.out.println("Good job! You got the word " + wordToGuess);
      }
      
      else if (userWord.equals(wordToGuess) == false && guessesLeft == 0) {
    	  int counter = 0;
    	  	for (int i=0; i< wordToGuess.length(); i++) {
    	  		if(userWord.charAt(i) == wordToGuess.charAt(i)) {
    	  			counter++;
    	  		}
    	  	}
    	  	
    	  	int percent = (counter * 100)/ wordToGuess.length();
    	  System.out.println("You lose! The word was " + wordToGuess + "." + "You guessed " + percent + "% of the letters.");
      }
      
      else if (userWord.equals(wordToGuess) && guessesLeft != 0) { 
    	  System.out.println("The game is still going!");
      }
    
      
      return outString;
   }

   /**
    * Select a random word from a file containing a list of words.
    * No need to change anything here. Make sure the file words.txt
    * is in your WordGuess project folder (not in your src folder).
    */
   public String selectRandomWord() {
      // This file needs to be in the same directory with your code.
      String filename = "words.txt";

      // hold all the words from the file
      List<String> records = new ArrayList<String>();

      try
      {
         BufferedReader reader = new BufferedReader(new FileReader(filename));
         String line;
         while ((line = reader.readLine()) != null)
         {
            records.add(line);
         }
         reader.close();
      }
      catch (Exception e)
      {
         System.err.format("Error while trying to get words from the file '%s'.", filename);
         e.printStackTrace();
         return null;
      }

      Random randGen = new Random();
      int wordIdx = randGen.nextInt(records.size());
      return records.get(wordIdx);
   }

} // end of the class