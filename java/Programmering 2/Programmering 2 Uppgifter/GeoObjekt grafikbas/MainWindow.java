
 

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// This class shows 
public class MainWindow extends JFrame {
    JPanel      panBut;
    PaintPanel  panPaint;
    JButton     butLeft, butRight;
    
    public MainWindow(){
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);Container cont = getContentPane();
        
        setLayout(new BorderLayout());
        panBut = new JPanel();
        panBut.setLayout(new GridLayout(2,1));
        butLeft = new JButton("LEFT");
        butRight = new JButton("Right there, I'm a long one :P");
        panBut.add(butLeft);
        panBut.add(butRight);
        add(panBut, "South");
        
        panPaint = new PaintPanel();
        add(panPaint, "Center");
        pack();
        
    }
}
