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
public class CheckException {

    public class KhongDeTrong extends Exception {

        private String s;

        public KhongDeTrong(String s) {
            super(s);
            this.s = s;
        }

        @Override
        public String getMessage() {
            return s + " không được để trống";
        }
    }

    public class CheckNhomHang extends Exception {

        public CheckNhomHang() {
            super();
        }

        @Override
        public String getMessage() {
            return "Nhóm hàng không tồn tại";
        }
    }

    public class CheckGia extends Exception {

        public CheckGia() {
            super();
        }

        @Override
        public String getMessage() {
            return "Giá không được âm";
        }
    }

    public class CheckSDT extends Exception {

        public CheckSDT() {
            super();
        }

        @Override
        public String getMessage() {
            return "Số điện thoại chỉ gồm chữ số";
        }
    }

    public class CheckNameInList extends Exception {

        public CheckNameInList() {
            super();
        }

        @Override
        public String getMessage() {
            return "Tên không có trong danh sách";
        }
    }

}
