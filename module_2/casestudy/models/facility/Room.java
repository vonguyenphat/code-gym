package casestudy.models.facility;

import casestudy.models.facility.Facility;

public class Room extends Facility {
    private String dichVufree;

    public Room(String tenDv, String dienTichSuDung, double chiPhiThue, int soLuongNguoiMax, String kieuThue, String dichVufree) {
        super(tenDv, dienTichSuDung, chiPhiThue, soLuongNguoiMax, kieuThue);
        this.dichVufree = dichVufree;
    }

    public String getDichVufree() {
        return dichVufree;
    }

    public void setDichVufree(String dichVufree) {
        this.dichVufree = dichVufree;
    }
}
