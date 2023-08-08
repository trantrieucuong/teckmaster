/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java3full.ben;

import java.io.Serializable;

/**
 *
 * @author Legion 5
 */
public class studenbe implements Serializable {
    private String masv,tensv;
    private int tuoi;

    public studenbe() {
    }

    public studenbe(String masv, String tensv, int tuoi) {
        this.masv = masv;
        this.tensv = tensv;
        this.tuoi = tuoi;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getTensv() {
        return tensv;
    }

    public void setTensv(String tensv) {
        this.tensv = tensv;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    
}
