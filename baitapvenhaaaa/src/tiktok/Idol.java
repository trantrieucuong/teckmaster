/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiktok;

/**
 *
 * @author Legion 5
 */
public class Idol {
     private String name;
    private int id;
    private String email;
    private int followers;
    private String group;

    public Idol(String name, int id, String email, int followers, String group) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.followers = followers;
        this.group = group;
    }

    @Override
    public String toString() {
        return "Idol{" + "name=" + name + ", id=" + id + ", email=" + email + ", followers=" + followers + ", group=" + group + '}';
    }
    
}
