import java.util.ArrayList;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Square extends GeoObject{
    protected int w;
    
    public Square(int x, int y, int w) {
        super(x,y);
        this.w = w;
    }
    
    public Square(int x, int y, int w, int h) {
        super(x,y);
        this.w = w;
    }

    public double area(){
        return w*w;
    }
    
    public double omkrets(){
        return w*4;
    }
    
    public double getSida(){
        return w;
    }
    
    public void draw(Graphics g){
        g.drawRect(p.getX() , p.getY() , w, w);
    }
}