public class Ball extends Item{
    int captureRate;
    
    Ball(String name, VisualRepresentation visual, int captureRate) {
       super(name, visual);
       this.captureRate = captureRate;
    }
}