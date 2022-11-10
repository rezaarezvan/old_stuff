import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

class View extends JFrame {
    final int buttonsize = 50;
    Model m;
    Control c;
    int size;

    JPanel boardPan;
    JLabel scoreLab = new JLabel("  0");
    JButton [][] board;

    BevelBorder bRaised = new BevelBorder(BevelBorder.LOWERED);
    BevelBorder bLow    = new BevelBorder(BevelBorder.RAISED);
    BevelBorder bRed    = new BevelBorder(BevelBorder.RAISED, Color.green, Color.black);

    public View(Model m){
        this.m = m;
        m.addObserver(this);
        this.c = new Control(m);

        size = m.boardSize();
        board = new JButton[size][size];
        boardPan = new JPanel(new GridLayout(size, size));
        boardPan.setPreferredSize(new Dimension(buttonsize*size, buttonsize*size));

        for (int row = 0; row <size; row++)
            for (int col= 0; col <size; col++){
                JButton knapp = new JButton(""+ m.getNumber(row+1, col+1));
                board[row][col] = knapp;
                knapp.addActionListener(c);
                knapp.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
        .put(KeyStroke.getKeyStroke("ENTER"), "test");
    knapp.getActionMap().put("test", c);
                knapp.setActionCommand((row+1) +""+ (col+1));
                boardPan.add(knapp);
                knapp.setBorder(bRaised);
                knapp.setEnabled(true);   
            }

        Container cont = getContentPane();
        cont.setLayout(new BorderLayout());
        cont.add(boardPan);
        JPanel scorePan = new JPanel();
        scorePan.setLayout(new FlowLayout());
        scorePan.add(scoreLab, BorderLayout.SOUTH);
        cont.add(scorePan, "South");

        pack();
        System.out.print("Started");

        this.addWindowListener
        (
            new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    View.this.windowClosed();
                }
            }
        );
    }

    protected void windowClosed() {
        
    }

    public void update(){
        for (int row = 0; row <size; row++)
            for (int col = 0; col <size; col++){
                JButton knapp =board[row][col];
                if (m.isChoosen(row+1, col+1)){
                    knapp.setBorder(bRed);
                    knapp.setEnabled(false);
                } else if (m.isFree(row+1, col+1)){
                    knapp.setBorder(bRaised);
                    knapp.setEnabled(true);
                } else{
                    knapp.setBorder(bLow);
                    knapp.setEnabled(false);
                }
                scoreLab.setText(""+ m.getSum());
            }
        System.out.println("\nUppdaterad");
    }    
}