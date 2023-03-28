package casestudy.models.facility;

import casestudy.models.facility.Facility;

public class House extends Facility {
    private String tieuChuanPhong;
    private int soTang;


    public House(String tenDv, String dienTichSuDung, double chiPhiThue, int soLuongNguoiMax, String kieuThue) {
        super(tenDv, dienTichSuDung, chiPhiThue, soLuongNguoiMax, kieuThue);
    }

    public House(String tenDv, String dienTichSuDung, double chiPhiThue, int soLuongNguoiMax, String kieuThue, String tieuChuanPhong, int soTang) {
        super(tenDv, dienTichSuDung, chiPhiThue, soLuongNguoiMax, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }
}
