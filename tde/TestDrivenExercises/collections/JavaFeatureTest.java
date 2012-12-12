package collections;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class JavaFeatureTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class JavaFeatureTest
{
    /**
     * Default constructor for test class JavaFeatureTest
     */
    public JavaFeatureTest()
    {
    }
    JavaFeature javaFeature;
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        javaFeature = new JavaFeature();
    }

    @Test
    public void hasAName(){
        javaFeature.setName("for-each loop");
        assertEquals("for-each loop",javaFeature.getName());
    }

    @Test
    public void hasADescription(){
        javaFeature.setDescription("is used for iterating through a complete collection");
        assertTrue(javaFeature.getDescription().contains("collection"));
    }
}
