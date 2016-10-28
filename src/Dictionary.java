import java.util.*;
import java.io.*;

/**
 * This class provides a dictionary of words
 * @author Nancy Harris
 * @version V2 - updated 10/28/2010
 */
public class Dictionary
{
    // global variables. These define what a dictionary is.
    private ArrayList<String> words;
    private Random randi;

    /**
     * This constructor passes a seed value into the
     * Dictionary object as a starter for the Random generator
     *
     * @param seed The starter value for the random generator
     */
    public Dictionary(long seed)
    {
        Scanner wordScan;
        words = new ArrayList<String>();

        // this code reads the Words.csv file to obtain the words
        try
        {
            wordScan = new Scanner(new File("Words.csv"));
        }
        catch(FileNotFoundException fnfe)
        {
            System.out.println("Your dictionary file, Words.csv, is missing.  Ending.");
            wordScan = null; // make the compiler happy
            System.exit(99);
        }

        while(wordScan.hasNext()) // until end of file
        {
            String word;
            word = wordScan.next();
            words.add(word);
        }

        randi = new Random(seed); // to control the order
    }

    /**
     * getWord serves up words for the game
     *
     * @return a random word from the Dictionary
     */
    public String getWord()
    {
        return words.get(randi.nextInt(words.size()));
    }

}