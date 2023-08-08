/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiktok;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Legion 5
 */
public class Tiktok {
    private List<Idol> idols;
    private List<Song> songs;

    public Tiktok() {
        idols = new ArrayList<>();
        songs = new ArrayList<>();
    }

    public void addIdol(Idol idol) {
        idols.add(idol);
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    // Other methods to interact with idols and songs
    // ...

    @Override
    public String toString() {
        return "Tiktok [idols=" + idols + ", songs=" + songs + "]";
    }
}
