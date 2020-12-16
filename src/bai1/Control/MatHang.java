/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1.Control;

import java.util.HashMap;

/**
 *
 * @author BlackCrystal
 */
public class MatHang {

    private int maMH;
    private String tenMH;
    private String nhomMH;
    private double giaMH;
    private String ex;

    public MatHang(int maMH, String tenMH, String nhomMH, double giaMH) {
        try {
            CheckException ce = new CheckException();
            if (tenMH.length() == 0) {
                throw ce.new KhongDeTrong("Tên mặt hàng");
            }
            if (!nhomMH.equals("Hàng thời trang") && !nhomMH.equals("Hàng tiêu dùng") && !nhomMH.equals("Hàng điện máy")
                    && !nhomMH.equals("Hàng gia dụng")) {
                throw ce.new CheckNhomHang();
            }
            if (giaMH < 0) {
                throw ce.new CheckGia();
            }
            this.maMH = maMH;
            this.tenMH = tenMH;
            this.nhomMH = nhomMH;
            this.giaMH = giaMH;
            ex = "";
        } catch (CheckException.KhongDeTrong e) {
            ex = e.getMessage();
        } catch (CheckException.CheckNhomHang e) {
            ex = e.getMessage();
        } catch (CheckException.CheckGia e) {
            ex = e.getMessage();
        }
    }

    public String getException() {
        return ex;
    }

    public int getMaMH() {
        return maMH;
    }

    public void setMaMH(int maMH) {
        this.maMH = maMH;
    }

    public String getTenMH() {
        return tenMH;
    }

    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }

    public String getNhomMH() {
        return nhomMH;
    }

    public void setNhomMH(String nhomMH) {
        this.nhomMH = nhomMH;
    }

    public double getGiaMH() {
        return giaMH;
    }

    public void setGiaMH(double giaMH) {
        this.giaMH = giaMH;
    }

    class danhSachKhachHang {
        private HashMap<String,String[][]> dskh;

        public danhSachKhachHang() {
        }

        public void setDskh(HashMap<String, String[][]> dskh) {
            this.dskh = dskh;
        }
        
    }
}
