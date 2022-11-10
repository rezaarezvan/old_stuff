/* import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

class NOTView extends JFrame {
    final int buttonSize = 60;
    Model m;
    Control c;
    int size;

    JPanel boardPan;
    JLabel scoreLab = new JLabel("   0");
    JButton [][] board;

    BevelBorder bRaised	= new BevelBorder(BevelBorder.RAISED);
    BevelBorder bLow	= new BevelBorder(BevelBorder.LOWERED);
    BevelBorder bRed	= new BevelBorder(BevelBorder.LOWERED, Color.red, Color.blue);

    // Konstruktor
    public NOTView(Model m){
        this.m = m;
        m.addObserver(this);
        c = new Control(m);

        size = m.boardSize();
        board = new JButton[size][size];
        boardPan = new JPanel(new GridLayout(size, size));
        boardPan.setPreferredSize(new Dimension(buttonSize*size, buttonSize*size));

        for (int row = 0; row <size; row++)
            for (int col = 0; col <size; col++){
                JButton b = new JButton(""+ m.getNumber(row+1, col+1));
                board[row][col] = b;
                b.addActionListener(c);
                b.setActionCommand((row+1) +""+ (col+1));
                boardPan.add(b);
                b.setBorder(bRaised);
                b.setEnabled(true);
            }

        Container cont = getContentPane();
        cont.setLayout(new BorderLayout());
        cont.add(boardPan, "Center");
        JPanel scorePan = new JPanel();
        scorePan.setLayout(new FlowLayout());
        scorePan.add(scoreLab, BorderLayout.SOUTH);
        cont.add(scorePan, "South");

        pack();
        System.out.println("Started");

        // Add window listener.
        this.addWindowListener
        (
            new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    View.this.windowClosed();
                }
            }
        ); 
    }

    /**
     * Shutdown procedure when run as an application.
    
   
    protected void windowClosed() {
        // Exit application.
        System.exit(0);
    }

    public void update(){
        for (int row = 0; row <size; row++)
            for (int col = 0; col <size; col++){
                JButton b =board[row][col];
                if (m.isChoosen(row+1, col+1)){
                    b.setBorder(bRed);
                    b.setEnabled(false);
                } else if (m.isFree(row+1, col+1)){
                    b.setBorder(bRaised);
                    b.setEnabled(true);
                } else{
                    b.setBorder(bLow);
                    b.setEnabled(false);
                }
                scoreLab.setText(""+ m.getSum());

            }
        System.out.println("Updated");
        //super.update();
    }
}
 */