/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package poly.edu.view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import poly.edu.model.SinhVien;
import poly.edu.service.SinhVienService;

public class ViewSinhVien extends javax.swing.JFrame {

    SinhVienService svs = new SinhVienService();
    //Khai báo model để quản lý dữ liệu của bảng
    DefaultTableModel model = new DefaultTableModel();
    int index;// để quản lý vị trí/dòng đang đứng

    public ViewSinhVien() {

        initComponents();
        setLocationRelativeTo(null);
        //cho model quản lý dữ liệu của bảng
        model = (DefaultTableModel) tblSinhVien.getModel();
        fillToTable();//duyệt list => đổ dữ liệu vào bảng

        //Nếu có dữ liệu thì hiển thị phần tử đầu tiên lên form
        if (tblSinhVien.getRowCount() > 0) {
            index = 0;
            showDetail();//Hiển thị phần tử đang đứng lên form

        }
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtHoTen = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMaSV = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDiemTB = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cboMaNganh = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSinhVien = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUẢN LÝ SINH VIÊN");

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jLabel3.setText("Họ tên");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ SINH VIÊN");

        jLabel2.setText("Mã sinh viên");

        jLabel4.setText("Điểm TB");

        txtDiemTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiemTBActionPerformed(evt);
            }
        });

        jLabel5.setText("Mã Ngành");

        cboMaNganh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "K12.3-DIG", "K12.3-MA", "K12.3-MOB", "K12.3-MUL", "K12.3-UD", "K13.1-DIG", "K13.1-MOB", "K13.1-MA", "K13.1-UD", "K13.1-MUL" }));

        tblSinhVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã SV", "Họ tên", "Giới tính", "Mã ngành", "Điểm TB"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSinhVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSinhVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSinhVien);

        jLabel6.setText("Giới tính");

        rdoNam.setText("Nam");

        rdoNu.setText("Nữ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(rdoNam, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdoNu, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtDiemTB, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(cboMaNganh, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(32, 32, 32)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnClear)
                            .addComponent(btnSua)
                            .addComponent(btnThem)
                            .addComponent(btnXoa))
                        .addGap(67, 67, 67))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnClear, btnSua, btnThem, btnXoa});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cboMaNganh, txtDiemTB, txtHoTen, txtMaSV});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnThem)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(21, 21, 21))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSua)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnXoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdoNam)
                            .addComponent(rdoNu)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cboMaNganh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiemTB, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cboMaNganh, txtDiemTB, txtHoTen, txtMaSV});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clear();

    }//GEN-LAST:event_btnClearActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // Copy phần check form.
        //*chú ý :Không check trùng masv
        
         SinhVien sv = readFrom();
        if (svs.updateSinhVien(sv) > 0) {
            JOptionPane.showMessageDialog(this, "Sửa thành công");
            //Xử lý sau khi thêm
            fillToTable();
        }else{
           JOptionPane.showMessageDialog(this, "Không sửa được dòng nào"); 
        }
            
    }//GEN-LAST:event_btnSuaActionPerformed

    private void txtDiemTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiemTBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiemTBActionPerformed

    private void tblSinhVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSinhVienMouseClicked
        // TODO add your handling code here:
        index = tblSinhVien.getSelectedRow();
        showDetail();
    }//GEN-LAST:event_tblSinhVienMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // check form

        // check rỗng
        if (txtMaSV.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập masv");
            return;// Dùng , không đi tiếp
        }
        //  Tương tự check rỗng hoten, diemTB
        // check là số
        try {
            double diem = Double.parseDouble(txtDiemTB.getText());

            // check miền điểm 0-10
            if (diem < 0 || diem > 10) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập điểm 0-10");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập điểm là số");
            return;
        }
        // check trùng
//        JOptionPane.showMessageDialog(this, "check OK");
        //....

        SinhVien sv = readFrom();
        if (svs.addSinhVien(sv) > 0) {
            JOptionPane.showMessageDialog(this, "Thêm thành công");
            //Xử lý sau khi thêm
            fillToTable();
        }else{
           JOptionPane.showMessageDialog(this, "Không thêm được dòng nào"); 
        }
            
    

    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        //hỏi xóa
        int hoi = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa không?");
        if (hoi!=JOptionPane.YES_OPTION) {
            return;
        }
           
        if (svs.deleteSinhVien(txtMaSV.getText()) > 0) {
            JOptionPane.showMessageDialog(this, "Xóa thành công!!!!");
            //Xử lý sau khi thêm
            fillToTable();
            //  Kiểm tra nếu còn dữ liệu thì hiển thị phần tử đầu tiên
            if (tblSinhVien.getRowCount() > 0) {
                index = 0;
                showDetail();
                
            }else {
                clear();
            }
        }else{
           JOptionPane.showMessageDialog(this, "Không xóa được dòng nào"); 
        }
            
    
    }//GEN-LAST:event_btnXoaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewSinhVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cboMaNganh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTable tblSinhVien;
    private javax.swing.JTextField txtDiemTB;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMaSV;
    // End of variables declaration//GEN-END:variables

    private void fillToTable() {
        model.setRowCount(0);//Xóa hết dữ liệu cũ vào table
//        ArrayList<SinhVien> lst = svs.getAll();
        for (SinhVien sv : svs.getAll()) {
            model.addRow(new Object[]{
                sv.getMaSV(),
                sv.getHoTen(),
                sv.isGioiTinh() ? "Nam" : "Nữ",
                sv.getMaNganh(),
                sv.getDiemTB()
            });
        }
    }

    private void clear() {//Xóa trắng nhập liệu
        for (SinhVien sv : svs.getAll()) {
            txtMaSV.setText("");
            txtHoTen.setText("");
            txtDiemTB.setText("");

            //Nắm chắc thì làm
            rdoNam.setSelected(true);
            cboMaNganh.setSelectedItem(0);

            index = -1;
        }
    }

    private void showDetail() {//Hiển thị phần tử\dòng đang đứng lên form
        // Lấy giá trị tại oo giao bởi dòng index, cột 0 hiển thị lên txtmasv
        txtMaSV.setText(tblSinhVien.getValueAt(index, 0).toString());
        txtHoTen.setText(tblSinhVien.getValueAt(index, 1).toString());
        String gt = tblSinhVien.getValueAt(index, 2).toString();
        rdoNam.setSelected(gt.equalsIgnoreCase("Nam") ? true : false);
        rdoNu.setSelected(!gt.equalsIgnoreCase("Nam") ? true : false);
        cboMaNganh.setSelectedItem(tblSinhVien.getValueAt(index, 3).toString());
        txtDiemTB.setText(tblSinhVien.getValueAt(index, 4).toString());
        
        //table chọn đúng dòng index <=> Ko bắt buộc
        tblSinhVien.setRowSelectionInterval(index, index);
    
    
    }
    
   //Đọc thông tiin từ trrn form => trả về SV
    private SinhVien readFrom() {
        SinhVien sv = new SinhVien();
        sv.setMaSV(txtMaSV.getText());
        sv.setHoTen(txtHoTen.getText());
        sv.setGioiTinh(rdoNam.isSelected());
        sv.setMaNganh(cboMaNganh.getSelectedItem() + "");
        sv.setDiemTB(Double.parseDouble(txtDiemTB.getText()));
        return sv;
    }
}
