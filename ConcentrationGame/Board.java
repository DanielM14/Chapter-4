
public abstract class Board
{
    //The cards that will be placed in the tiles
    private String[] cards = new String[] {"dog", "dog", "cat", "cat", "mouse", "mouse",
        "wolf", "wolf", "monkey", "monkey", "bird", "bird"}; 

    // The  shape of the board
    private int rows = 3;
    private int columns = 4;  

    public Tile[][] makeBoard() {
        return new Tile[rows][columns];
     }

    public String[] getCards () {   
        return cards;
    }

}
