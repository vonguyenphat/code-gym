package casestudy.models.facility;

public abstract class Facility {
    private String tenDv;
    private String dienTichSuDung;
    private double chiPhiThue;
    private int soLuongNguoiMax;
    private String kieuThue;

    public Facility(String tenDv, String dienTichSuDung, double chiPhiThue, int soLuongNguoiMax, String kieuThue) {
        this.tenDv = tenDv;
        this.dienTichSuDung = dienTichSuDung;
        this.chiPhiThue = chiPhiThue;
        this.soLuongNguoiMax = soLuongNguoiMax;
        this.kieuThue = kieuThue;
    }

    public String getTenDv() {
        return tenDv;
    }

    public void setTenDv(String tenDv) {
        this.tenDv = tenDv;
    }

    public String getDienTichSuDung() {
        return dienTichSuDung;
    }

    public void setDienTichSuDung(String dienTichSuDung) {
        this.dienTichSuDung = dienTichSuDung;
    }

    public double getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(double chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public int getSoLuongNguoiMax() {
        return soLuongNguoiMax;
    }

    public void setSoLuongNguoiMax(int soLuongNguoiMax) {
        this.soLuongNguoiMax = soLuongNguoiMax;
    }

    public String getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(String kieuThue) {
        this.kieuThue = kieuThue;
    }
}
