package Chess;

/*
This is the first instance of a class that extends piece
the pos, side, and isDead variables are all already defined and must be initialized
the move method is defined and initialized here. this instance of the move method is different from other versions.
 */
public class Pawn extends Piece {

    //initialized with an initial position and side.
    public Pawn(Pos p, int s) {
        this.pos = p;
        this.side = s;
        if (this.side == 1) {
            this.type = 7;
        } else {
            this.type = 1;
        }
        this.isDead = false;
        this.firstMove = true;
    }

    @Override
    public void move() {
        //first clear the "available" array and allow for the pawn not to move
        Map.clearAvailable();
        Map.available[pos.y][pos.x] = true;
        //since the movement is different based off what side it's on, check what side it's on
        if (side == 0) {
            //if it's black (moving downwards, check if its y coordinate isn't at the bottom
            if (pos.y < 7) {
                //it can move one down if there is nothing (the grid is zero) right below it
                Map.available[pos.y + 1][pos.x] = Map.map[pos.y + 1][pos.x] == 0;
                if (pos.x < 7) {
                    //if the x value isn't at the far right, it can capture a piece diagonally right assuming there's a piece to be captured
                    Map.available[pos.y + 1][pos.x + 1] = Map.map[pos.y + 1][pos.x + 1] != 0 && Map.map[pos.y + 1][pos.x + 1] > 6;
                }
                if (pos.x > 0) {
                    //if the x value isn't at the far left, it can capture a piece diagonally left assuming there's a piece to be captured
                    Map.available[pos.y + 1][pos.x - 1] = Map.map[pos.y + 1][pos.x - 1] != 0 && Map.map[pos.y + 1][pos.x - 1] > 6;
                }
                //if it's the first move, it can move two down.
                if (this.firstMove) {
                    Map.available[pos.y + 2][pos.x] = Map.map[pos.y + 2][pos.x] == 0;
                }
            }
        } else if (side == 1) {
            //this is the same process as above, except down becomes up
            if (pos.y > 0) {
                Map.available[pos.y - 1][pos.x] = Map.map[pos.y - 1][pos.x] == 0;
                if (pos.x < 7) {
                    Map.available[pos.y - 1][pos.x + 1] = Map.map[pos.y - 1][pos.x + 1] != 0 && Map.map[pos.y - 1][pos.x + 1] < 7;
                }
                if (pos.x > 0) {
                    Map.available[pos.y - 1][pos.x - 1] = Map.map[pos.y - 1][pos.x - 1] != 0 && Map.map[pos.y - 1][pos.x - 1] < 7;
                }

                if (this.firstMove) {
                    Map.available[pos.y - 2][pos.x] = Map.map[pos.y - 2][pos.x] == 0;
                }
            }
        }
    }
}
