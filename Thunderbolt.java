public class Thunderbolt extends Spell{
    public Thunderbolt(Player p){
        identifier = 't';
        damage = p.getPower();
    }
}
