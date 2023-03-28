package casestudy.models.person;

public class Employee extends Person {
    private String maNV;
    private String trinhDo;
    private String viTri;
    private double luong;

    public Employee(int id, String maNV, String name, String ngaysinh, String gioiTinh, int cmnd, int sdt, String email, String trinhDo, String viTri, double luong) {
        super(id, name, ngaysinh, gioiTinh, cmnd, sdt, email);
        this.maNV = maNV;
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;
    }


    //    public Employee(String maNV, String name, String ngaysinh, String gioiTinh, int cmnd, int sdt, String email, String trinhDo, String viTri, double luong) {
//        super(name, ngaysinh, gioiTinh, cmnd, sdt, email);
//        this.maNV = maNV;
//        this.trinhDo = trinhDo;
//        this.viTri = viTri;
//        this.luong = luong;
//    }


    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id " + getId() + '\'' +
                "maNV='" + maNV + '\'' +
                "name='" + getName() + '\'' +
                ", ngaysinh='" + getNgaysinh() + '\'' +
                ", gioiTinh='" + getGioiTinh() + '\'' +
                ", cmnd=" + getCmnd() +
                ", sdt=" + getSdt() +
                ", email='" + getEmail() + '\'' +
                ", trinhDo='" + trinhDo + '\'' +
                ", viTri='" + viTri + '\'' +
                ", luong=" + luong +
                '}';
    }

//    @Override
//    public String toString() {
//        return "Employee{" +
//                "maNV='" + maNV + '\'' +
//                ", trinhDo='" + trinhDo + '\'' +
//                ", viTri='" + viTri + '\'' +
//                ", luong=" + luong +
//                '}'+super.toString();
//    }
}
