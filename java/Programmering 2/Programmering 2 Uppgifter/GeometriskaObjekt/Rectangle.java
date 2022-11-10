import java.util.ArrayList;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Rectangle extends Square{
    protected int h;
    
    public Rectangle(int x, int y, int w, int h) {
        super(x,y,w,h);
        this.h = h;
    }

    public double area(){
        return h*w;
    }
    
    public double omkrets(){
        return (2*h) + (2*w);
    }
    
    public double getBredd(){
        return w;
    }
    
    public double getLängd(){
        return h;
    }
    
    public void draw(Graphics g){
        g.drawRect(p.getX() , p.getY() , w, h);
    }
}