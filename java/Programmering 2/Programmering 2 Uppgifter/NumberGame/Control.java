import java.awt.*;
import java.awt.event.*;
public class Control implements ActionListener
{
    Model mod;
    public Control(Model m){
        mod = m;
    }
    //Checkar när en knapp trycks på och kollar vilken det är
    public void actionPerformed(ActionEvent ae){
        int response = Integer.parseInt(ae.getActionCommand());
        int row = response / 10;
        int col = response % 10;
        mod.choose(row, col);
    }
}