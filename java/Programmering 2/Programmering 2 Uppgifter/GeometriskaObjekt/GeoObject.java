import java.util.ArrayList;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public abstract class GeoObject{
    Point p;
    public GeoObject(int x, int y) {
        p = new Point(x,y);
    }

    public abstract double area();

    public abstract double omkrets();

    public abstract void draw(Graphics g);

}