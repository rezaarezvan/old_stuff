import java.util.ArrayList;

public class Gym extends Portal{
    String team;
    ArrayList<PlayerInfo> defendersL;
    int prestige;
    
    Gym(Position pos, String imageEXT, String team, ArrayList<PlayerInfo> defendersL, int prestige) {
        super(pos, imageEXT);
        this.team = team;
        this.defendersL = defendersL;
        this.prestige = prestige;
    }
}