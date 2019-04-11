import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //Objects included in the game
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        System.out.println(" Welcome to Magic Quest! ");
        System.out.println("As you enter a dark cave, you see many paths lie before you. Reluctantly, you choose to walk down one of them");
        System.out.println("Which path do you choose to traverse?");


        //Var sets and data sets for enemies
        String[] Magicfoe = { "Necromancer", "Sorcerer", "Wizard", "Evil Witch" };
        String[] Rangedfoe = { "Archer", "Gunslinger", "Hunter", "Ninja"};
        String[] MeleeFoe = { "Swordsman", "Spear-wielder", "Assassin", "Axeman"};
        int HPEnemyMax = 125;
        int DamageDealtFromEnemy = 75;

        //Var sets and data sets for player
        int PlayerHP = 150;
        int DamageDealtFromPlayer = 85;
        int AmountOfHealingPotions = 3;
        int HealthRestoration = 25;
        int PotDropPercent = 50; //This value is a percentage

        boolean activated = true;

        GAME:
        while(activated) {
            System.out.println("----------------------------------------------");

            int HPEnemy = rand.nextInt(HPEnemyMax);
            String foes = Magicfoe[rand.nextInt(Magicfoe.length)];
            System.out.println("\t# " + foes + " has arrived! #\n");

            while(HPEnemy > 0) {
                System.out.println("\tYour Health Points: " + PlayerHP);
                System.out.println("\t" + foes + "'s Health Points: " + HPEnemy);
                System.out.println("\n\tChoose an action");
                System.out.println("\t1. Strike foe");
                System.out.println("\t2. Consume Healing Potion");
                System.out.println("\t3. Flee");



                String input = in.nextLine();
                if(input.equals("1")) {
                    int Infliction = rand.nextInt(DamageDealtFromPlayer);
                    int Injury = rand.nextInt(DamageDealtFromEnemy);

                }
                else if(input.equals("2")) {

                }
                else if(input.equals("3")) {

                }
                else {



                }



            }









        }



















    }
}