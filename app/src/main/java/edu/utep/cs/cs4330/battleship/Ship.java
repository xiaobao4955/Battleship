package edu.utep.cs.cs4330.battleship;

/**
 * Created by oscarricaud on 2/14/17.
 */
public class Ship {
    private int[][] map = new int[10][10]; // size of the grid
    private int size;
    private String name;
    private String position;

    public Ship(int size, String nameofship) {
        setSize(size);
        setName(nameofship);
        setCoordinates(true);
    }

    public void setCoordinates(boolean dir) {
        int coordinatesRange = (map.length - getSize());
        int randomx = (int) (Math.random() * coordinatesRange);
        int randomy = (int) (Math.random() * coordinatesRange);
        if(dir) { // if boat is horizontal
            setPosition("Horizontal");
            for(int i = 0; i < getSize(); i++){ // place boat horizontal
                map[randomx][randomy+i] = 1; // Adding to the right of the head
            }
        }
        else{
            setPosition("Vertical");
            for(int j = 0; j < getSize(); j++){ // place boat vertical
                map[randomx+j][randomy] = 1; // Adding below of the head
            }
        }
    }
    public int[][] getCoordinates(){
        return map;
    }
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
