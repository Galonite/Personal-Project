import java.util.Scanner;

public class StatMaker {
    
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
        
        switch(choice){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                choice = -1;
                System.out.println("Choice not found, please try again!");
                break;
        }
        scnr.close();

    }
}
