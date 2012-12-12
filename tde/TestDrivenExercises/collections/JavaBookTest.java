package collections;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class JavaBookTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class JavaBookTest
{
    JavaBook javaBook;
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        javaBook = new JavaBook();
    }
    private void createFeatures(int n){
        for(int i=0;i<n;i++){
            javaBook.add(new JavaFeature("name#"+i,"description#"+i));
        }
    }
    @Test
    public void itHoldsACollectionOfJavaFeatures(){
        createFeatures(10);
        assertEquals("now 10 elements are in the book",10,javaBook.size());
    }
    
    @Test
    public void featuresCanBeRetrievedByName(){
          createFeatures(10);
          assertEquals("description#3",book.get("name#3").getDescription());
    }
    
    @Test
    public void featuresCanBeDeletedByName(){
         createFeatures(10);
         javaBook.delete("name#8");
         assertEquals(9,javaBook.size());
         assertEquals(null,javaBook.get("name#8"));
    }
    @Test
    public void featuresCanBeDeletedByContent(){
         createFeatures(10);
         javaBook.deleteWithDescription("tion#7");
         assertEquals(9,javaBook.size());
         assertEquals(null,javaBook.get("name#7"));
   }
}
