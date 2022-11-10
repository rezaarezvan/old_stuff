import java.util.ArrayList;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Polygon extends GeoObject{
    protected int[] xPunkter;
    protected int[] yPunkter;

    public Polygon(int x, int y, int[] xPunkter, int[] yPunkter) {
        super(x,y);
        this.xPunkter = new int[xPunkter.length];
        this.yPunkter = new int[yPunkter.length];

        for (int i=0; i < xPunkter.length; i++) {
            this.xPunkter[i] = xPunkter[i]; 
        }

        for (int i=0; i < yPunkter.length; i++) {
            this.yPunkter[i] = yPunkter[i]; 
        }

    }

    public double area() {                                                      

        int area = 0;

        // Formel som jag hittade på nätet :)
        int j = xPunkter.length - 1; 
        for (int i = 0; i < xPunkter.length; i++) { 

            area += (xPunkter[j] + xPunkter[i]) * (yPunkter[j] - yPunkter[i]); 

            
            j = i;  
        } 
 
        return Math.abs(area / 2.0); 
    } 

    public double omkrets(){
        int omkrets = 0;
        
        // Pythagoras 
        
        for (int i = 0; i < xPunkter.length; i++) { 

            omkrets += Math.pow(Math.pow((Math.abs(xPunkter[i] -xPunkter[i+1])), 2) + Math.pow((Math.abs(yPunkter[i] -yPunkter[i+1])), 2), 0.5);

        } 
        return omkrets;
    }

    public void draw(Graphics g){
        g.drawPolygon(xPunkter, yPunkter, xPunkter.length);
    }
}