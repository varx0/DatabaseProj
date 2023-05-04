import java.awt.*;
import javax.swing.JFrame;

public class GraphicsRunner extends Canvas
{

    /**
     * Creates the intro graphic
     * @param g   The graphics object
     */
    public void paint(Graphics g) {

        setBackground(Color.lightGray);
        g.setColor(new Color(173,216,230));
        g.fillOval(0, 150, 389, 80);
        g.setColor(Color.BLACK);
        g.setFont(new Font("TimesRoman", Font.PLAIN, 20));
        g.drawString("Database360TM", 140, 195);
        g.setFont(new Font("TimesRoman", Font.PLAIN, 10));
        g.drawString("Your solution to no problem", 140, 205);

    }
}