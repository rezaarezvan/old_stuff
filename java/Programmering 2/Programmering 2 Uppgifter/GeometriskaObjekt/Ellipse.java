import java.util.ArrayList;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Ellipse extends Circle{
    protected int rY;
    
    public Ellipse(int x, int y, int rX, int rY) {
        super(x,y,rX,rY);
        this.rY = rY;
    }

    public double area(){
        return rX*rY*Math.PI;
    }
    
    public double omkrets(){
        
        // Kvadratiskt ungefär på omkretesen
        
        return 2*3.14*Math.sqrt((Math.pow(rX,2)+Math.pow(rY,2))/2);
    }
    
    public double getRadieX() {
        return rX;
    }
    
    public double getRadieY() {
        return rY;
    }
    
    public void draw(Graphics g){
        g.drawOval(p.getX() , p.getY() , rX, rY);
    }
}