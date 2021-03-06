/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.doanjava.javaswing;

import com.doanjava.DAO.ConnectSQL;
import com.doanjava.DAO.DSBanDAO;
import com.doanjava.DTO.DSBan;
import com.doanjava.SERVICE.DSBanSERVICE;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author ASUS
 */
public class QLDSBan extends javax.swing.JFrame {

    DSBan dsBan = new DSBan();
    DSBanSERVICE dsBanSERVICE = new DSBanSERVICE();
    DefaultTableModel defaultTableModel;
    
    public Connection conn = ConnectSQL.getConnection();
    /**
     * Creates new form QLyThucDon
     */
    public QLDSBan() {
        initComponents();
        dsBanSERVICE = new DSBanSERVICE();
        dsBan = new DSBan();
        Disable();
        
        defaultTableModel = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) { 
                return false;
            }
        };
        
        tableDSBan.setModel(defaultTableModel);
        defaultTableModel.addColumn("Mã bàn"); 
        defaultTableModel.addColumn("Tên bàn");
        defaultTableModel.addColumn("Trạng thái");
        
        setDataTable( dsBanSERVICE.getAllDSBan()); //để dữ liệu vào bảng
    }
    
    private void setDataTable(  List<DSBan> dsBans ){ //lấy dữ liệu cho bảng
                for(DSBan dsBan : dsBans){
            defaultTableModel.addRow(new Object[]{dsBan.getMaBan(),dsBan.getTenBan(),dsBan.getTrangThai()});
        }
    }
    
    public void Disable(){
        tfMaBan.setEnabled(false);
        tfTenBan.setEnabled(false);
        rdoTrong.setEnabled(false);
        rdoCoKhach.setEnabled(false);
        rdoDaDat.setEnabled(false);
        btnThem.setEnabled(true);
        btnLuu.setEnabled(false);
        btnXoa.setEnabled(false);
        btnSua.setEnabled(false);
    }
    
    public void Enable(){
        tfMaBan.setEnabled(true);
        tfTenBan.setEnabled(true);
        rdoTrong.setEnabled(true);
        rdoCoKhach.setEnabled(true);
        rdoDaDat.setEnabled(true);
        btnThem.setEnabled(true);
        btnLuu.setEnabled(true);
        btnXoa.setEnabled(true);
        btnSua.setEnabled(true);
    }
     
    public void Refesh(){
       defaultTableModel.setRowCount(0); //Xóa dữ liệu cũ về 0
       setDataTable( dsBanSERVICE.getAllDSBan()); // lấy dữ liệu mới
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
        jPanel2 = new javax.swing.JPanel();
        jpanelTrangChu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        panelDSBan = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        panelDoanhThu = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        panelThongTin = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        panelDatBan = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbThoat = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDSBan = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        tfMaBan = new javax.swing.JTextField();
        tfTenBan = new javax.swing.JTextField();
        rdoTrong = new javax.swing.JRadioButton();
        rdoCoKhach = new javax.swing.JRadioButton();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        rdoDaDat = new javax.swing.JRadioButton();
        btnLamMoi = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1100, 610));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpanelTrangChu.setBackground(new java.awt.Color(51, 51, 51));
        jpanelTrangChu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpanelTrangChuMouseClicked(evt);
            }
        });
        jpanelTrangChu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/doanjava/javaswing/IMG/home23px.png"))); // NOI18N
        jpanelTrangChu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 10, 30, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Trang chủ");
        jpanelTrangChu.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 110, 50));

        jPanel2.add(jpanelTrangChu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 180, 50));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/doanjava/javaswing/IMG/Menu_23px.png"))); // NOI18N
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 10, 30, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Thực đơn");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 110, 50));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 180, 50));

        panelDSBan.setBackground(new java.awt.Color(51, 51, 51));
        panelDSBan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelDSBanMouseClicked(evt);
            }
        });
        panelDSBan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/doanjava/javaswing/IMG/table_23px.png"))); // NOI18N
        panelDSBan.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 10, 30, 30));

        jLabel8.setBackground(new java.awt.Color(153, 0, 0));
        panelDSBan.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("DS Bàn");
        panelDSBan.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 110, 50));

        jLabel17.setBackground(new java.awt.Color(153, 0, 0));
        panelDSBan.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel2.setBackground(new java.awt.Color(49, 139, 130));
        jLabel2.setOpaque(true);
        panelDSBan.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jPanel2.add(panelDSBan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 180, 50));

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/doanjava/javaswing/IMG/bills_23px.png"))); // NOI18N
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 10, 30, 30));

        jLabel11.setBackground(new java.awt.Color(153, 0, 0));
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Hóa đơn");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 110, 50));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 180, 50));

        panelDoanhThu.setBackground(new java.awt.Color(51, 51, 51));
        panelDoanhThu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelDoanhThuMouseClicked(evt);
            }
        });
        panelDoanhThu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/doanjava/javaswing/IMG/Money_23px.png"))); // NOI18N
        panelDoanhThu.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 10, 30, 30));

        jLabel18.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Doanh thu");
        panelDoanhThu.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 110, 50));

        jPanel2.add(panelDoanhThu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 180, 50));

        jPanel9.setBackground(new java.awt.Color(51, 51, 51));
        jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel9MouseClicked(evt);
            }
        });
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/doanjava/javaswing/IMG/management_23px.png"))); // NOI18N
        jPanel9.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 10, 30, 30));

        jLabel21.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Nhân viên");
        jPanel9.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 110, 50));

        jPanel2.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 180, 50));

        panelThongTin.setBackground(new java.awt.Color(51, 51, 51));
        panelThongTin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelThongTinMouseClicked(evt);
            }
        });
        panelThongTin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/doanjava/javaswing/IMG/info_24px.png"))); // NOI18N
        panelThongTin.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 10, 30, 30));

        jLabel29.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Thông tin");
        panelThongTin.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 110, 50));

        jPanel2.add(panelThongTin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 180, 50));

        panelDatBan.setBackground(new java.awt.Color(51, 51, 51));
        panelDatBan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelDatBanMouseClicked(evt);
            }
        });
        panelDatBan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/doanjava/javaswing/IMG/table_23px.png"))); // NOI18N
        panelDatBan.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 10, 30, 30));

        jLabel23.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Đặt bàn");
        panelDatBan.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 110, 50));

        jPanel2.add(panelDatBan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 180, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 610));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbThoat.setBackground(new java.awt.Color(49, 139, 130));
        lbThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/doanjava/javaswing/IMG/Close_18px.png"))); // NOI18N
        lbThoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbThoatMouseClicked(evt);
            }
        });
        jPanel1.add(lbThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 20, 20));

        tableDSBan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã bàn", "Tên bàn", "Trạng thái"
            }
        ));
        tableDSBan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDSBanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableDSBan);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 127, 560, 480));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setForeground(new java.awt.Color(49, 139, 130));
        jLabel5.setText("Tên bàn:");

        jLabel20.setForeground(new java.awt.Color(49, 139, 130));
        jLabel20.setText("Mã bàn:");

        jLabel22.setForeground(new java.awt.Color(49, 139, 130));
        jLabel22.setText("Trạng thái:");

        tfMaBan.setEnabled(false);

        buttonGroup1.add(rdoTrong);
        rdoTrong.setForeground(new java.awt.Color(49, 139, 130));
        rdoTrong.setText("Trống");

        buttonGroup1.add(rdoCoKhach);
        rdoCoKhach.setForeground(new java.awt.Color(49, 139, 130));
        rdoCoKhach.setText("Có khách");

        btnThem.setForeground(new java.awt.Color(49, 139, 130));
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/doanjava/javaswing/IMG/add_28px.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setForeground(new java.awt.Color(49, 139, 130));
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/doanjava/javaswing/IMG/edit_28px.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setForeground(new java.awt.Color(49, 139, 130));
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/doanjava/javaswing/IMG/Delete_28px.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.setToolTipText("");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnLuu.setForeground(new java.awt.Color(49, 139, 130));
        btnLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/doanjava/javaswing/IMG/save_28px.png"))); // NOI18N
        btnLuu.setText("Lưu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdoDaDat);
        rdoDaDat.setForeground(new java.awt.Color(49, 139, 130));
        rdoDaDat.setText("Khách đặt");

        btnLamMoi.setForeground(new java.awt.Color(49, 139, 130));
        btnLamMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/doanjava/javaswing/IMG/reset_28px.png"))); // NOI18N
        btnLamMoi.setText("Làm mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnLuu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(rdoTrong)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdoCoKhach))
                            .addComponent(tfMaBan, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(rdoDaDat))
                            .addComponent(tfTenBan))))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLamMoi)
                .addGap(102, 102, 102))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfMaBan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfTenBan)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoTrong)
                    .addComponent(rdoCoKhach)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdoDaDat)
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnLuu))
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoa)
                    .addComponent(btnSua))
                .addGap(28, 28, 28)
                .addComponent(btnLamMoi)
                .addGap(34, 34, 34))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, 340, 480));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(49, 139, 130));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/doanjava/javaswing/IMG/coffee-table (3).png"))); // NOI18N
        jLabel13.setText(" Quản lý danh sách bàn");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 899, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(15, 15, 15))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 110));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 920, 610));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jpanelTrangChuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpanelTrangChuMouseClicked
        TrangChinh home = new TrangChinh();
        this.setVisible(false);
        home.setVisible(true);
    }//GEN-LAST:event_jpanelTrangChuMouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        QLThucDon qlmonan = new QLThucDon();
        this.setVisible(false);
        qlmonan.setVisible(true);
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jPanel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseClicked
        QLNhanVien qlnhanvien = new QLNhanVien();
        this.setVisible(false);
        qlnhanvien.setVisible(true);
    }//GEN-LAST:event_jPanel9MouseClicked

    private void lbThoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbThoatMouseClicked
        int click=JOptionPane.showConfirmDialog(null, "Bạn có muốn thoát chương trình hay không?", "Thông báo", 2);
        if(click==JOptionPane.YES_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_lbThoatMouseClicked

    private void panelDoanhThuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelDoanhThuMouseClicked
        QLDoanhThu qldoanhthu = new QLDoanhThu();
        this.setVisible(false);
        qldoanhthu.setVisible(true);
    }//GEN-LAST:event_panelDoanhThuMouseClicked

    private void panelDSBanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelDSBanMouseClicked
        QLDSBan qldatban = new QLDSBan();
        this.setVisible(false);
        qldatban.setVisible(true);
    }//GEN-LAST:event_panelDSBanMouseClicked
    
    private void tableDSBanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDSBanMouseClicked
        int click=tableDSBan.getSelectedRow();
        TableModel model=tableDSBan.getModel();

        tfMaBan.setText(model.getValueAt(click, 0).toString());
        tfTenBan.setText(model.getValueAt(click, 1).toString());
        String trangThai = model.getValueAt(click, 2).toString();
        if(trangThai.equals("Trống")){
            rdoTrong.setSelected(true);
        }else if(trangThai.equals("Khách đặt"))
        {
            rdoDaDat.setSelected(true);
        }else
            rdoCoKhach.setSelected(true);

        Disable();
        tfMaBan.setEnabled(false);
        tfTenBan.setEnabled(true);
        rdoTrong.setEnabled(true);
        rdoCoKhach.setEnabled(true);
        btnSua.setEnabled(true);
        btnXoa.setEnabled(true);
    }//GEN-LAST:event_tableDSBanMouseClicked

    private void panelThongTinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelThongTinMouseClicked
        QLThongTin thongtin = new QLThongTin();
        this.setVisible(false);
        thongtin.setVisible(true);
    }//GEN-LAST:event_panelThongTinMouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        QLHoaDon hoadon = new QLHoaDon();
        this.setVisible(false);
        hoadon.setVisible(true);
    }//GEN-LAST:event_jPanel6MouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        Enable();
        btnXoa.setEnabled(false);
        btnSua.setEnabled(false);
    }//GEN-LAST:event_btnThemActionPerformed

    private boolean kiemtraNull(){
        if(tfMaBan.getText().equals("")){
            JOptionPane.showMessageDialog(QLDSBan.this,"Bạn chưa nhập mã bàn!");
            return false;
        }
        else
        if(tfTenBan.getText().equals("")){
            JOptionPane.showMessageDialog(QLDSBan.this,"Bạn chưa nhập tên bàn!");
            return false;
        }
        else
        if(rdoTrong.isSelected()==false && rdoCoKhach.isSelected()==false && rdoDaDat.isSelected()==false){
            JOptionPane.showMessageDialog(QLDSBan.this,"Bạn chưa chọn trạng thái bàn!");
            return false;
        }else{
            return true;
        }
    }
    
    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        if(kiemtraNull()){
        dsBan.setMaBan(tfMaBan.getText());                            
        dsBan.setTenBan(tfTenBan.getText());            
        
        String trangThai;
                if(rdoTrong.isSelected()){
                    trangThai = "Trống";
                }else if(rdoDaDat.isSelected()){
                    trangThai = "Khách đặt";
                }else
                    trangThai = "Có khách";
                dsBan.setTrangThai(trangThai);
        
        dsBanSERVICE.themDSBan(dsBan);
        new QLDSBan().setVisible(true);
        this.dispose();
        Refesh();}
            JOptionPane.showMessageDialog(QLDSBan.this,"Đã thêm bàn mới thành công!^^");
    }//GEN-LAST:event_btnLuuActionPerformed

    private void panelDatBanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelDatBanMouseClicked
        QLDatBan qlmonan = new QLDatBan();
        this.setVisible(false);
        qlmonan.setVisible(true);
    }//GEN-LAST:event_panelDatBanMouseClicked

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int row = tableDSBan.getSelectedRow();
        if(row == -1){
            JOptionPane.showMessageDialog(QLDSBan.this, "Vui lòng chọn bàn cần xóa","Thông báo",JOptionPane.ERROR_MESSAGE);
        }else{
            int xacNhan = JOptionPane.showConfirmDialog(QLDSBan.this, "Bạn có chắc chắn muốn xóa không?","Thông báo",JOptionPane.YES_NO_OPTION);
            if(xacNhan == JOptionPane.YES_OPTION){
                String maBan = String.valueOf(tableDSBan.getValueAt(row, 0));
                dsBanSERVICE.xoaDSBan(maBan);
            }
        }
        Refesh();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed

        int row = tableDSBan.getSelectedRow();   
        if(row == -1){
            JOptionPane.showMessageDialog(QLDSBan.this, "Vui lòng chọn bàn cần sửa","Thông báo",JOptionPane.ERROR_MESSAGE);
        }else{
                int xacNhan = JOptionPane.showConfirmDialog(QLDSBan.this, "Bạn có chắc chắn muốn sửa không?","Thông báo",JOptionPane.YES_NO_OPTION);
            if(xacNhan == JOptionPane.YES_OPTION){
                dsBan.setTenBan(tfTenBan.getText());             
                String trangThai;
                if(rdoTrong.isSelected()){
                    trangThai = "Trống";
                }else if(rdoDaDat.isSelected()){
                    trangThai = "Khách đặt";
                }else
                    trangThai = "Có khách";
                dsBan.setTrangThai(trangThai);
                dsBan.setMaBan(tfMaBan.getText());
        
                String maBan = String.valueOf(tableDSBan.getValueAt(row, 0));
                dsBanSERVICE.suaDSBan(dsBan);
                JOptionPane.showMessageDialog(QLDSBan.this,"Đã sửa bàn thành công!^^");
                }
        }
        Refesh();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        Refesh();
    }//GEN-LAST:event_btnLamMoiActionPerformed

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
            java.util.logging.Logger.getLogger(QLDSBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLDSBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLDSBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLDSBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLDSBan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpanelTrangChu;
    private javax.swing.JLabel lbThoat;
    private javax.swing.JPanel panelDSBan;
    private javax.swing.JPanel panelDatBan;
    private javax.swing.JPanel panelDoanhThu;
    private javax.swing.JPanel panelThongTin;
    private javax.swing.JRadioButton rdoCoKhach;
    private javax.swing.JRadioButton rdoDaDat;
    private javax.swing.JRadioButton rdoTrong;
    private javax.swing.JTable tableDSBan;
    private javax.swing.JTextField tfMaBan;
    private javax.swing.JTextField tfTenBan;
    // End of variables declaration//GEN-END:variables
}
