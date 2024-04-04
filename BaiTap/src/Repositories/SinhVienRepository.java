/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import Models.SinhVien;
import java.sql.*;
import java.sql.ResultSet;
import java.util.ArrayList;
import utils.DbConnection;

/**
 *
 * @author Admin
 */
public class SinhVienRepository {

        private Connection conn;
    
    public SinhVienRepository() {
        conn = DbConnection.getConnection();
    }
    
public ArrayList<SinhVien> search() {
        String SQL = "SELECT * FROM SinhVien";
        
        ArrayList<SinhVien> ds = new ArrayList<SinhVien>();
        
        try {
            PreparedStatement ps = this.conn.prepareStatement(SQL);
            ps.execute();
            
            ResultSet rs = ps.getResultSet();
            
            while(rs.next()) {
                String maNhanVien = rs.getString("MASV");
                String ten = rs.getString("Ten");
                int diem= rs.getInt("Diem");
               
                
                ds.add(new  SinhVien(ten, ten, diem));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return ds;
    }
}
