import java.util.*;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    private ArrayList<String> defaultResponses ;
    private HashMap<String,String> keyWordResponses;
    Random randomGenerator = new Random();

    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        initializeDefaultResponses();
        initializeKeyWordResponses();
    }

    private void initializeDefaultResponses(){
        defaultResponses = new ArrayList<String>();
        defaultResponses.add("42");
        defaultResponses.add("43");
        defaultResponses.add("44");
        defaultResponses.add("Es schneit.");

    }

    private void initializeKeyWordResponses(){
        keyWordResponses = new HashMap<String,String>();
        keyWordResponses.put("mac","That is a known bug in the mac os.");
        keyWordResponses.put("windows","That is a known bug in the windows os.");
        keyWordResponses.put("slow","buy a new computer");
        keyWordResponses.put("snow","yes, it's snowing.");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(HashSet<String> input)
    {
        String keyWordResponse = pickKeyWordResponse(input);
        if (keyWordResponse != null) return keyWordResponse;
        int randomInt = randomGenerator.nextInt(defaultResponses.size());
        return defaultResponses.get(randomInt);
    }
    public String pickKeyWordResponse(HashSet<String> input){
        for(String word : input){
            String answer = keyWordResponses.get(word);
            if (answer != null) return answer;
        }
        return null;
    }
}
