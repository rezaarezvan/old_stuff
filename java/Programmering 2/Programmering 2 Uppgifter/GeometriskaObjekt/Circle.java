import java.util.ArrayList;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Circle extends GeoObject{
    protected int rX;
    
    public Circle(int x, int y, int rX) {
        super(x,y);
        this.rX = rX;
    }
    
    public Circle(int x, int y, int rX, int rY) {
        super(x,y);
        this.rX = rX;
    }
    

    
    public double area(){
        return rX*rX*Math.PI;
    }
    
    public double omkrets(){
        return 2*rX*Math.PI;
    }

    public double getRadie() {
        return rX;
    }
    
    public void draw(Graphics g){
        g.drawOval(p.getX() , p.getY() , rX, rX);
    }
}