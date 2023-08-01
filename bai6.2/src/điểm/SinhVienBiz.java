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
public class SinhVienBiz extends SinhVienTechMaster{
    private double diemMarketing;
    private double diemSales;

    public SinhVienBiz(String hoTen, String nganh, double diemMarketing, double diemSales) {
        super(hoTen, nganh, 0); // Khởi tạo điểm ban đầu là 0, sẽ tính lại trong phương thức getDiem()
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    @Override
    public double getDiem() {
        return (2 * diemMarketing + diemSales) / 3;
    }
}
