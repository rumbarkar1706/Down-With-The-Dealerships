import java.util.Random;
import java.util.Scanner;

public abstract class Enemy {
    public double health;
    public double power;
    public double hitChance = 0;
    public String name;
    public char weakness;
    public void Hit(Player p){
        Random rand = new Random();
        hitChance = rand.nextInt(100);
        if(hitChance < 5){
             System.out.println(p.getName() + " Missed!");
        }
        else{
            health -= p.getPower();
            System.out.println("You hit " + getName() + " for " + p.getPower() + " damage!");
        }
    }
    public void MHit(Player p){
        System.out.println("1: Fireball \n2: Icicle \n3: Thunderbolt");
        Fireball f = new Fireball(p);
        Icicle i = new Icicle(p);
        Thunderbolt t = new Thunderbolt(p);
        Scanner keyboard = new Scanner(System.in);
        String s = keyboard.next();
        p.mana -= 5;
        if(p.mana >= 0) {
        switch(s){
            case "1":
                    if (getWeakness() == f.identifier) {
                        health -= p.getPower() * 2;
                        System.out.println("Super Effective! You hit " + getName() + " for " + p.getPower() * 2 + " damage");
                    } else {
                        health -= p.getPower();
                        System.out.println("You hit " + getName() + " for " + p.getPower() + " damage!");
                    }
                    break;
                    case "2":
                        if (getWeakness() == i.identifier) {
                            health -= p.getPower() * 2;
                            System.out.println("Super Effective! You hit " + getName() + " for " + p.getPower() * 2 + " damage");
                        } else {
                            health -= p.getPower();
                            System.out.println("You hit " + getName() + " for " + p.getPower() + " damage!");
                        }
                        break;
                    case "3":
                        if (getWeakness() == t.identifier) {
                            health -= p.getPower() * 2;
                            System.out.println("Super Effective! You hit " + getName() + " for " + p.getPower() * 2 + " damage");
                        } else {
                            health -= p.getPower();
                            System.out.println("You hit " + getName() + " for " + p.getPower() + " damage!");
                        }
                        break;
                    }
                }
                else{
                    System.out.println("You Have No Mana!");
                    p.mana = 0;
                }
            }
    public void Attack(Player p){
        Random rand = new Random();
        hitChance = rand.nextInt(100);
        if(hitChance < 5){
            System.out.println(name + " Missed");
        }
        else{
            if(hitChance >= 95 && p.block){
                p.setHealth(p.getHealth() - power * 0.6 * 2);
                System.out.println("You Blocked! " + name + " Had a Critical Hit!");
            }
            else if(hitChance >= 95){
                p.setHealth(p.getHealth() - power * 2);
                System.out.println(name + " Had a critical hit and hit you for " + power * 2 + "damage!");
            }
            else if(p.block){
             p.setHealth(p.getHealth() - power * 0.6);
             System.out.println("You Blocked! " + name + " Hit you for " + power * 0.6 + " damage!");
            }
            else{
                p.setHealth(p.getHealth() - power);
                System.out.println(name + " Hit you for " + power + " damage!");
            }
        }
    }

    public double getHealth() {
        return health;
    }
    public String getName() {
        return name;
    }
    public double getPower() {
        return power;
    }
    public char getWeakness() {
        return weakness;
    }
    public void setHealth(double health) {
        this.health = health;
    }
}