package casestudy.models.person;

public class Customer extends Person {
    private String maKhachHang;
    private String loaiKach;
    private String diaChi;

    public Customer(int id, String name, String ngaysinh, String gioiTinh, int cmnd, int sdt, String email, String maKhachHang, String loaiKach, String diaChi) {
        super(id, name, ngaysinh, gioiTinh, cmnd, sdt, email);
        this.maKhachHang = maKhachHang;
        this.loaiKach = loaiKach;
        this.diaChi = diaChi;
    }

//    public Customer(String name, String ngaysinh, String gioiTinh, int cmnd, int sdt, String email, String maKhachHang, String loaiKach, String diaChi) {
//        super(name, ngaysinh, gioiTinh, cmnd, sdt, email);
//        this.maKhachHang = maKhachHang;
//        this.loaiKach = loaiKach;
//        this.diaChi = diaChi;
//    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getLoaiKach() {
        return loaiKach;
    }

    public void setLoaiKach(String loaiKach) {
        this.loaiKach = loaiKach;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}
