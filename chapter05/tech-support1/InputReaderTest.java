

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

/**
 * The test class InputReaderTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class InputReaderTest
{
   @Test
   public void testSplit2Set(){
        InputReader inputReader = new InputReader();
        HashSet<String> result = inputReader.split2set("my computer is slow");
        assertEquals("should find 4 words",4,result.size());
        assertEquals("slow should be contained",true,result.contains("slow"));
    }
       @Test
   public void testSplit2SetCapitalLetter(){
        InputReader inputReader = new InputReader();
        HashSet<String> result = inputReader.split2set("my computer is Slow");
        assertEquals("should find 4 words",4,result.size());
        assertEquals("slow should be contained",true,result.contains("slow"));
    }
           @Test
   public void testSplit2SetDoubleWord(){
        InputReader inputReader = new InputReader();
        HashSet<String> result = inputReader.split2set("my computer is very very Slow");
        assertEquals("should find 5 words",5,result.size());
        assertEquals("slow should be contained",true,result.contains("slow"));
        assertEquals("slow should be contained",true,result.contains("very"));
    }
    
}
