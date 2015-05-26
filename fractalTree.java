import javax.swing.*; 
import objectdraw.*;

/**
 * Methods for the interactive Fractal Tree 
 * 
 * @Adam Espinoza & Samuel Garcia
 * @2015-26-05
 */
public class fractalTree extends JFrame
{
    private JPanel panel;
    private int iterations;
    private double theta; 
    private double length;
    private int width; 
    private int height; 

    /**
     * Constructor for objects of class fractalTree
     * @param iterations the maximum number of iterations the fractal will proceed with.
     * @param length the length at which the factals will begin to diverge.
     * @param theta the angle at which the fractals branch off the origin fractal.
     * @param width the width of the canvas for the fractal tree. 
     * @param height the height of the canvas for the fractal tree. 
     */
    public fractalTree(int iterations, int length, double theta, int width, int height)
    {
        this.iterations = iterations; 
        this.length = length; 
        this.theta = theta; 
        this.width = width; 
        this.height = height; 
    }
    
    /**
     * Method creates branches for the tree
     */
    public void branches() 
    {
        //float theta = Math.random(Math.PI/3); //creates random angles for the tree to go. 
        JDrawingCanvas canvas = new JDrawingCanvas(width, height); 
        Line l = new Line(0,0,0,-100, canvas);
        l.setStart(0, -length);
        length *= 0.66;
        if (length > 2) 
        {
            pushMatrix();
            rotate(theta);
            branch(length);
            popMatrix();
            pushMatrix();
            rotate(-theta);
            branch(length);
            popMatrix();
        }   
    }
}
