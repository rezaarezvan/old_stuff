import java.util.ArrayList;

public class Map {
    String imgExt;
    Portal portal;
    ArrayList<Pokemon> pokemonL;
    
    Map(String imgExt, Portal portal,ArrayList<Pokemon> pokemonL) {
        this.imgExt = imgExt;
        this.portal = portal;
        this.pokemonL = pokemonL;
    }
}