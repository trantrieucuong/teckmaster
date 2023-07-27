/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java3full.dou;

import com.sun.jdi.connect.spi.Connection;
import java.nio.channels.ConnectionPendingException;
import java.util.List;
import java3full.Connecsion;
import java3full.ben.studenben;

/**
 *
 * @author Legion 5
 */
public class studendao {
    public List<studenben>getList(){
        try{
            Connecsion conn=new Connecsion().getConnecsion();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
