/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Admin
 */
public class NhanVien {
    private String MaNhanVien;
    private String Ten;
    private boolean GioiTinh;
    private String ChucVu;

    public NhanVien() {
    }

    public NhanVien(String MaNhanVien, String Ten, boolean GioiTinh, String ChucVu) {
        this.MaNhanVien = MaNhanVien;
        this.Ten = Ten;
        this.GioiTinh = GioiTinh ;
        this.ChucVu = ChucVu;
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public boolean isGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getChucVu() {
        return ChucVu;
    }

    public void setChucVu(String ChucVu) {
        this.ChucVu = ChucVu;
    }





    
    
}
