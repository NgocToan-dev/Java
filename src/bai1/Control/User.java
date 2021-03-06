package bai1.Control;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author BlackCrystal
 */
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.*;
import java.io.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class User extends javax.swing.JFrame {

    /**
     * Creates new form User
     */
    private ArrayList<KhachHang> danhSachKhachHang;
    private ArrayList<MatHang> danhSachMatHang;
    private KhachHang themKhachHang;
    private MatHang themMatHang;
    private int maKH = 10000;
    private int maMH = 1000;
    private int maLayKH;

    File fileKH = new File("src/bai1/DataInOut/KH.txt");
    File fileMH = new File("src/bai1/DataInOut/MH.txt");
    File fileQL = new File("src/bai1/DataInOut/QLBH.txt");
    IOFile ioKH = new IOFile(fileKH);
    IOFile ioMH = new IOFile(fileMH);

    DefaultTableModel tableModelMH;
    DefaultTableModel tableModelKH;
    DefaultTableModel gioHangTableModel;

    private TreeMap<String, ArrayList<String[]>> sapXepTheoTen;
    private TreeMap<String, ArrayList<String[]>> sapXepTheoHang;
    KhachHang.DanhSachMatHang gioHang;

    public User() {

        if (ioKH.getMa() != 0) {
            maKH = ioKH.getMa() + 1;
        }
        if (ioMH.getMa() != 0) {
            maMH = ioMH.getMa() + 1;
        }

        initComponents();

        danhSachKhachHang = new ArrayList<>();
        danhSachMatHang = new ArrayList<>();
        dssx = new ArrayList<>();
        gioHang = new KhachHang().new DanhSachMatHang();
        tableModelMH = (DefaultTableModel) matHangTable.getModel();
        ArrayList<String[]> tmp = ioMH.readFromFile();
        tmp.forEach(kh -> {
            MatHang mhtmp = new MatHang(Integer.parseInt(kh[0]), kh[1], kh[2], Double.parseDouble(kh[3]));
            danhSachMatHang.add(mhtmp);
        });
        tmp.forEach(mh -> {
            tableModelMH.addRow(mh);
            chonSPComboBox.addItem(mh[1]);
        });
        tableModelKH = (DefaultTableModel) khachHangTable.getModel();
        ArrayList<String[]> tmp1 = ioKH.readFromFile();
        tmp1.forEach(kh -> {
            tableModelKH.addRow(kh);
            KhachHang khtmp = new KhachHang(Integer.parseInt(kh[0]), kh[1], kh[2], kh[3]);
            danhSachKhachHang.add(khtmp);
        });

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hoaDonFrame = new javax.swing.JFrame();
        jPanel24 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        hoaDonTen = new javax.swing.JLabel();
        hoaDonDC = new javax.swing.JLabel();
        hoaDonSDT = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        hoaDonTable = new javax.swing.JTable();
        jPanel26 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        tongTien = new javax.swing.JLabel();
        sortByName = new javax.swing.JFrame();
        jScrollPane4 = new javax.swing.JScrollPane();
        sortNameTable = new javax.swing.JTable();
        sortByProduct = new javax.swing.JFrame();
        jScrollPane6 = new javax.swing.JScrollPane();
        sortProductTable = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tenHangText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nhomHangText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        giaBanText = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        statusMHLabel = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        saveMHButton = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        matHangTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        tenKHText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        diaChiKHText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        sdtKHText = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        statusKHLabel = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        saveKHButton = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        khachHangTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        quanLyTen = new javax.swing.JTextField();
        nameInListLabel = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        chonSPComboBox = new javax.swing.JComboBox<>();
        chonSoLuong = new javax.swing.JSpinner();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        matHangDuocChonTable = new javax.swing.JTable();
        jPanel18 = new javax.swing.JPanel();
        themVaoGio = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        hoaDon = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        sortByCustomerName = new javax.swing.JButton();
        sortByProductName = new javax.swing.JButton();

        hoaDonFrame.setResizable(false);
        hoaDonFrame.setSize(new java.awt.Dimension(500, 500));
        hoaDonFrame.getContentPane().setLayout(new java.awt.GridLayout(3, 1));

        jLabel13.setText("Hóa đơn");

        jLabel14.setText("Tên khách hàng");

        jLabel15.setText("Địa chỉ");

        jLabel17.setText("Số điện thoại");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(hoaDonDC))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hoaDonSDT))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                        .addComponent(hoaDonTen))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(75, 75, 75))
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(hoaDonTen))
                .addGap(18, 18, 18)
                .addComponent(hoaDonDC)
                .addGap(13, 13, 13)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(hoaDonSDT))
                .addContainerGap())
        );

        hoaDonFrame.getContentPane().add(jPanel24);

        jPanel25.setLayout(new java.awt.GridLayout(1, 1));

        hoaDonTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên mặt hàng", "Số lượng", "Giá tiền"
            }
        ));
        jScrollPane5.setViewportView(hoaDonTable);

        jPanel25.add(jScrollPane5);

        hoaDonFrame.getContentPane().add(jPanel25);

        jLabel18.setText("Tổng tiền");

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 184, Short.MAX_VALUE)
                .addComponent(tongTien)
                .addGap(82, 82, 82))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tongTien)
                    .addComponent(jLabel18))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        hoaDonFrame.getContentPane().add(jPanel26);

        sortByName.getContentPane().setLayout(new java.awt.GridLayout(1, 1));

        sortNameTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên khách hàng", "Sản phẩm", "Số lượng"
            }
        ));
        jScrollPane4.setViewportView(sortNameTable);

        sortByName.getContentPane().add(jScrollPane4);

        sortByProduct.getContentPane().setLayout(new java.awt.GridLayout(1, 1));

        sortProductTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sản phẩm", "Tên khách hàng", "Số lượng"
            }
        ));
        jScrollPane6.setViewportView(sortProductTable);

        sortByProduct.getContentPane().add(jScrollPane6);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 500));
        setPreferredSize(new java.awt.Dimension(500, 500));
        setResizable(false);
        setSize(500,500);

        jPanel1.setLayout(new java.awt.GridLayout(3, 1));

        jPanel4.setLayout(new java.awt.GridLayout(3, 2));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tên hàng");
        jPanel4.add(jLabel1);
        jPanel4.add(tenHangText);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nhóm hàng");
        jPanel4.add(jLabel2);
        jPanel4.add(nhomHangText);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Giá bán");
        jPanel4.add(jLabel3);

        giaBanText.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel4.add(giaBanText);

        jPanel1.add(jPanel4);

        jPanel5.setLayout(new java.awt.GridLayout(2, 1));

        statusMHLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel5.add(statusMHLabel);

        saveMHButton.setText("Thêm vào danh sách");
        saveMHButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMHButtonActionPerformed(evt);
            }
        });
        jPanel7.add(saveMHButton);

        jPanel5.add(jPanel7);

        jPanel1.add(jPanel5);

        jPanel6.setLayout(new java.awt.GridLayout(1, 1));

        matHangTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã mặt hàng", "Tên hàng", "Nhóm hàng", "Giá bán"
            }
        ));
        jScrollPane2.setViewportView(matHangTable);

        jPanel6.add(jScrollPane2);

        jPanel1.add(jPanel6);

        jTabbedPane1.addTab("Mặt hàng", jPanel1);

        jPanel2.setLayout(new java.awt.GridLayout(3, 1));

        jPanel8.setLayout(new java.awt.GridLayout(3, 2));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Họ và tên");
        jPanel8.add(jLabel5);
        jPanel8.add(tenKHText);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Địa chỉ");
        jPanel8.add(jLabel6);
        jPanel8.add(diaChiKHText);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Số điện thoại");
        jPanel8.add(jLabel7);
        jPanel8.add(sdtKHText);

        jPanel2.add(jPanel8);

        jPanel9.setLayout(new java.awt.GridLayout(2, 1));

        jPanel12.add(statusKHLabel);

        jPanel9.add(jPanel12);

        saveKHButton.setText("Thêm khách hàng và dạnh sách");
        saveKHButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveKHButtonActionPerformed(evt);
            }
        });
        jPanel11.add(saveKHButton);

        jPanel9.add(jPanel11);

        jPanel2.add(jPanel9);

        jPanel10.setLayout(new java.awt.BorderLayout());

        khachHangTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã khách hàng", "Họ và tên", "Địa chỉ", "Số điện thoại"
            }
        ));
        jScrollPane1.setViewportView(khachHangTable);

        jPanel10.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel10);

        jTabbedPane1.addTab("Khách hàng", jPanel2);

        jPanel3.setLayout(new java.awt.GridLayout(3, 1));

        jPanel13.setLayout(new java.awt.GridLayout(2, 1));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Tên khách hàng");
        jPanel16.add(jLabel9);

        quanLyTen.setColumns(10);
        jPanel16.add(quanLyTen);
        jPanel16.add(nameInListLabel);

        jPanel13.add(jPanel16);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Chọn sản phẩm");
        jPanel17.add(jLabel11);

        jPanel17.add(chonSPComboBox);

        chonSoLuong.setMinimumSize(new java.awt.Dimension(40, 20));
        chonSoLuong.setPreferredSize(new java.awt.Dimension(70, 30));
        jPanel17.add(chonSoLuong);

        jPanel13.add(jPanel17);

        jPanel3.add(jPanel13);

        jPanel15.setLayout(new java.awt.BorderLayout());

        matHangDuocChonTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên hàng", "Số lượng"
            }
        ));
        jScrollPane3.setViewportView(matHangDuocChonTable);

        jPanel15.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        themVaoGio.setText("Thêm vào giỏ");
        themVaoGio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themVaoGioActionPerformed(evt);
            }
        });
        jPanel18.add(themVaoGio);

        jPanel15.add(jPanel18, java.awt.BorderLayout.PAGE_START);

        jPanel3.add(jPanel15);

        jPanel14.setLayout(new java.awt.GridLayout(2, 1));

        hoaDon.setText("Thanh toán");
        hoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hoaDonActionPerformed(evt);
            }
        });
        jPanel19.add(hoaDon);

        jPanel14.add(jPanel19);

        sortByCustomerName.setText("Danh sách sắp xếp theo tên khách");
        sortByCustomerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortByCustomerNameActionPerformed(evt);
            }
        });
        jPanel20.add(sortByCustomerName);

        sortByProductName.setText("Danh sách sắp xếp theo tên hàng");
        sortByProductName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortByProductNameActionPerformed(evt);
            }
        });
        jPanel20.add(sortByProductName);

        jPanel14.add(jPanel20);

        jPanel3.add(jPanel14);

        jTabbedPane1.addTab("Quản lý bán hàng", jPanel3);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveKHButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveKHButtonActionPerformed
        // TODO add your handling code here:
        themKhachHang = new KhachHang(maKH, tenKHText.getText(), diaChiKHText.getText(), sdtKHText.getText());
        String ex = themKhachHang.getException();
        if (ex.length() != 0) {
            statusKHLabel.setText(ex);
        } else {
            statusKHLabel.setText("Succeed");
            ioKH.writeToFile(String.format("%s", maKH), themKhachHang.getHoTen(), themKhachHang.getDiaChi(), themKhachHang.getSdt());
            String[] data = {String.format("%s", maKH), themKhachHang.getHoTen(), themKhachHang.getDiaChi(), themKhachHang.getSdt()};
            tableModelKH.addRow(data);
            maKH++;
            danhSachKhachHang.add(themKhachHang);
        }
    }//GEN-LAST:event_saveKHButtonActionPerformed

    private void saveMHButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMHButtonActionPerformed
        // TODO add your handling code here:
        themMatHang = new MatHang(maMH, tenHangText.getText(), nhomHangText.getText(), Double.parseDouble(giaBanText.getText() + "0"));
        String ex = themMatHang.getException();
        if (ex.length() != 0) {
            statusMHLabel.setText(ex);
        } else {
            statusMHLabel.setText("Succeed");
            ioMH.writeToFile(String.format("%s", maMH), themMatHang.getTenMH(), themMatHang.getNhomMH(), giaBanText.getText());
            String[] data = {String.format("%s", maMH), themMatHang.getTenMH(), themMatHang.getNhomMH(), giaBanText.getText()};
            tableModelMH.addRow(data);
            chonSPComboBox.addItem(themMatHang.getTenMH());
            maMH++;
            danhSachMatHang.add(themMatHang);
        }
    }//GEN-LAST:event_saveMHButtonActionPerformed

    private void themVaoGioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themVaoGioActionPerformed
        // TODO add your handling code here:
        gioHangTableModel = (DefaultTableModel) matHangDuocChonTable.getModel();
        try {
            CheckException ce = new CheckException();
            boolean check = false;
            for (KhachHang kh : danhSachKhachHang) {
                if (kh.getHoTen().equals(quanLyTen.getText())) {
                    check = true;
                    maLayKH = kh.getMaKH();
                }
            }
            if (check == false) {
                throw ce.new CheckNameInList();
            }
            String tmp = chonSPComboBox.getItemAt(chonSPComboBox.getSelectedIndex());
            gioHang.themSanPham(tmp, (Integer) chonSoLuong.getValue());
            for (int i = 0; i < gioHangTableModel.getRowCount(); i++) {
                if (gioHangTableModel.getValueAt(i, 0).equals(tmp)) {
                    gioHangTableModel.setValueAt(gioHang.getDsmh().get(tmp).toString(), i, 1);
                    check = false;
                    break;
                }
            }
            if (check == true) {
                String[] data = {tmp, gioHang.getDsmh().get(tmp).toString()};
                gioHangTableModel.addRow(data);
            }
        } catch (CheckException.CheckNameInList e) {
            nameInListLabel.setText(e.getMessage());
        }
    }//GEN-LAST:event_themVaoGioActionPerformed

    private void hoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hoaDonActionPerformed
        // TODO add your handling code here:
        double tongGia = 0;
        double gia = 0;
        ArrayList<String[]> hoaDon = new ArrayList<>();
        ArrayList<String[]> temp = new ArrayList<>();
        int k = 0;
        try ( FileWriter fw = new FileWriter(fileQL, true)) {
            fw.write(quanLyTen.getText() + "\n");
            for (int i = 0; i < gioHangTableModel.getRowCount(); i++) {
                String s = gioHangTableModel.getValueAt(i, 0).toString();
                double n = Double.parseDouble(gioHangTableModel.getValueAt(i, 1).toString());
                fw.write(s + "\n");
                fw.write(gioHangTableModel.getValueAt(i, 1).toString() + "\n");
                for (MatHang mh : danhSachMatHang) {
                    if (mh.getTenMH().equals(s)) {
                        gia = mh.getGiaMH() * n;
                        tongGia += gia;
                    }
                }
                String[] str = {s, String.format("%s", n), String.format("%s", gia)};
                hoaDon.add(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (KhachHang kh : danhSachKhachHang) {
            if (kh.getMaKH() == maLayKH) {
                hoaDonTen.setText(kh.getHoTen());
                hoaDonDC.setText(kh.getDiaChi());
                hoaDonSDT.setText(kh.getSdt());
            }
        }

        DefaultTableModel tb = (DefaultTableModel) hoaDonTable.getModel();
        for (String[] s : hoaDon) {
            tb.addRow(s);
        }
        tongTien.setText(String.format("%s", tongGia));
        hoaDonFrame.setSize(500, 500);
        hoaDonFrame.setVisible(true);
        hoaDonFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_hoaDonActionPerformed
    private ArrayList<String[]> dssx;
    private void sortByCustomerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortByCustomerNameActionPerformed
        // TODO add your handling code here:
        String customerName = new String("");
        ArrayList<String> nameList = new ArrayList<>();
        for (KhachHang kh : danhSachKhachHang) {
            nameList.add(kh.getHoTen());
        }
        
        try ( Scanner sc = new Scanner(fileQL)) {
            String name = "";
            while (sc.hasNext()) {
                String s = sc.nextLine();
                String s2 = "", s3 = "";
                if (nameList.contains(s)) {
                    name = s;
                    s2 = sc.nextLine();
                    s3 = sc.nextLine();
                } else {
                    s2 = s;
                    s3 = sc.nextLine();
                }
                String[] row = {name, s2, s3};
                dssx.add(row);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Collections.sort(dssx, (String[] o1, String[] o2) -> o1[0].compareTo(o2[0]));

        DefaultTableModel temp = (DefaultTableModel) sortNameTable.getModel();
        dssx.forEach(s -> {
            temp.addRow(s);
        });
        sortByName.setVisible(true);
        sortByName.setSize(500, 500);
        sortByName.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_sortByCustomerNameActionPerformed

    private void sortByProductNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortByProductNameActionPerformed
        // TODO add your handling code here:
        Collections.sort(dssx, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return o1[1].compareTo(o2[1]);
            }
        });

        DefaultTableModel temp = (DefaultTableModel) sortProductTable.getModel();
        for (String[] s : dssx) {
            temp.addRow(s);
        }
        sortByProduct.setVisible(true);
        sortByProduct.setSize(500, 500);
        sortByProduct.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_sortByProductNameActionPerformed

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
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> chonSPComboBox;
    private javax.swing.JSpinner chonSoLuong;
    private javax.swing.JTextField diaChiKHText;
    private javax.swing.JTextField giaBanText;
    private javax.swing.JButton hoaDon;
    private javax.swing.JLabel hoaDonDC;
    private javax.swing.JFrame hoaDonFrame;
    private javax.swing.JLabel hoaDonSDT;
    private javax.swing.JTable hoaDonTable;
    private javax.swing.JLabel hoaDonTen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private static javax.swing.JTable khachHangTable;
    private javax.swing.JTable matHangDuocChonTable;
    private static javax.swing.JTable matHangTable;
    private javax.swing.JLabel nameInListLabel;
    private javax.swing.JTextField nhomHangText;
    private javax.swing.JTextField quanLyTen;
    private javax.swing.JButton saveKHButton;
    private javax.swing.JButton saveMHButton;
    private javax.swing.JTextField sdtKHText;
    private javax.swing.JButton sortByCustomerName;
    private javax.swing.JFrame sortByName;
    private javax.swing.JFrame sortByProduct;
    private javax.swing.JButton sortByProductName;
    private javax.swing.JTable sortNameTable;
    private javax.swing.JTable sortProductTable;
    private javax.swing.JLabel statusKHLabel;
    private javax.swing.JLabel statusMHLabel;
    private javax.swing.JTextField tenHangText;
    private javax.swing.JTextField tenKHText;
    private javax.swing.JButton themVaoGio;
    private javax.swing.JLabel tongTien;
    // End of variables declaration//GEN-END:variables

}
