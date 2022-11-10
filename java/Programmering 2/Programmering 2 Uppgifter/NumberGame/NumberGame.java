/**
 * @(#)NumberGame.java
 *
 * JFC NumberGame application
 *
 * @author 
 * @version 1.00 2009/10/7
 */
import javax.swing.*;

public class NumberGame {
    
    public static void main(String[] args) {
    	
        String sizeText = JOptionPane.showInputDialog("Vilken storlek önskas (3-9)? ");
        int size = Integer.valueOf(sizeText);
        // Create application frame.
        Model m = new Model(size);
        View v = new View(m);
        
        // Show frame.
        v.setVisible(true);
    }
}
/*
 *   60  55  55 (11) 69
 *   45  21  23 (26) 64
 *  (83)(30)(73)[83](92)
 *   64  20  42 (64) 46
 *   16  74  92 (63) 97
 *  Current score is: 83
 *  
 *  Välj x, y: 
 */