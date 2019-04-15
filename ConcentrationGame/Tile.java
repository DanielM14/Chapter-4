import java.util.Random;
import java.util.ArrayList;



/**
 * Solution Version
 */
public class Tile
{   
    private boolean faceUp;
    private boolean matched;
    private String cardFace;
    private String cardBack = "_____";
    private String cardMatched = "  *  ";
    
    public Tile(String word) 
    {
        cardFace = word;
    }
 
    public String getFace() {
        return cardFace;
    }
        
    public String getBack() {
        return cardBack;
    }
    
    public void faceUp(boolean b)
    {
        faceUp = b;
    }
     
    public boolean isFaceUp() {
        return faceUp;
    }
 
    public void foundMatch() {
       matched = true;
       cardFace = cardMatched;
       cardBack = cardMatched;
    }
      
    public boolean matched() {
        return matched;
    }
       
    public boolean addsTo7(Tile tile) {
        int a = Integer.parseInt(this.cardFace);
        int b = Integer.parseInt(tile.cardFace);
        if ( a + b == 7) return true;
        else return false;
    }
     
    public boolean equals(Tile tile) {      
        if (this.cardFace.equals(tile.cardFace) )return true;
        else return false;
    }

}
