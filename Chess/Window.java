package Chess;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    //scale variable dictates the size of the squares
    public static int scale;

    Panel p = new Panel();
    Mouse mouse = new Mouse();

    public Window() {

        super("Chess");
        setSize(800, 800);
        //since there are 8 tiles per row or col in chess, the scale is the width (or height) divided by 8
        //width and height are equal so it doesn't matter
        scale = getWidth() / 8;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        //must specify dimensions of JPanel for it to fit
        Dimension size = new Dimension(800, 800);
        p.setPreferredSize(size);
        p.setMaximumSize(size);
        p.setMinimumSize(size);
        add(p);
        //pack() makes sure that everything fits
        pack();

        //initialize all arrays in the Map class
        Map.init();
        //add the mouse listeners
        addKeyListener(new Key());
        addMouseListener(mouse);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Window();
    }
}
