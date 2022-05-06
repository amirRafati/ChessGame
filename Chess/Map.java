package Chess;

import java.util.ArrayList;

/*
this class doesn't contain any object specific data. it is just a class that holds three arrays.
the "static" keyword is used so that each method and variable can be called from the Map class itself rather than
    requiring an object of the map
 */

public class Map {
    /*
    the first array is the grid
    the second array is all the available moves (if true, highlight green to show you can move there)
    the third array is an arraylist of all the pieces.
     */
    public static int[][] map = new int[8][8];
    public static boolean[][] available = new boolean[8][8];
    public static ArrayList<Piece> pieces = new ArrayList<Piece>();


    /*
        if the selectedPiece variable is -1, there is no selected piece
        otherwise, it points to the index in the "pieces" array
     */
    public static int selectedPiece = -1;

    public static int turn = 1;


    /*
        clear availability
        sets all spots in the "available" array to false
        returns nothing
     */
    static void clearAvailable() {
        for (int y = 0; y < 8; y++) {
            for (int x = 0; x < 8; x++) {
                available[y][x] = false;
            }
        }
    }

    /*
        find piece
        given a coordinate pair on the grid, find the piece matching that coordinate pair
        if there is no piece, return -1
        otherwise, return the index corresponding to that piece within the "pieces" array.
     */
    static int findPiece(int x, int y) {
        for (int i = 0; i < pieces.size(); i++) {
            if (pieces.get(i).pos.x == x && pieces.get(i).pos.y == y) {
                return i;
            }
        }
        return -1;
    }

    /*
       initalize all arrays
       set all the initial positions of the pieces to their proper locations.
       set all values in the "available" array to false.
     */
    static void init() {
        for (int y = 0; y < 8; y++) {
            for (int x = 0; x < 8; x++) {
                available[y][x] = false;
                if (y == 1) {
                    map[y][x] = 1;
                    pieces.add(new Pawn(new Pos(x, y), 0));
                } else if (y == 6) {
                    map[y][x] = 7;
                    pieces.add(new Pawn(new Pos(x, y), 1));
                } else {
                    map[y][x] = 0;
                }

                if (x == 0 || x == 7) {
                    if (y == 0) {
                        map[y][x] = 2;
                        pieces.add(new Rook(new Pos(x, y), 0));
                    } else if (y == 7) {
                        map[y][x] = 8;
                        pieces.add(new Rook(new Pos(x, y), 1));
                    }
                } else if (x == 1 || x == 6) {
                    if (y == 0) {
                        map[y][x] = 3;
                        pieces.add(new Horse(new Pos(x,y), 0));
                    } else if (y == 7) {
                        map[y][x] = 9;
                        pieces.add(new Horse(new Pos(x,y), 1));
                    }
                } else if (x == 2 || x == 5) {
                    if (y == 0) {
                        map[y][x] = 4;
                        pieces.add(new Bishop(new Pos(x, y), 0));
                    } else if (y == 7) {
                        map[y][x] = 10;
                        pieces.add(new Bishop(new Pos(x, y), 1));
                    }
                } else if (x == 3) {
                    if (y == 0) {
                        map[y][x] = 5;
                        pieces.add(new Queen(new Pos(x, y), 0));
                    } else if (y == 7) {
                        map[y][x] = 11;
                        pieces.add(new Queen(new Pos(x, y), 1));
                    }
                } else {
                    if (y == 0) {
                        map[y][x] = 6;
                        pieces.add(new King(new Pos(x, y), 0));
                    } else if (y == 7) {
                        map[y][x] = 12;
                        pieces.add(new King(new Pos(x, y), 1));
                    }
                }
            }
        }
    }
}
