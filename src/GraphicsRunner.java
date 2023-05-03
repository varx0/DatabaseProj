import java.awt.*;
import javax.swing.JFrame;

public class GraphicsRunner extends Canvas
{


    public void paint(Graphics g) {

        setBackground(Color.WHITE);
        g.fillRect(10, 10, 80, 30);
        g.drawString("Database", 25, 25);
        setForeground(Color.RED);

    }
}