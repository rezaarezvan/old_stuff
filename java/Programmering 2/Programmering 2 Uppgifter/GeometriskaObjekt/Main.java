public class Main{
    public static void main(String[]args) {
        
        
        Circle c = new Circle(3,5,5);
        Ellipse e = new Ellipse(1,2,3,5);
        Square s = new Square(7,8,5);
        Rectangle r = new Rectangle(9,3,5,8);
        
        System.out.println("Cirkel med radien: " + c.getRadie());

        System.out.println("Area: " + c.area());
        System.out.println("Omkrets: " + c.omkrets());

        System.out.println("\nEllips med x-radien: " + e.getRadieX() + " och y-radien " + e.getRadieY());

        System.out.println("Area: " + e.area());
        System.out.println("Omkrets: " + e.omkrets());

        System.out.println("\nKvadrat med sidan: " + s.getSida());

        System.out.println("Area: " + s.area());
        System.out.println("Omkrest: " + s.omkrets());
        
        System.out.println("\nRektangel med bredden: " + r.getBredd() + " och längden " + r.getLängd());

        System.out.println("Area: " + r.area());
        System.out.println("Omkrets: " + r.omkrets());
    }
}