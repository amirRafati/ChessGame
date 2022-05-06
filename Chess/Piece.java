package Chess;

/*
  an abstract class is a class that other classes can extend from.
  it allows for methods to return a certain variable type that can be dynamically used:
        for example:
            - Pawn and King are both Pieces but different versions of pieces
  A Piece array can be created to hold multiple kinds of pieces
 */
public abstract class Piece {
    //five basic variables that appear in every piece are created
    Pos pos;
    int side; //0 is black 1 is white
    int type; //1-6 is black pieces, 7-12 is white pieces
    /*
        1 and 7 are pawn
        2 and 8 are rook
        3 and 9 are horse
        4 and 10 are bishop
        5 and 11 are queen
        6 and 12 are king
     */
    boolean isDead;
    boolean firstMove;

    //a basic method that appears in every piece is created. this method is defined in each separate kind of piece.
    public abstract void move();
}
