import javax.swing.*; 
import java.awt.*;
import java.awt.Color; 
import javax.swing.event.*; 

/**
 * Creates the Thickness window for the fractal tree. 
 * 
 * @Adam Espinoza & Samuel Garcia  
 * @2015-04-06
 */
public class ThickGUI extends JFrame
{
    public JSlider slider; 
    public JLabel label; 
    private int value; 
    
    public ThickGUI()
    {
        
        //Layout for Slider 
        setLayout(new FlowLayout()); 
        slider = new JSlider(JSlider.HORIZONTAL, 0, 10, 0); 
        slider.setMajorTickSpacing(1); 
        slider.setPaintTicks(true); 
        add(slider); 

        label = new JLabel("Current value: 0");
        add(label); 

        event e = new event(); 
        slider.addChangeListener(e); 
        
        //Constructor Window for the Slider
        
        //ThickGUI gui = new ThickGUI(); 
        //gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        //gui.setSize(300, 100); 
        //gui.setVisible(true); 
        //gui.setTitle("Change thickness here"); 
        
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
            //window.getFrame().repaint();
        }
    }
}
