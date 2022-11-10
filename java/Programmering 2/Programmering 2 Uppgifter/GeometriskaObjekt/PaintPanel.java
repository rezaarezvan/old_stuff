 
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

// This class shows how java can draw geometrical shapes
// The 'paintComponent() method is the key to all drawing!!
public class PaintPanel extends JPanel {

    int x = 200;
    int y = 100;
    int[] xPunkter = {300, 450, 570, 600};
    int[] yPunkter = {250,660,750,800};
    // Deklarera objekt som skall ritas här!
    // t.ex. Boll b;
    Circle geo1 = new Circle(900,0, 100);
    Rectangle geo2 = new Rectangle(100, 200, 100, 200);
    Square geo3 = new Square(200, 500, 100, 200);
    Ellipse geo4 = new Ellipse(300, 400, 100, 200);
    Polygon geo5 = new Polygon(100,100,xPunkter,yPunkter);
    ArrayList<GeoObject> list;

    public PaintPanel() {
        setPreferredSize(new java.awt.Dimension(1000, 600));
        // Initiera objekt här
        list = new ArrayList<GeoObject>();
        list.add(geo1);
        list.add(geo2);
        list.add(geo3);
        list.add(geo4);
        list.add(geo5);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Initial testing only. Delete these 2 lines :)
        g.setColor(Color.red);
        g.drawRect(x, y, 70, 30);
        // Anropa objekt som skall ritas här.
        // t.ex. b.draw();
        
        for (GeoObject obj : list)   obj.draw(g);
    }

}
