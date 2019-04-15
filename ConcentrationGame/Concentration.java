
/** 
 * Solution Version with enhancements and Sevens rules
 */
public class Concentration extends Board
{
    public static final int CONCENTRATION = 100;
    public static final int SEVENS = 200;

    // create the game board
    private Tile[][] gameboard = makeBoard();
    // set the game rules
    private int gamerules;
    // uncomment to play SEVENS:
    // private int gamerules = Board.SEVENS;

    /** 
     * The constructor for the game. Creates the 2-dim gameboard
     * by populating it with tiles.
     */
    public Concentration() { 

        // get pairs of cards
        String[] cards = getCards();
        int numCards = cards.length-1;

        gamerules = CONCENTRATION;        

        // randomly assing cards to game tiles
        for (int i = 0; i < gameboard.length; i++) {
            for (int j = 0; j < gameboard[0].length; j++)    {
                // choose random card
                int r = (int)( Math.random() * numCards);

                // assing card to tile 
                gameboard[i][j] = new Tile(cards[r]);

                // update random number helper array, replacing used card with last card of deck
                cards[r] = cards[numCards];
                // manually track the cards remaining in array
                numCards--;
            }
        }
    }
    public boolean allTilesMatch() {
        for (int i = 0; i < gameboard.length; i++) {
            for (int j = 0; j < gameboard[0].length; j++) {   
                if (!gameboard[i][j].matched()) return false;
            }
        }
        return true;
    }
    
    public String checkForMatch(int row1, int column1, int row2, int column2) {
        boolean tilesMatch = false;
        String msg = "";
        Tile tile1 = gameboard[row1][column1]; 
        Tile tile2 = gameboard[row2][column2];

        if (gamerules == CONCENTRATION) tilesMatch = tile1.equals(tile2);
        if (gamerules == SEVENS) tilesMatch = tile1.addsTo7(tile2);
        if (tilesMatch) {
            tile1.foundMatch();
            tile2.foundMatch();
            msg = "Matched!";
        }
        else {   
            tile1.faceUp(false);
            tile2.faceUp(false);
        }
        return msg;
    }
  
    public void showFaceUp (int row, int column) {
        Tile tile = gameboard[row][column];
        tile.faceUp(true);
        tile.faceUp(true);
    }

    public String toString()
    {
        String boardValues = "";
        for (int i = 0; i < gameboard.length; i++) {
            for (int j = 0; j < gameboard[0].length; j++) {              
                Tile t = gameboard[i][j];
                if (t.isFaceUp())  boardValues = t.getFace() + boardValues;
                else boardValues += t.getBack();
                boardValues += "\t";
            }
            boardValues += "\n";
        }
        return boardValues;
    }

    public boolean validSelection(int i, int j) {
        if (i < gameboard.length) {
            if (j < gameboard[0].length) {
                if (!gameboard[i][j].matched()) return true;
            }
        }
        return false;
    }
}
