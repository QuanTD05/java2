/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.model;

/**
 *
 * @author vodan
 */
public class SinhVien {
//Masv	nvarchar(10)	Unchecked
//Hoten	nvarchar(35)	Unchecked
//GioiTinh	bit	Checked
//MaNganh	nvarchar(15)	Checked
//DiemTB	float	Unchecked
//DienThoai	nvarchar(13)	Checked
//DiaChi	nvarchar(50)	Checked
//Email	nvarchar(50)	Checked
//		
    private String maSV;
    private String hoTen;
    private boolean gioiTinh;
    private String maNganh;
    private double diemTB;

    public SinhVien() {
    }

    public SinhVien(String maSV, String hoTen, boolean gioiTinh, String maNganh, double diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.maNganh = maNganh;
        this.diemTB = diemTB;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getMaNganh() {
        return maNganh;
    }

    public void setMaNganh(String maNganh) {
        this.maNganh = maNganh;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

  
    
}
