public class PokeStop extends Portal{
    int lureTimer;
    
    PokeStop(Position pos, String imageEXT, int lureTimer) {
        super(pos, imageEXT);
        this.lureTimer = lureTimer;
    }
}