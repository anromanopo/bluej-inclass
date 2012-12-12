import java.util.HashSet;
import java.util.Scanner;

/**
 * InputReader reads typed text input from the standard text terminal. 
 * The text typed by a user is returned.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class InputReader
{
    private Scanner reader;

    /**
     * Create a new InputReader that reads text from the text terminal.
     */
    public InputReader()
    {
        reader = new Scanner(System.in);
    }

    /**
     * Read a line of text from standard input (the text terminal),
     * and return it as a String.
     *
     * @return  A String typed by the user.
     */
    public HashSet<String> getInput()
    {
        System.out.print("> ");         // print prompt
        String inputLine = reader.nextLine();
        return split2set(inputLine);
    }
/**
 * Splits a string into a set of seperate words.
 */
    public HashSet<String> split2set(String inputLine){
        HashSet<String> result = new HashSet<String>();       
        String[] words = inputLine.toLowerCase().split(" ");
        for(int i =0;i<words.length;i++){
            result.add(words[i]);
        }
        
        return result;
    }
}
