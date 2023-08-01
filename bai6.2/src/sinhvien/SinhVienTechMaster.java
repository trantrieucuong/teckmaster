/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sinhvien;

/**
 *
 * @author Legion 5
 */
public  class SinhVienTechMaster {
   private String hoTen;
    private String nganh;
    private double diem;

    public SinhVienTechMaster(String hoTen, String nganh, double diem) {
        this.hoTen = hoTen;
        this.nganh = nganh;
        this.diem = diem;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public String getHocLuc() {
        if (diem < 5) {
            return "Yếu";
        } else if (diem < 6.5) {
            return "Trung bình";
        } else if (diem < 7.5) {
            return "Khá";
        } else {
            return "Giỏi";
        }
    }
    public void xuat() {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Ngành: " + nganh);
        System.out.println("Điểm: " + diem);
        System.out.println("Học lực: " + getHocLuc());
    }
}
