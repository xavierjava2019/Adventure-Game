import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //Objects included in the game
        Scanner in = new Scanner(System.in);
        Random rand = new Random();



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
        System.out.println(" Welcome to Magic Quest! ");
        System.out.println("As you enter a dark cave, you see many paths lie before you. Reluctantly, you choose to walk down one of them");
        System.out.println("Which path do you choose to traverse?");

        GAME:
        while(activated) {
            System.out.println("----------------------------------------------");

            int HPEnemy = rand.nextInt(HPEnemyMax);
            String foes = Magicfoe[rand.nextInt(Magicfoe.length)];
            System.out.println("\t# " + foes + " has arrived! #\n");

            while (HPEnemy > 0) {
                System.out.println("\tYour Health Points: " + PlayerHP);
                System.out.println("\t" + foes + "'s Health Points: " + HPEnemy);
                System.out.println("\n\tChoose an action");
                System.out.println("\t1. Strike foe");
                System.out.println("\t2. Consume Healing Potion");
                System.out.println("\t3. Flee");


                String input = in.nextLine();
                if (input.equals("1")) {
                    int Infliction = rand.nextInt(DamageDealtFromPlayer);
                    int Injury = rand.nextInt(DamageDealtFromEnemy);

                    HPEnemy -= Infliction;
                    PlayerHP -= Injury;

                    System.out.println("\t- You attack the " + foes + " for " + Infliction + " damage ");
                    System.out.println("\t- The " + foes + " attacks you and you lose " + Injury + " HP as a result of your attack!");

                    if (PlayerHP < 1) {
                        System.out.println("\t- The " + foes + " has hurt you too much, you cannot continue, goodbye!");
                        break;


                    }

                } else if (input.equals("2")) {
                    if (AmountOfHealingPotions > 0) {
                        PlayerHP += HealthRestoration;
                        AmountOfHealingPotions--;
                        System.out.println("\t- Consuming a potion of healing, you gain " + HealthRestoration + " HP. " + "\n\t- You now have " + PlayerHP + " HP. " + "\n\t- You now have " + AmountOfHealingPotions + " Potion(s) of healing left.\n");
                    }
                    else {
                        System.out.println("\t- Your supply of potions of healing has run out. If you can slay another enemy, you shall be granted another one!\n");
                        }

                    }
                    else if (input.equals("3")) {
                        System.out.println("\t- You cower in fear and retreat, safe from the " + foes + "'s attack");
                        continue GAME;


                    }
                    else {
                        System.out.println("\tInput does not execute known command");


                    }
                }

            if(PlayerHP < 1) {
                System.out.println("You have died! Game over!");
                break;
            }

            System.out.println("----------------------------------------------");
            System.out.println(" # " + foes + " has been slain! #");
            System.out.println(" # You have " + PlayerHP + " HP remaining! #");
            if(rand.nextInt(100) < PotDropPercent) {
                AmountOfHealingPotions ++;
                System.out.println(" # The " + foes + " dropped a potion of healing! # ");
                System.out.println(" # Current potion(s) of healing supply: " + AmountOfHealingPotions + " #");
            }
            System.out.println("----------------------------------------------");
            System.out.println("Choose an action:");
            System.out.println("1. Fight on!");
            System.out.println("2. Get outta here!");

            String input = in.nextLine();

            while(!input.equals("1") && !input.equals("2")) {
                System.out.println("Command does not exist, sorry!");
                input = in.nextLine();

                }

         if(input.equals("1")) {
             System.out.println("The adventure will go on!");
         }
           else if(input.equals("2")) {
               System.out.println("With an attitude of glory you exit this cave victoriously!");

                }
            }

        System.out.println("#######################################################");
        System.out.println(" # THANK YOU FOR PARTICIPATING IN THE WIZARD'S QUEST # ");
        System.out.println("#######################################################");

        }
    }
