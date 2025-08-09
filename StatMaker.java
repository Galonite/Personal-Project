import java.util.Scanner;

public class StatMaker {
    
    private static Unit GenUnit;
    public enum DiffPreset{
        EASY,
        MEDIUM,
        HARD,
        BOSS
    }

    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        System.out.println("Welcome to the Unit Stat Maker!\n Please choose a preset!");
        System.out.println("1. Easy\n2. Medium\n3. Hard\4. Boss\nCHOICE: ");
        int choice = scnr.nextInt();
        
        while(choice > 4 || choice < 0){
            switch(choice){
                case 1 -> {
                    System.out.println("Enter name for the unit: ");
                    String name = scnr.nextLine();
                    System.out.println("Generating unit preset...");
                    GenUnit = new Unit((int) Math.random() * 11, (int) Math.random() * 51 + 50, 
                    Math.random() * 1, Math.random() * 3, name);
                }
                case 2 -> {
                    System.out.println("Enter name for the unit: ");
                    String name = scnr.nextLine();
                    System.out.println("Generating unit preset...");
                    GenUnit = new Unit((int) Math.random() * 11 + 20, (int) Math.random() * 76 + 125, 
                    Math.random() * 1 + 1, Math.random() * 2 + 3, name);
                }
                case 3 -> {
                    System.out.println("Enter name for the unit: ");
                    String name = scnr.nextLine();
                    System.out.println("Generating unit preset...");
                    GenUnit = new Unit((int) Math.random() * 11, (int)Math.random() * 51 + 50, 
                    Math.random() * 1 + 2, Math.random() * 2 + 5, name);
                }
                case 4 -> {
                    System.out.println("Enter name for the unit: ");
                    String name = scnr.nextLine();
                    System.out.println("Generating unit preset...");
                    GenUnit = new Unit((int) Math.random() * 11, (int) Math.random() * 51 + 50, 
                    Math.random() * 1, Math.random() * 3, name);
                }
                default -> {
                    System.out.println("Choice not found, please try again!");
                    System.out.println("1. Easy\n2. Medium\n3. Hard\4. Boss\nCHOICE: ");
                    choice = scnr.nextInt();
                }
            }

            String repeatAction = "Y";
            while(repeatAction.charAt(0) == 'Y'){
                System.out.println("Generated Unit:\nName: " + GenUnit.getName() + "\nDamage: " + GenUnit.getDamage() + "\nHealth: " + GenUnit.getHealth()
                + "\nSpeed: " + GenUnit.getSpeed() + "\nRange: " + GenUnit.getRange());

                System.out.println("Would you like to adjust values (Y/N): ");
                repeatAction = scnr.nextLine().toUpperCase();
                
                if(repeatAction.charAt(0) == 'Y'){
                    int damage = scnr.nextInt();
                    int health = scnr.nextInt();
                    double speed = scnr.nextDouble();
                    double range = scnr.nextDouble();
                }
            }
        }
        scnr.close();

    }
}
