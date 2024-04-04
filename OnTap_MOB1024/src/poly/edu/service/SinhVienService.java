package poly.edu.service;

import java.sql.*;
import java.util.ArrayList;
import poly.edu.model.SinhVien;
import poly.edu.utility.DBcontext;

public class SinhVienService {

    public ArrayList<SinhVien> getAll() {
        ArrayList<SinhVien> lst = new ArrayList<>();
        try {
            String sql = "select Masv, Hoten, GioiTinh, MaNganh, DiemTB \n"
                    + "from SINHVIEN";
            Connection cn = DBcontext.getConnection();//tạo kết nối
            PreparedStatement pstm = cn.prepareStatement(sql);// tạo statement
            //resulset nhận kq Thực thi câu sql select
            ResultSet rs = pstm.executeQuery();
            //Duyệt rs => Đổ dữ liệu vào list
            while (rs.next()) {
                SinhVien sv = new SinhVien();
                sv.setMaSV(rs.getString(1));//Lấy theo thứ tự cột
                sv.setHoTen(rs.getString(2));//Bắt đầu từ 1
                sv.setGioiTinh(rs.getBoolean(3));
                sv.setMaNganh(rs.getString(4));
                sv.setDiemTB(rs.getDouble(5));
                lst.add(sv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return lst;
    }

    //Xây dựng phương thức thêm sv vào csdl
    //trả về int: số dòng thêm được
    public int addSinhVien(SinhVien sv) {
        int row = 0;
        try {
            String sql = "insert SINHVIEN(Masv, Hoten, GioiTinh, MaNganh, DiemTB)\n"
                    + "values(?,?,?,?,?)";
            Connection cn = DBcontext.getConnection();//tạo kết nối
            PreparedStatement pstm = cn.prepareStatement(sql);// tạo statement
            // gán giá trị cho các dấu ?
            pstm.setString(1, sv.getMaSV());
            pstm.setString(2, sv.getHoTen());
            pstm.setBoolean(3, sv.isGioiTinh());
            pstm.setString(4, sv.getMaNganh());
            pstm.setDouble(5, sv.getDiemTB());
            //Thực thi statement.kq trả về số nguyên là dòng thêm được
            row = pstm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return row;

    }

    //Xây dựng phương thức sửa sv trong CSDL
    //trả về int: số lượng dòng sửa được
    public int updateSinhVien(SinhVien sv) {
        int row = 0;
        try {
            String sql = "update SINHVIEN \n"
                    + "set Hoten=?, GioiTinh = ? , MaNganh=?, DiemTB =?\n"
                    + "where Masv=?";
            Connection cn = DBcontext.getConnection();//tạo kết nối
            PreparedStatement pstm = cn.prepareStatement(sql);// tạo statement
            // gán giá trị cho các dấu ?
            pstm.setString(5, sv.getMaSV());
            pstm.setString(1, sv.getHoTen());
            pstm.setBoolean(2, sv.isGioiTinh());
            pstm.setString(3, sv.getMaNganh());
            pstm.setDouble(4, sv.getDiemTB());
            //Thực thi statement.kq trả về số nguyên là dòng thêm được
            row = pstm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return row;

    }
    //Xây dựng phương thức xóa sv trong CSDL
    //trả về int: số lượng dòng xóa được
    public int deleteSinhVien(String masv) {
        int row = 0;
        try {
            String sql = "delete from SINHVIEN\n"
                    + "where Masv=?";
            Connection cn = DBcontext.getConnection();//tạo kết nối
            PreparedStatement pstm = cn.prepareStatement(sql);// tạo statement
      
            // gán giá trị cho các dấu ?
            pstm.setString(1, masv);
            row = pstm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return row;

    }
}
