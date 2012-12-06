/**
 * Write a description of class Wuerfel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wuerfel
{
    java.util.Random generator = new java.util.Random();
    public int rollDice(){
        int x = generator.nextInt(4711);
        return x;
    } 
    
    public static void test(){
        Wuerfel w = new Wuerfel();
        for (int i = 0; i<20;i++){
            System.out.println("dice roll: "+w.rollDice());
        }
    }
}
