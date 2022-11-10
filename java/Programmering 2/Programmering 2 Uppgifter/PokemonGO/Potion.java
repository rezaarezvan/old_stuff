public class Potion extends Item{
    int healPercent;
    
    Potion(String name, VisualRepresentation visual, int healPercent) {
       super(name, visual);
       this.healPercent = healPercent;
    }
}