 
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

// This class shows how java can draw geometrical shapes
// The 'paintComponent() method is the key to all drawing!!
public class PaintPanel extends JPanel {

    int x = 200;
    int y = 100;
    // Deklarera objekt som skall ritas här!
    // t.ex. Boll b;
    GeoObject geo1;
    ArrayList<GeoObject> list;

    public PaintPanel() {
        setPreferredSize(new java.awt.Dimension(1000, 600));
        // Initiera objekt här
        geo1 = new Circle(70);
        list = new ArrayList<GeoObject>();
        list.add(new Circle(30, Color.GREEN, 500, 300));
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Initial testing only. Delete these 2 lines :)
        g.setColor(Color.red);
        g.drawRect(x, y, 70, 30);
        // Anropa objekt som skall ritas här.
        // t.ex. b.draw();
        geo1.draw(g);
        for (GeoObject obj : list)   obj.draw(g);
    }

}
