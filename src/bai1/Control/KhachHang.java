/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1.Control;

/**
 *
 * @author BlackCrystal
 */
import java.util.*;

public class KhachHang {

    private int maKH;
    private String hoTen;
    private String diaChi;
    private String sdt;
    private String exception;

    public KhachHang() {
        maKH = 0;
        hoTen = "";
        diaChi = "";
        sdt = "";
        exception = "";
    }

    public KhachHang(int maKH, String hoTen, String diaChi, String sdt) {
        this.maKH = maKH;
        try {
            CheckException ce = new CheckException();
            if (hoTen.length() == 0) {
                throw ce.new KhongDeTrong("Tên");
            }
            if (diaChi.length() == 0) {
                throw ce.new KhongDeTrong("Địa chỉ");
            }
            for (int i = 0; i < sdt.length(); i++) {
                if (sdt.charAt(i) < '0' || sdt.charAt(i) > '9') {
                    throw ce.new CheckSDT();
                }
            }
            this.hoTen = hoTen;
            this.diaChi = diaChi;
            this.sdt = sdt;
            exception = "";
        } catch (CheckException.KhongDeTrong e) {
            exception = e.getMessage();
        } catch (CheckException.CheckSDT e) {
            exception = e.getMessage();
        }
    }

    public String getException() {
        return exception;
    }

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;

    }

    class DanhSachMatHang {

        private HashMap<String, Integer> dsmh;

        public DanhSachMatHang() {
            dsmh = new HashMap<>();
        }

        public HashMap<String, Integer> getDsmh() {
            return dsmh;
        }
        
        public void themSanPham(String s, Integer i) {
            if (!dsmh.containsKey(s)) {
                dsmh.put(s, i);
            } else {
                dsmh.put(s, dsmh.get(s) + i);
            }
        }

    }
}
