public class Boost extends Item{
    int timer;
    
    Boost(String name, VisualRepresentation visual, int timer) {
       super(name, visual);
       this.timer = timer;
    }
}