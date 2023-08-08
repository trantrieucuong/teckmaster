/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiktok;

/**
 *
 * @author Legion 5
 */
public class Main {
    public static void main(String[] args) {
        Tiktok tiktok = new Tiktok();

        Idol idol1 = new Idol("Idol1", 1, "idol1@example.com", 1000, "Group A");
        Idol idol2 = new Idol("Idol2", 2, "idol2@example.com", 1500, "Group B");

        tiktok.addIdol(idol1);
        tiktok.addIdol(idol2);

        Song song1 = new Song(101, "Song 1", "Singer A");
        Song song2 = new Song(102, "Song 2", "Singer B");

        tiktok.addSong(song1);
        tiktok.addSong(song2);

        System.out.println(tiktok);
    }
}
