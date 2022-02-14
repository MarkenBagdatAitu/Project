package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        NationalBank nb = new NationalBank();
        SecondTierBank stb = new SecondTierBank();
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        double money;
        int duration;
        int client;

        while (choice != 0) {
            System.out.println("Press 1 to calculate deposit in National Bank");
            System.out.println("Press 2 to calculate deposit in Second Tier Bank");
            System.out.println("Press 3 to calculate credit in National Bank");
            System.out.println("Press 4 to calculate credit in Second Tier Bank");
            System.out.println("Press 0 to exit");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1 -> {
                    System.out.println("Press money (example:4,5):");
                    money = sc.nextDouble();
                    System.out.println("Press duration(in months): ");
                    duration = sc.nextInt();
                    sc.nextLine();
                    System.out.println("If you are Legal Entities press 1 and if Individuals press 2");
                    client = sc.nextInt();
                    System.out.println(nb.deposit(money, duration, client));
                }
                case 2 -> {
                    System.out.println("Press money (example:4,5):");
                    money = sc.nextDouble();
                    System.out.println("Press duration(in months): ");
                    duration = sc.nextInt();
                    sc.nextLine();
                    System.out.println("If you are Legal Entities press 1 and if Individuals press 2");
                    client = sc.nextInt();
                    System.out.println(stb.deposit(money, duration, client));
                }
                case 3 -> {
                    System.out.println("Press money (example:4,5):");
                    money = sc.nextDouble();
                    System.out.println("Press duration(in months): ");
                    duration = sc.nextInt();
                    sc.nextLine();
                    System.out.println("If you are Legal Entities press 1 and if Individuals press 2");
                    client = sc.nextInt();
                    System.out.println(nb.credit(money, duration, client));
                }
                case 4 -> {
                    System.out.println("Press money (example:4,5):");
                    money = sc.nextDouble();
                    System.out.println("Press duration(in months): ");
                    duration = sc.nextInt();
                    sc.nextLine();
                    System.out.println("If you are Legal Entities press 1 and if Individuals press 2");
                    client = sc.nextInt();
                    System.out.println(stb.credit(money, duration, client));
                }
            }
        }
    }
}
