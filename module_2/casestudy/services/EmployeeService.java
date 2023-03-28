package casestudy.services;

// dịch vụ nhân viên
public interface EmployeeService extends Service {
    @Override
    void add();

    @Override
    void display();

    @Override
    void edit();

    @Override
    void delete();
    //
//    ArrayList<Employee> listEmploy = new ArrayList<>();
//    Scanner sc = new Scanner(System.in);
////    public static void addEmployee(){
//
////    }
//
//    @Override
//      void add(){
//                System.out.print("Mã Nhân viên: ");
//        String maNhanVien = sc.nextLine();
//        System.out.print("Tên nhân viên: ");
//        String tenNhanVien = sc.nextLine();
//        System.out.print("Ngày sinh nhân viên: ");
//        String ngaySinhNhanVien = sc.nextLine();
//        System.out.print("Giới tính: ");
//        String gioiTinhNV = sc.nextLine();
//        System.out.print("Số CMND nhân viên: ");
//        int cmndNV = sc.nextInt();
//        System.out.print("Số Điện Thoại nhân viên: ");
//        int stdNV = sc.nextInt();
//        sc.nextLine();
//        System.out.print("Email nhân viên: ");
//        String emailNV = sc.nextLine();
//        System.out.print("Trình độ: ");
//        String trinhDo = sc.nextLine();
//        System.out.print("Vị trí: ");
//        String viTri = sc.nextLine();
//        System.out.print("Lương: ");
//        double luong = sc.nextDouble();
//        Employee nhanVien = new Employee(maNhanVien,tenNhanVien,ngaySinhNhanVien,gioiTinhNV,cmndNV,stdNV,emailNV,trinhDo,viTri,luong);
//        listEmploy.add(nhanVien);
//    }
//
//    @Override
//    void display();
//
//    @Override
//    void edit();
}
