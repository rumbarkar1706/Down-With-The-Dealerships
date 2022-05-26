import java.util.Scanner;
public class Fight {
    double hitChance;
    double critChance;
    public boolean isFightLost = false;
    public void Fight(Player p, Enemy e){
        while(e.getHealth() > 0) {
            System.out.println("Your health is " + p.getHealth() + "\nYour power is " + p.getPower() + "\nYour mana is " + p.getMana() + "\n" + e.getName() + "'s health is " + e.getHealth());
            System.out.println("1: Attack \n2: Magic \n3: Block");
            Scanner keyboard = new Scanner(System.in);
            String s = keyboard.next();
            switch (s) {
                case "1":
                    s = "";
                    e.Hit(p);
                    break;
                case "2":
                    s = "";
                    e.MHit(p);
                    break;
                case "3":
                    p.Block();
                    break;
            }
            if(p.getHealth() <= 0){
                isFightLost = true;
            }
            e.Attack(p);
        }
    }
}
