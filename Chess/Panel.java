package Chess;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {

    Color FADED_BLACK = new Color(90, 90, 90);
    Color FADED_WHITE = new Color(200, 200, 200);
    Font font = new Font("Tahoma", 0, 50);

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        //draw the grid, starting at the top-left being white
        boolean drawWhite = true;
        for (int y = 0; y < 8; y++) {
            for (int x = 0; x < 8; x++) {
                //set the color based off the drawWhite variable
                if (drawWhite) {
                    g.setColor(FADED_WHITE);
                } else {
                    g.setColor(FADED_BLACK);
                }
                //draw the rectangle
                g.fillRect(x * Window.scale, y * Window.scale, Window.scale, Window.scale);
                //set the drawWhite variable to it's opposite
                drawWhite = !drawWhite;
            }
            //set the drawWhite variable to it's opposite
            drawWhite = !drawWhite;
        }

        //draw the selected moves
        for (int y = 0; y < Map.available.length; y++) {
            for (int x = 0; x < Map.available[y].length; x++) {
                if (Map.available[y][x]) {
                    //if a value in the "available" array is true, draw a green square at it's coordinates
                    g.setColor(Color.GREEN);
                    g.fillRect(x * Window.scale, y * Window.scale, Window.scale, Window.scale);
                }
            }
        }

        //draw the pieces
        for (int y = 0; y < Map.map.length; y++) {
            for (int x = 0; x < Map.map[y].length; x++) {
                Rectangle bounds;
                switch (Map.map[y][x]) {
                    //depending on what piece is where in the "map" array, draw the appropriate piece.
                    default:
                        break;
                    case 1:
                        g.setColor(Color.BLACK);
                        bounds = new Rectangle(x * Window.scale, y * Window.scale, Window.scale, Window.scale);
                        drawCenteredString(g, "P", bounds, font);
                        break;
                    case 2:
                        g.setColor(Color.BLACK);
                        bounds = new Rectangle(x * Window.scale, y * Window.scale, Window.scale, Window.scale);
                        drawCenteredString(g, "R", bounds, font);
                        break;
                    case 3:
                        g.setColor(Color.BLACK);
                        bounds = new Rectangle(x * Window.scale, y * Window.scale, Window.scale, Window.scale);
                        drawCenteredString(g, "H", bounds, font);
                        break;
                    case 4:
                        g.setColor(Color.BLACK);
                        bounds = new Rectangle(x * Window.scale, y * Window.scale, Window.scale, Window.scale);
                        drawCenteredString(g, "B", bounds, font);
                        break;
                    case 5:
                        g.setColor(Color.BLACK);
                        bounds = new Rectangle(x * Window.scale, y * Window.scale, Window.scale, Window.scale);
                        drawCenteredString(g, "Q", bounds, font);
                        break;
                    case 6:
                        g.setColor(Color.BLACK);
                        bounds = new Rectangle(x * Window.scale, y * Window.scale, Window.scale, Window.scale);
                        drawCenteredString(g, "K", bounds, font);
                        break;
                    case 7:
                        g.setColor(Color.WHITE);
                        bounds = new Rectangle(x * Window.scale, y * Window.scale, Window.scale, Window.scale);
                        drawCenteredString(g, "P", bounds, font);
                        break;
                    case 8:
                        g.setColor(Color.WHITE);
                        bounds = new Rectangle(x * Window.scale, y * Window.scale, Window.scale, Window.scale);
                        drawCenteredString(g, "R", bounds, font);
                        break;
                    case 9:
                        g.setColor(Color.WHITE);
                        bounds = new Rectangle(x * Window.scale, y * Window.scale, Window.scale, Window.scale);
                        drawCenteredString(g, "H", bounds, font);
                        break;
                    case 10:
                        g.setColor(Color.WHITE);
                        bounds = new Rectangle(x * Window.scale, y * Window.scale, Window.scale, Window.scale);
                        drawCenteredString(g, "B", bounds, font);
                        break;
                    case 11:
                        g.setColor(Color.WHITE);
                        bounds = new Rectangle(x * Window.scale, y * Window.scale, Window.scale, Window.scale);
                        drawCenteredString(g, "Q", bounds, font);
                        break;
                    case 12:
                        g.setColor(Color.WHITE);
                        bounds = new Rectangle(x * Window.scale, y * Window.scale, Window.scale, Window.scale);
                        drawCenteredString(g, "K", bounds, font);
                        break;
                }
            }
        }


//        g.setColor(Color.WHITE);
//        g.setFont(font);
//        drawCenteredString(g, "H", new Rectangle(Window.scale, 0, Window.scale, Window.scale), font);
        repaint();
    }

    /**
     * Draw a String centered in the middle of a Rectangle.
     *
     * @param g    The Graphics instance.
     * @param text The String to draw.
     * @param rect The Rectangle to center the text in.
     */
    public void drawCenteredString(Graphics g, String text, Rectangle rect, Font font) {
        // Get the FontMetrics
        FontMetrics metrics = g.getFontMetrics(font);
        // Determine the X coordinate for the text
        int x = rect.x + (rect.width - metrics.stringWidth(text)) / 2;
        // Determine the Y coordinate for the text (note we add the ascent, as in java 2d 0 is top of the screen)
        int y = rect.y + ((rect.height - metrics.getHeight()) / 2) + metrics.getAscent();
        // Set the font
        g.setFont(font);
        // Draw the String
        g.drawString(text, x, y);
    }
}
