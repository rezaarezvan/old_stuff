abstract class PokeType{
    String name;
    int nr;
    VisualRepresentation visual;
    // Någon logik som kollar ifall den har en evolution, annars false.
    final int evolution = this.nr + 1;
    int baseAtk;
    int baseDef;
    int baseHp;
    
    PokeType(int nr,VisualRepresentation visual,int baseAtk ,int baseDef,int baseHp   ) {
    
    this.nr = nr;
    this.visual = visual;
    this.baseAtk = baseAtk;
    this.baseDef = baseDef;
    this.baseHp = baseHp;
    
    }
}