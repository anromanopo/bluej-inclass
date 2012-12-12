package logic;


import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class InstanceCounterTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class InstanceCounterTest
{
    /**
     * Default constructor for test class InstanceCounterTest
     */
    public InstanceCounterTest()
    {
    }


    @Test
    public void itCountsItsInstances1(){
        assertEquals("no InstanceCounter",0,InstanceCounter.getNumberOfInstances());
    }
    
    @Test
    public void itCountsItsInstances2(){
        InstanceCounter ic1 = new InstanceCounter();
        InstanceCounter ic2 = new InstanceCounter();
        InstanceCounter ic3 = new InstanceCounter();
        assertEquals("InstanceCounter has three instances",3,InstanceCounter.getNumberOfInstances());
    }
}
