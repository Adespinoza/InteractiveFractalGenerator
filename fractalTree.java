import javax.swing.*; 
import java.awt.*;
import java.awt.Color; 
import objectdraw.*;
import java.awt.Graphics; 
import java.awt.Graphics2D; 

/**
 * Methods for the interactive Fractal Tree 
 * 
 * @Adam Espinoza & Samuel Garcia
 * @2015-26-05
 */
public class FractalTree extends JComponent
{
    private JPanel panel;                                   //NOT SURE IF I NEED THIS?!?!?!?!?!

    private double theta;                                   //Angle which branches divert
    private int length;                                     //Length of the starting line
    private final int WINDOW_WIDTH = 1280;                  //Width of the Canvas 
    private final int WINDOW_HEIGHT = 720;                 //Height of the Canvas 

    private double x1;                                       //Starting x-coordinate  
    private double y1;                                       //Starting y-coordinate 
    
    public static void main(String[] args)
    {
        FractalTree fractalTree = new FractalTree(); 
        fractalTree.setVisible(true); 
        fractalTree.setBackground(Color.black); 
    }
    
    /**
     * Constructor for objects of class fractalTree
     * Mostly used for creating the window for the thing to be printer. 
     */
    public FractalTree()
    {
        JFrame window = new JFrame(); 
        window.setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
        window.setTitle("Fractal Tree Generator"); 
        window.setLocationRelativeTo(null);
        window.setResizable(true);
        window.add(this);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
    }
       
    @Override
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        g.setColor(Color.green); 
        drawFractalLine(g, WINDOW_WIDTH / 2 ,WINDOW_HEIGHT - 75, 12, -90);
    }
    
    /**
     * Method creates branches for the tree
     * @param x1 the x-coordinate you are starting at.
     * @param y1 the y-coordinate you are starting at.
     * @param length the length to which the fractal tree will grow. (Maximum length)
     * @param theta the angle at which the factals will begin to diverge.
     */
    public void drawFractalLine(Graphics g, int x1, int y1, int length, double theta) 
    {
        if (length == 0) {
        }
        else
        {
            int x2 = x1 + (int) (length * 10 * Math.cos(Math.toRadians(theta)));
            int y2 = y1 + (int) (length * 10 * Math.sin(Math.toRadians(theta)));

            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            g2d.setStroke(new BasicStroke(.75f * length));
            g2d.drawLine(x1, y1, x2, y2);

            drawFractalLine(g, x2, y2, length - 1, theta - 40);
            drawFractalLine(g, x2, y2, length - 1, theta + 40);
          
            //drawFractalLine(g, x2, y2, length - 1, theta - 60);
            //drawFractalLine(g, x2, y2, length - 1, theta + 60);
            
        }   
    }

}
