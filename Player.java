import java.util.Random;

public class Player {
    public double currentHealth;
    public static double health;
    public double power;
    public double currentMana;
    public double mana;
    public String name;
    public int level;
    public double hitChance;
    public boolean block;
        public Player(){
            health = 100.0;
            currentHealth = health;
            power = 10.0;
            mana = 10.0;
            currentMana = mana;
            name = "";
            level = 1;
            hitChance = 0.0;
            block = false;
        }
    public void Hit(Enemy e){
        Random rand = new Random();
        hitChance = rand.nextInt(100);
        if(hitChance < 5){
            System.out.println(e.getName() + " Missed!");
        }
        else{
            health -= e.power;
        }
    }
    public void Block(){
        block = true;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getMana() {
        return mana;
    }

    public void setMana(double mana) {
        this.mana = mana;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public int getLevel() {
        return level;
    }

    public void levelUp() {
                currentHealth += 100;
                health = currentHealth;
                power += 10;
                currentMana += 10;
                mana = currentMana;
        }
    }