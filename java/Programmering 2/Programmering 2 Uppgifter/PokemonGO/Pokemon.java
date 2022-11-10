public class Pokemon extends PokeType{
    int ivAtk;
    int ivDef;
    int ivHp;
    int cp;
    int hp;
    int level;
    PlayerInfo owner;
    Position pos;
    
    Pokemon(int ivAtk, int ivDef, int ivHp, int cp, int hp, int level, PlayerInfo owner
    , Position pos, int nr,VisualRepresentation visual,int baseAtk ,int baseDef,int baseHp){
        super(nr,visual,baseAtk ,baseDef,baseHp);
        this.ivAtk = ivAtk;
        this.ivDef = ivDef;
        this.ivHp = ivHp;
        this.cp = cp;
        this.level = level;
        this.owner = owner;
        this.pos = pos;
    }
}