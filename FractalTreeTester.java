import javax.swing.*; 
import java.awt.*;
import java.awt.Color; 
//import objectdraw.*;
import java.awt.Graphics; 
import java.awt.Graphics2D; 
import javax.swing.event.*; 

/**
 * Tester class for the Fractal tree generator 
 * 
 * @Adam Espinoza & Samuel Garcia  
 * @2015-04-06 @7:40PM
 */
public class FractalTreeTester extends JFrame
{
    public static void main(String[] args)
    {
        FractalTree fractalTree = new FractalTree();
        //Constructor for the FractalTree
        fractalTree.setVisible(true); 
        //Changes background of frame
        fractalTree.setBackground(Color.black);

        //Creates the BRANCHES window slider
        BranchGUI gui1 = new BranchGUI();
        gui1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        gui1.setSize(400, 100); 
        gui1.setVisible(true); 
        gui1.setTitle("Change number of branches here"); 

        //Creates the THETA window slider
        ThetaGUI gui2 = new ThetaGUI();
        gui2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        gui2.setSize(400, 100); 
        gui2.setVisible(true); 
        gui2.setTitle("Change the angle of divergence here");

        //Creates the THICKNESS window slider
        ThickGUI gui3 = new ThickGUI();
        gui3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        gui3.setSize(400, 100); 
        gui3.setVisible(true); 
        gui3.setTitle("Change the thickness here");

    }
}
