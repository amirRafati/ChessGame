package Chess;

import javax.xml.stream.events.EndElement;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/*
this class allows for the control of the mouse. if the mouse is clicked, things can happen based of the mouse's coordinates
and whether or not a piece was already selected.
 */
public class Mouse implements MouseListener {
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        int x = e.getX() / Window.scale;
        int y = e.getY() / Window.scale;
        if (Map.selectedPiece == -1) {
            int index = Map.findPiece(x, y);
            if (index != -1) {
                if (Map.pieces.get(index).side == Map.turn) {
                    Map.pieces.get(index).move();
                    Map.selectedPiece = index;
                }
            } else {
                Map.selectedPiece = -1;
            }

        } else {
            boolean switchPlayers = false;
            if (Map.available[y][x]) {
                //get piece index
                int pieceIndex = Map.selectedPiece;

                //piece capturing:

                //if the selected location has a piece (findPiece doesn't return -1) get the opponent piece's index
                //if there is a piece, set isDead to true and remove it from the board
                //you can remove it by setting it's position outside the board
                int enemyPiece = Map.findPiece(x, y);
                if (enemyPiece != -1) {
                    if (Map.pieces.get(enemyPiece).side != Map.pieces.get(pieceIndex).side) {
                        if (Map.pieces.get(enemyPiece).type == 6) {
                            System.out.println("White Wins!");
                            System.exit(0);
                        }
                        if (Map.pieces.get(enemyPiece).type == 12) {
                            System.out.println("Back Wins!");
                            System.exit(0);
                        }
                        Map.pieces.get(enemyPiece).isDead = true;
                        Map.pieces.get(enemyPiece).pos.x = 100;
                        Map.pieces.get(enemyPiece).pos.y = 100;
                    }
                }

                //if the position is actually changing:
                //set first move to false (if it's already false then it's fine)
                if (x != Map.pieces.get(pieceIndex).pos.x || y != Map.pieces.get(pieceIndex).pos.y) {
                    if (Map.pieces.get(pieceIndex).firstMove) {
                        Map.pieces.get(pieceIndex).firstMove = false;
                    }
                    switchPlayers = true;
                }

                //set cuurent board position to 0
                Map.map[Map.pieces.get(pieceIndex).pos.y][Map.pieces.get(pieceIndex).pos.x] = 0;

                //update piece position
                Map.pieces.get(pieceIndex).pos.x = x;
                Map.pieces.get(pieceIndex).pos.y = y;

                //set new board position to piece type
                Map.map[y][x] = Map.pieces.get(pieceIndex).type;
            }
            Map.selectedPiece = -1;
            Map.clearAvailable();
            if (switchPlayers) {
                if (Map.turn == 1) {
                    Map.turn = 0;
                } else {
                    Map.turn = 1;
                }
            }
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
