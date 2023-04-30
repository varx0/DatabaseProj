import javax.swing.JFrame;
import java.awt.*;
import java.io.File;
import javax.imageio.ImageIO;

class MakeImage extends Canvas
{
    public MakeImage()    //constructor - sets up the class
    {
        setSize(800,600);
        setBackground(Color.WHITE);
        setVisible(true);
    }

    public void paint( Graphics window )
    {

        window.setColor(Color.YELLOW);
        window.fillOval( 210, 100, 400, 400 );

    }



}


public class GraphicsRunner extends JFrame
{
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;

    public GraphicsRunner()
    {
        super("Graphics Runner");

        setSize(WIDTH,HEIGHT);

        getContentPane().add(new MakeImage());

        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}