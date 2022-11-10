public class Revive extends Item{
    int healPercent;
    
    Revive(String name, VisualRepresentation visual, int healPercent) {
       super(name, visual);
       this.healPercent = healPercent;
    }
}