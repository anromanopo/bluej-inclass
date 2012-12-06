import java.util.HashMap;
/**
 * Write a description of class PhoneBook here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PhoneBook
{
    HashMap<String,Integer> phonebook = new HashMap<String,Integer>();
    
    public void enterNumber(String name, int number){
        phonebook.put(name,number);
        phonebook.put(name,new Integer(number));
    }
    public int lookupNumber(String name){
        Integer integer = phonebook.get(name);
        return integer.intValue();
        //return phonebook.get(name);
 
    }
}
