package Chess;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Key implements KeyListener {
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_R){
            Map.pieces.get(3).move();
            System.out.println("Stuff Happened");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
