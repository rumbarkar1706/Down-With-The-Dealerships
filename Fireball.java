public class Fireball extends Spell{
    public Fireball(Player p){
        identifier = 'f';
        damage = p.getPower();
    }
}
