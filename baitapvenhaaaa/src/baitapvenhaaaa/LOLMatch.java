/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitapvenhaaaa;

import java.util.Scanner;

/**
 *
 * @author Legion 5
 */
public class LOLMatch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        Scanner scanner = new Scanner(System.in);

        Team[] teams = new Team[2];
        System.out.println("time star:");
        int time=Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < 2; i++) {
            System.out.print("Enter name for team " + (i + 1) + ": ");
            String teamName = scanner.nextLine();
            teams[i] = new Team(teamName);

            for (int j = 0; j < 5; j++) {
                System.out.print("Enter name for champion " + (j + 1) + " in team " + (i + 1) + ": ");
                String championName = scanner.nextLine();
                System.out.print("Enter position for champion " + (j + 1) + " in team " + (i + 1) + ": ");
                String championPosition = scanner.nextLine();
                teams[i].setChampion(j, championName, championPosition);
            }
        }

        System.out.println("\nMatch Information:");
        for (int i = 0; i < 2; i++) {
            System.out.println("Team " + teams[i].teamName);
            for (int j = 0; j < 5; j++) {
                Champion champion = teams[i].champions[j];
                System.out.println("Champion " + (j + 1) + ": " + champion.name + " (" + champion.position + ")");
            }
            System.out.println();
        }

        scanner.close();
    }
}
    

