/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;
import Models.NhanVien;
import java.sql.*;
import java.util.ArrayList;
import utils.DbConnection;
/**
 *
 * @author Admin
 */
public class NhanVienRepository {
        private Connection conn;
    
    public NhanVienRepository() {
        conn = DbConnection.getConnection();
    }
    
public ArrayList<NhanVien> search(String kyword) {
        String SQL = "SELECT * FROM NhanVien";
        if(kyword.trim().length() !=0){
            SQL += " WHERE MaNhanVien LIKE ? OR Ten LIKE ? ";
        }
        ArrayList<NhanVien> ds = new ArrayList<NhanVien>();
        
        try {
            PreparedStatement ps = this.conn.prepareStatement(SQL);
            if(kyword.trim().length() !=0){
                ps.setString(1, "%" + kyword + "%");
                ps.setString(2, "%" + kyword + "%");
            }
            ps.execute();
            
            ResultSet rs = ps.getResultSet();
            
            while(rs.next()) {
                String MaNhanVien = rs.getString("MaNhanVien");
                String ten = rs.getString("Ten");
                boolean GioiTinh = rs.getBoolean("GioiTinh");
                String ChucVu = rs.getString("ChucVu");
                
                ds.add(new  NhanVien(MaNhanVien, ten, GioiTinh, ChucVu));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return ds;
    }
        // Phương thức thêm nhân viên vào cơ sở dữ liệu
    public void addNhanVien(NhanVien nv) {
        String SQL = "INSERT INTO NhanVien (MaNhanVien, Ten, GioiTinh, ChucVu) VALUES (?, ?, ?, ?)";
        try{
            PreparedStatement Nv = this.conn.prepareStatement(SQL);
            Nv.setString(1, nv.getMaNhanVien());
            Nv.setString(2, nv.getTen());
            Nv.setBoolean(3, nv.isGioiTinh());
            Nv.setString(4, nv.getChucVu());
           Nv.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

public void updateNhanVien(NhanVien nv) {
    String SQL = "UPDATE NhanVien SET Ten=?, ChucVu=? WHERE MaNhanVien=?";
    try {
        PreparedStatement statement = this.conn.prepareStatement(SQL);
        statement.setString(1, nv.getTen());
        statement.setString(2, nv.getChucVu());
        statement.setString(3, nv.getMaNhanVien());
        statement.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

    // Phương thức xóa nhân viên khỏi cơ sở dữ liệu
        public void deleteNhanVien(String MaNhanVien) {
            String SQL = "DELETE FROM NhanVien WHERE MaNhanVien=?";
            try  {
                PreparedStatement nv = this.conn.prepareStatement(SQL);
                nv.setString(1, MaNhanVien);
                nv.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

 


}

