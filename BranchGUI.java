import javax.swing.*; 
import java.awt.*;
import java.awt.Color; 
import javax.swing.event.*; 

/**
 * Creates the Slider window for the fractal tree. 
 * 
 * @Adam Espinoza & Samuel Garcia  
 * @2015-04-06
 */
public class BranchGUI extends JFrame
{
    public JSlider slider; 
    public JLabel label; 
    private int value; 
    
    public BranchGUI()
    {
        //Layout for Slider 
        setLayout(new FlowLayout()); 
        slider = new JSlider(JSlider.HORIZONTAL, 0, 20, 0); 
        slider.setMajorTickSpacing(2); 
        slider.setPaintTicks(true); 
        add(slider); 

        label = new JLabel("Current value: 0");
        add(label); 

        event e = new event(); 
        slider.addChangeListener(e); 
        
        //Constructor Window for the Slider
        
        //JFrame gui = new JFrame(); 
        //gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        //gui.setSize(300, 100); 
        //gui.setVisible(true); 
        //gui.setTitle("Change number of branches here"); 
        
    }
    
    public int getSliderValue()
    {
        return value; 
    }
    
    public class event implements ChangeListener
    {
        public void stateChanged(ChangeEvent e)
        {
            value = slider.getValue(); 
            label.setText("Current value: " + value); 
        }
    }
}
