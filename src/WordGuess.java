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
        for (int i = 0; i < theWord.length(); i++) {
            s = s + "*";
        }
        return s;
    }

    public static boolean isInWord(char guess, String theWord) {
        for (int i = 0; i < theWord.length(); i++) {
            if (guess == theWord.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    //Our guess is saved in the place that it is in our answer in the word
    public static String updateUserWord(char guess, String userWord, String theWord) {

        //System.out.println("updateUserWord() - " + userWord);
        StringBuilder newWord = new StringBuilder(userWord); //This is standard library
        for (int i = 0; i < theWord.length(); i++) {
            if (guess == theWord.charAt(i)) {
                newWord.setCharAt(i, theWord.charAt(i));
            }
        }
        return newWord.toString();
    }


    //What is this doing?
    public static String updateGuesses(String guesses, char guess) {
        //System.out.println("updateGuesses() - " + guesses + " --- " + guess);
        return "" + guesses + guess;
    }

    public static String displayUserWord(String userWord) {
        String displayWord;
        displayWord = "";
        for (int i = 0; i < userWord.length(); i++) {
            if (userWord.charAt(i) == '*') {
                displayWord = displayWord + "_ ";
            } else {
                displayWord = displayWord + userWord.charAt(i);
            }
        }
        return displayWord;
    }

    // What is inputted into this function
    // What returned
    // @param strikes
    //TODO: Shannon // FIXME: 10/28/16
    public static String displayUserGuesses(int strikes, String userGuesses) {
        String str = "";
        //Concating the guess with spaces for readability
        for (int i = 0; i < userGuesses.length(); i++) {
            str = userGuesses.charAt(i) + " ";
        }
        return "Strikes: " + strikes + "\tGuesses : " + str;
    }

} 


