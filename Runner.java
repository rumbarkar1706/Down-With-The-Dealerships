import java.util.Scanner;
public class Runner {
    private static Player p = new Player();
    private static Fight f = new Fight();
    private static Honda h = new Honda();
    private static Toyota t = new Toyota();
    private static Chevorlet c = new Chevorlet();
    private static Mini m = new Mini();
    private static Nissan n = new Nissan();
    private static Hyundai hy = new Hyundai();
    private static Audi a = new Audi();
    private static Mercedes me = new Mercedes();
    private static Porsche po = new Porsche();
    private static Elon e = new Elon();
    private static Enemy[] enemies = {h, t, c, m, n, hy, a, me, po, e};
    public static void PlayGame(){
        System.out.println("Welcome to 'Down with Dealerships'. Thank you for playing and I hope you enjoy.");
        System.out.println("Enter 1 to Begin or 2 to Quit");
        Scanner keyboard = new Scanner(System.in);
        String s = keyboard.next();
        if(s.equals("1")){
            s = "";
            System.out.println("Please enter your name");
            s = keyboard.next();
            p.setName(s);
            System.out.println(p.getName() + " is going on an adventure to take down all the car dealerships of the world \nafter their partner died of boredom while filling out paperwork in a crusty tesla dealership.\nIt's up to you to stop Elon Musk and restore order to the car buying process.");
            for(int i = 0; i < enemies.length; i++){
                System.out.println("\nGet Ready for Your Fight Against " + enemies[i].getName());
                f.Fight(p, enemies[i]);
                if(f.isFightLost){
                    System.out.println("Game Over");
                    break;
                }
                if(i < 9){
                    System.out.println("Congratulations! You Beat " + enemies[i].getName() + "\n\n\n\n\n\n");
                    p.levelUp();
                }
                if(i == 9){
                    System.out.println("Congratulations! You Brought Down All The Dealerships, and Now Nothing Can Go Wrong During The Car Buying Process!");
                }
            }
        }
        else if(s.equals("2")){
            p.setHealth(0);
        }
        else{
            System.out.println("Invalid Input");
        }
    }
    public static void main(String[] args) {
        PlayGame();
        System.out.println("Thanks for Playing");
    }
}