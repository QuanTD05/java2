
package lab02;

public class SinhVien {

    static void add(SinhVien sv) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    String ten;
    Double diem;
    String khoaHoc;
    String xepLoai;
    boolean thuong;

    public SinhVien() {
    }

    public SinhVien(String ten, Double diem, String khoaHoc, String xepLoai, boolean thuong) {
        this.ten = ten;
        this.diem = diem;
        this.khoaHoc = khoaHoc;
        this.xepLoai = xepLoai;
        this.thuong = thuong;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Double getDiem() {
        return diem;
    }

    public void setDiem(Double diem) {
        this.diem = diem;
    }

    public String getKhoaHoc() {
        return khoaHoc;
    }

    public void setKhoaHoc(String khoaHoc) {
        this.khoaHoc = khoaHoc;
    }

    public String getXepLoai() {
        return xepLoai;
    }

    public void setXepLoai(String xepLoai) {
        this.xepLoai = xepLoai;
    }

    public boolean isThuong() {
        return thuong;
    }

    public void setThuong(boolean thuong) {
        this.thuong = thuong;
    }


    
public String XepLoai(){
    if(this.diem < 3){
        return "kém";
    }
        if(this.diem < 5){
        return "Yếu";
    }
            if(this.diem < 6.5){
        return "Trung Bình";
    }
                if(this.diem < 7.5){
        return "Khá";
    }    if(this.diem < 9){
        return "Giỏi";
    }
    return "Xuất sắc";
}
public boolean Thuong(){
    return this.diem >=7.5;
}

    
}
