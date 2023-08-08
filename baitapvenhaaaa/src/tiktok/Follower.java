/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiktok;

/**
 *
 * @author Legion 5
 */
public class Follower {
    private String name;
    private int id;
    private String email;
    private int numberOfLikes;

    public Follower(String name, int id, String email, int numberOfLikes) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.numberOfLikes = numberOfLikes;
    }

    // Getters and setters
    // ...

    @Override
    public String toString() {
        return "Follower [name=" + name + ", id=" + id + ", email=" + email + ", numberOfLikes=" + numberOfLikes + "]";
    }
}
