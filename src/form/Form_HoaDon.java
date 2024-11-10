/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package form;

import Model.Model_HoaDon;
import Repository.Repository_HoaDon;
import java.awt.HeadlessException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import jdk.jfr.consumer.EventStream;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author macbook
 */
public class Form_HoaDon extends javax.swing.JPanel {

    private Repository.Repository_HoaDon repo_HD = new Repository_HoaDon();
    private DefaultTableModel model = new DefaultTableModel();
    private int index = -1;

    public Form_HoaDon() {
        initComponents();
        fillTable(repo_HD.getAll());
    }

    void fillTable(ArrayList<Model.Model_HoaDon> list) {
        model = (DefaultTableModel) tbl_DSHD.getModel();
        model.setRowCount(0);
        for (Model_HoaDon model_HoaDon : list) {
            model.addRow(model_HoaDon.ToDataRow());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Header = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        lbl_MaNV = new javax.swing.JLabel();
        lbl_Gio = new javax.swing.JLabel();
        lbl_Ngay = new javax.swing.JLabel();
        Body = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_DSHD = new javax.swing.JTable();
        rdo_tatca = new javax.swing.JRadioButton();
        rdo_chothanhtoan = new javax.swing.JRadioButton();
        rdo_dathanhtoan = new javax.swing.JRadioButton();
        btn_timKiem_HD = new javax.swing.JButton();
        txt_search = new javax.swing.JTextField();
        btn_xuatExcel = new javax.swing.JButton();
        btn_huyHD = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_hoadonChiTiet = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        Header.setBackground(new java.awt.Color(153, 204, 255));
        Header.setForeground(new java.awt.Color(153, 204, 255));
        Header.setPreferredSize(new java.awt.Dimension(1000, 60));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/User.png"))); // NOI18N

        lbl_MaNV.setText("admin");

        lbl_Gio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_Gio.setText("19:01:02");

        lbl_Ngay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_Ngay.setText("19:01:02");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lbl_Gio)
                .addGap(26, 26, 26)
                .addComponent(lbl_Ngay)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 724, Short.MAX_VALUE)
                .addComponent(lbl_MaNV)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addGap(36, 36, 36))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_MaNV)
                        .addComponent(lbl_Gio)
                        .addComponent(lbl_Ngay))
                    .addComponent(jLabel15))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        add(Header, java.awt.BorderLayout.PAGE_START);

        Body.setPreferredSize(new java.awt.Dimension(1001, 700));
        Body.setLayout(new java.awt.BorderLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh Sách Hóa Đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(813, 340));

        tbl_DSHD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã HD", "Mã KH", "Tên KH", "SĐT", "Id_NV", "Ngày thanh toán", "Tổng tiền BĐ", "Tổng tiền KM", "Mã Voucher", "Tổng tiền sau KM", "Trạng thái"
            }
        ));
        tbl_DSHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_DSHDMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_DSHD);

        buttonGroup1.add(rdo_tatca);
        rdo_tatca.setSelected(true);
        rdo_tatca.setText("Tất cả");
        rdo_tatca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdo_tatcaActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdo_chothanhtoan);
        rdo_chothanhtoan.setText("Chờ thanh toán");
        rdo_chothanhtoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdo_chothanhtoanActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdo_dathanhtoan);
        rdo_dathanhtoan.setText("Đã thanh toán");
        rdo_dathanhtoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdo_dathanhtoanActionPerformed(evt);
            }
        });

        btn_timKiem_HD.setBackground(new java.awt.Color(51, 153, 255));
        btn_timKiem_HD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_timKiem_HD.setText("Search");

        txt_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_searchActionPerformed(evt);
            }
        });

        btn_xuatExcel.setBackground(new java.awt.Color(102, 255, 102));
        btn_xuatExcel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_xuatExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-excel-48.png"))); // NOI18N
        btn_xuatExcel.setText("Xuất Excel");
        btn_xuatExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xuatExcelActionPerformed(evt);
            }
        });

        btn_huyHD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_huyHD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Delete.png"))); // NOI18N
        btn_huyHD.setText("Hủy Hóa Đơn");
        btn_huyHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_huyHDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btn_timKiem_HD, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                        .addComponent(btn_xuatExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btn_huyHD)
                        .addGap(27, 27, 27)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rdo_tatca)
                .addGap(105, 105, 105)
                .addComponent(rdo_chothanhtoan)
                .addGap(100, 100, 100)
                .addComponent(rdo_dathanhtoan)
                .addGap(67, 67, 67))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdo_chothanhtoan)
                            .addComponent(rdo_tatca)
                            .addComponent(rdo_dathanhtoan)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(btn_huyHD, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn_timKiem_HD)
                                .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_xuatExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                .addContainerGap())
        );

        Body.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hóa Đơn Chi Tiết", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        tbl_hoadonChiTiet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã HDCT", "Mã HD", "Mã Sản Phẩm", "Imei", "Đơn giá", "Số lượng"
            }
        ));
        jScrollPane2.setViewportView(tbl_hoadonChiTiet);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                .addContainerGap())
        );

        Body.add(jPanel2, java.awt.BorderLayout.CENTER);

        add(Body, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchActionPerformed

    private void rdo_tatcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo_tatcaActionPerformed
        // TODO add your handling code here:
        fillTable(repo_HD.getAll());
    }//GEN-LAST:event_rdo_tatcaActionPerformed

    private void rdo_chothanhtoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo_chothanhtoanActionPerformed
        // TODO add your handling code here:
        fillTable(repo_HD.loc(false));
    }//GEN-LAST:event_rdo_chothanhtoanActionPerformed

    private void rdo_dathanhtoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo_dathanhtoanActionPerformed
        // TODO add your handling code here:
        fillTable(repo_HD.loc(true));
    }//GEN-LAST:event_rdo_dathanhtoanActionPerformed

    private void btn_huyHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_huyHDActionPerformed
        // TODO add your handling code here:
        if (rdo_chothanhtoan.isSelected()) {
            if (index < 0) {
                JOptionPane.showMessageDialog(this, "Ban chua chon dong de xoa");
                return;
            } else {
                int chon = JOptionPane.showConfirmDialog(this, "Ban muon xoa khong");
                if (chon == 0) {
                    String ma_xoa = tbl_DSHD.getValueAt(index, 0).toString();
                    repo_HD.xoa(ma_xoa, false);
                    fillTable(repo_HD.loc(false));
                } else {
                    JOptionPane.showMessageDialog(this, "Khong xoa");
                }
            }
        }
    }//GEN-LAST:event_btn_huyHDActionPerformed

    private void tbl_DSHDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_DSHDMouseClicked
        // TODO add your handling code here:
        index = tbl_DSHD.getSelectedRow();
    }//GEN-LAST:event_tbl_DSHDMouseClicked

    private void btn_xuatExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xuatExcelActionPerformed
        // Ask the user to confirm if they want to export the file
        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có muốn xuất file không?", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }

        try {
            String path = "";
            JFileChooser jFileChooser = new JFileChooser(path);
            jFileChooser.showSaveDialog(this);
            File saveFile = jFileChooser.getSelectedFile();

            if (saveFile != null) {
                // Ensure file has .xlsx extension
                if (!saveFile.toString().endsWith(".xlsx")) {
                    saveFile = new File(saveFile.toString() + ".xlsx");
                }

                Workbook wb = new XSSFWorkbook();
                Sheet sheet = (Sheet) wb.createSheet("Account");

                // Write column headers
                Row rowCol = sheet.createRow(0);
                for (int i = 0; i < tbl_DSHD.getColumnCount(); i++) {
                    Cell cell = rowCol.createCell(i);
                    cell.setCellValue(tbl_DSHD.getColumnName(i));
                }

                // Write table data
                for (int j = 0; j < tbl_DSHD.getRowCount(); j++) {
                    Row row = sheet.createRow(j + 1);
                    for (int k = 0; k < tbl_DSHD.getColumnCount(); k++) {
                        Cell cell = row.createCell(k);
                        if (tbl_DSHD.getValueAt(j, k) != null) {
                            cell.setCellValue(tbl_DSHD.getValueAt(j, k).toString());
                        }
                    }
                }

                // Save the file
                try (FileOutputStream out = new FileOutputStream(saveFile)) {
                    wb.write(out);
                }
                wb.close();

                // Show success message
                JOptionPane.showMessageDialog(this, "Lưu file thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);

                // Open the file after saving successfully
                EventStream.openFile(saveFile.toPath());
            }
        } catch (HeadlessException | IOException e) {
            // Show error message if there's an issue saving the file
            JOptionPane.showMessageDialog(this, "Đã có lỗi xảy ra khi lưu file!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }

    }//GEN-LAST:event_btn_xuatExcelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Body;
    private javax.swing.JPanel Header;
    private javax.swing.JButton btn_huyHD;
    private javax.swing.JButton btn_timKiem_HD;
    private javax.swing.JButton btn_xuatExcel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_Gio;
    private javax.swing.JLabel lbl_MaNV;
    private javax.swing.JLabel lbl_Ngay;
    private javax.swing.JRadioButton rdo_chothanhtoan;
    private javax.swing.JRadioButton rdo_dathanhtoan;
    private javax.swing.JRadioButton rdo_tatca;
    private javax.swing.JTable tbl_DSHD;
    private javax.swing.JTable tbl_hoadonChiTiet;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}
