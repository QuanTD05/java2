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
    
public ArrayList<NhanVien> search() {
        String SQL = "SELECT * FROM NhanVien";
        
        ArrayList<NhanVien> ds = new ArrayList<NhanVien>();
        
        try {
            PreparedStatement ps = this.conn.prepareStatement(SQL);
            ps.execute();
            
            ResultSet rs = ps.getResultSet();
            
            while(rs.next()) {
                String maNhanVien = rs.getString("MANhanVien");
                String ten = rs.getString("Ten");
                int tuoi = rs.getInt("Tuoi");
                String diaChi = rs.getString("DiaChi");
                
                ds.add(new  NhanVien(maNhanVien, ten, tuoi, diaChi));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return ds;
    }
    public void update(NhanVien nv) {
        String SQL = "UPDATE NhanVien SET Ten = ?, Tuoi = ? WHERE MaNhanVien = ? DiaChi = ?";
        try {
            PreparedStatement ps = this.conn.prepareStatement(SQL);
            ps.setString(1, nv.getTen());
            ps.setString(3,nv.getMaNhanVien());
            ps.setString(4, nv.getDiaChi());
            ps.setInt(2, nv.getTuoi());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

       public void create(NhanVien sv) {
        String SQL = "INSERT INTO SinhVien (MaNhanVien, Ten, Tuoi, DiaChi) VALUES (?, ?, ?, ?)";
        
        try {
            PreparedStatement ps = this.conn.prepareStatement(SQL);
            ps.setString(1, sv.getMaNhanVien());
            ps.setString(2, sv.getTen());
            ps.setInt(3, sv.getTuoi());
            ps.setString(4, sv.getDiaChi());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

