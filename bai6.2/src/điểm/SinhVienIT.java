/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package điểm;

import sinhvien.SinhVienTechMaster;

/**
 *
 * @author Legion 5
 */
public class SinhVienIT extends SinhVienTechMaster{
     private double diemJava;
    private double diemHTML;
    private double diemCSS;

    public SinhVienIT(String hoTen, String nganh, double diemJava, double diemHTML, double diemCSS) {
        super(hoTen, nganh, 0); // Khởi tạo điểm ban đầu là 0, sẽ tính lại trong phương thức getDiem()
        this.diemJava = diemJava;
        this.diemHTML = diemHTML;
        this.diemCSS = diemCSS;
    }

    public double getDiemJava() {
        return diemJava;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }

    public double getDiemHTML() {
        return diemHTML;
    }

    public void setDiemHTML(double diemHTML) {
        this.diemHTML = diemHTML;
    }

    public double getDiemCSS() {
        return diemCSS;
    }

    public void setDiemCSS(double diemCSS) {
        this.diemCSS = diemCSS;
    }
    

    @Override
    public double getDiem() {
        return (2 * this.diemJava + this.diemHTML + this.diemCSS) / 4;
    }
    
}
