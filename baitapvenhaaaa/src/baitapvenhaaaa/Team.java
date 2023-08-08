/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapvenhaaaa;

/**
 *
 * @author Legion 5
 */
public class Team {
    String teamName;
    Champion[] champions;

    public Team(String teamName) {
        this.teamName = teamName;
        this.champions = new Champion[5];
    }

    public void setChampion(int index, String name, String position) {
        champions[index] = new Champion(name, position);
    }
}
