
/**
 * Write a description of class Track here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Track
{
    private String artist,title,fileName;
    public Track(String artist,String title, String fileName){
        this.artist = artist;
        this.title = title;
        this.fileName = fileName;
    }

    public String toString(){
        return artist + ": " + title + " ("+fileName+")";
    }
}
