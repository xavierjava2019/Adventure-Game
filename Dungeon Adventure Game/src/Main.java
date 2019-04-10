import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //Objects included in the game
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        //Var sets and data sets for enemies
        String[] foe = { "Necromancer", "Sorcerer", "Wizard", "Evil Witch"};
        int HPEnemyMax = 125;
        int DamageDealtFromEnemy = 75;

        //Var sets and data sets for player
        int PlayerHP = 150;
        int DamageDealtFromPlayer = 85;
        int AmountOfHealingPotions = 3;
        int HealthRestoration = 25;
        int PotDropPercent = 50; //This value is a percentage

        boolean activated = true;
        System.out.println("Magic Quest!");

        GAME:
        while(activated) {
            System.out.println("----------------------------------------------");

            int HPEnemy = rand.nextInt(HPEnemyMax);
            String foes = foe[rand.nextInt(foe.length)];
            System.out.println("\t# " + foes + " has arrived! #\n");

            while(HPEnemy > 0) {
                System.out.println("\tYour Health Points: " + PlayerHP);
                System.out.println("\t" + foes + "'s Health Points: " + HPEnemy);
                System.out.println("\n\tChoose an action");
                System.out.println("\t1. Strike foe");
                System.out.println("\t2. Consume Healing Potion");
                System.out.println("\t3. Flee");

            }









        }



















    }
}