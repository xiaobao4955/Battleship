package edu.utep.cs.cs4330.battleship;

/**
 * A game board consisting of <code>size</code> * <code>size</code> places
 * where battleships can be placed. A place of the board is denoted
 * by a pair of 0-based indices (x, y), where x is a column index
 * and y is a row index. A place of the board can be shot at, resulting
 * in either a hit or miss.
 */
public class Board{

    private int x;
    private int y;

    /**
     * Size of this board. This board has
     * <code>size*size </code> places.
     */
    private final int size;

    /** Create a new board of the given size. */
    public Board(int size) {
        this.size = size;
    }

    /** Return the size of this board. */
    public int size() {
        return size;
    }

    // Suggestions:
    // 1. Consider using the Observer design pattern so that a client,
    //    say a BoardView, can observe changes on a board, e.g.,
    //    hitting a place, sinking a ship, and game over.

    // 2. Introduce methods including the following:
    //    public boolean placeShip(Ship ship, int x, int y, boolean dir)
    //    public void hit(Place place)
    //    public Place at(int x, int y)
    //    public Place[] places()
    //    public int numOfShots()
    //    public boolean isGameOver()
    //    ...

    /*
    public boolean placeShip(Ship ship, int x, int y, boolean dir) {
        ship.setCoordinates(x, y, dir);
       // Log.w("Get coordinates", Arrays.deepToString(ship.getCoordinates()));
        int[][]shipCoordinates = ship.getCoordinates();
        Log.w("Ship name: ", ship.getName());
        Log.w("Ship position: ", ship.getPosition());
        for(int i = 0 ; i < shipCoordinates.length; i++){
            for(int j = 0; j < shipCoordinates[0].length; j++){
                if(shipCoordinates[i][j] == 1){
                    Log.w("     (x,y) ", "(" + String.valueOf(i) + ", " + String.valueOf(j) + ")");
                    setCoordinateofBoats(shipCoordinates);
                }
            }
        }
        return false;
    }
*/
    public int numOfShots(){
        return 0;
    }
    public boolean isGameOver(){
        return true;
    }

}
