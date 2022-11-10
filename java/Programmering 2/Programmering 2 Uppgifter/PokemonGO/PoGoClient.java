import java.util.ArrayList;

public class PoGoClient{
    PlayerInfo me; 
    ArrayList<PokeType> pokeDexL;
    ArrayList<Pokemon> pokemonL;
    ArrayList<Item> itemL;
    String settingsExt;
    Position pos;
    Map map;
    String shop;

    PoGoClient(PlayerInfo me, ArrayList<PokeType> pokeDexL, ArrayList<Pokemon> pokemonL,
                ArrayList<Item> itemL, String settingsExt, Position pos, Map map, String shop) {
        this.me = me;
        this.pokeDexL = pokeDexL;
        this.pokemonL =  pokemonL;
        this.itemL = itemL;
        this.settingsExt = settingsExt;
        this.pos = pos;
        this.map = map;
        this.shop = shop;
    }
}