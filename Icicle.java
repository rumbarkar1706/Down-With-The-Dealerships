public class Icicle extends Spell{
    public Icicle(Player p){
        identifier = 'i';
        damage = p.getPower();
    }
}
