package casestudy.models.facility;

import casestudy.models.facility.Facility;

public class Villa extends Facility {
    private String tieuChuanPhong;
    private double dienTichHoBoi;

    public Villa(String tenDv, String dienTichSuDung, double chiPhiThue, int soLuongNguoiMax, String kieuThue, String tieuChuanPhong, double dienTichHoBoi) {
        super(tenDv, dienTichSuDung, chiPhiThue, soLuongNguoiMax, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public double getDienTichHoBoi() {
        return dienTichHoBoi;
    }

    public void setDienTichHoBoi(double dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
    }
}
