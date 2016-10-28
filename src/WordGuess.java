import java.util.Scanner;

/**
 * Demonstrates the game of Hangman using WordGuess.
 *
 * @author Shannon Raff
 * @version 10/18/2017
 */
public class WordGuess {


   public static String makeUserWord(String theWord) {
      String s = "";
         for(int i = 0; i < theWord.length(); i ++){
             s = s + "*";
      }
   return s;


  }
  
  public static boolean isInWord(char guess, String theWord) {
   for(int i = 0; i < theWord.length(); i++){
        
        if(guess == theWord.charAt(i) ){
            return true;
        }
   }
   return false;
  }
  
  public static String updateUserWord(char guess, String userWord, String theWord) {
      String updateWord;
      updateWord = "";
      for(int i = 0; i < theWord.length(); i ++){
         if(guess == userWord.charAt(i)){
             updateWord = updateWord + userWord.charAt(i);
         }else{
             updateWord = updateWord + "*";
         }
      }


      return updateWord; 
  }
  
  public static String updateGuesses(String guesses, char guess) {
  return "" + guesses + guess;
  
  
  
  
  }
  
  public static String displayUserWord(String userWord) {
      String displayWord;
      displayWord = "";
      for(int i = 0; i < userWord.length(); i++){
         if(userWord.charAt(i) == '*'){
             displayWord = displayWord + "_ ";
         }else{
             displayWord = displayWord + userWord.charAt(i);
         }
      }


      return displayWord; 
  
  
  }


    public static String displayUserGuesses(int strikes, String userGuesses) {

    }

    public static String displayGuesses(int strikes, String guesses) {
       String str = "";
       for(int i = 0; i < guesses.length(); i ++){
       str = guesses.charAt(i) + " ";  
       }
  
  
  
       return "Strikes: " + strikes + "\tGuesses" + guesses +":"  + str;
  }
  
} 


