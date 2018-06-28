import Characters.Players.Barbarian;
import Characters.Players.Cleric;
import Characters.Players.Knight;
import Characters.Players.Mage;
import Items.Item;

import java.util.ArrayList;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        System.out.println("Name your Barbarian");
        Scanner scanner = new Scanner(System.in);
        String barbarianName = scanner.nextLine();

        System.out.println("Name your Cleric");
        Scanner scanner1 = new Scanner(System.in);
        String clericName = scanner.nextLine();

        System.out.println("Name your Knight");
        Scanner scanner2 = new Scanner(System.in);
        String knightName = scanner.nextLine();

        System.out.println("Name your Mage");
        Scanner scanner3 = new Scanner(System.in);
        String mageName = scanner.nextLine();

        Barbarian barbarian = new Barbarian(barbarianName, 12, new ArrayList<Item>(), 1);
        Cleric cleric = new Cleric(clericName, 8, new ArrayList<Item>(), 1);
        Knight knight = new Knight(knightName, 10, new ArrayList<Item>(), 1);
        Mage mage = new Mage(mageName, 10, 20, new ArrayList<Item>(), 1);




    }



}
