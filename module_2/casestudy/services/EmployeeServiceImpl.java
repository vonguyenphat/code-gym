package casestudy.services;

import casestudy.models.person.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    public static ArrayList<Employee> listEmploy = new ArrayList<>();

    public static Scanner sc = new Scanner(System.in);

    public EmployeeServiceImpl() {
    }

    @Override
    public void add() {
        int id = (listEmploy.size() > 0) ? (listEmploy.size() + 1) : 1;
        System.out.print("Mã Nhân viên: ");
        String maNhanVien = sc.nextLine();
        System.out.print("Tên nhân viên: ");
        String tenNhanVien = sc.nextLine();
        System.out.print("Ngày sinh nhân viên: ");
        String ngaySinhNhanVien = sc.nextLine();
        System.out.print("Giới tính: ");
        String gioiTinhNV = sc.nextLine();
        System.out.print("Số CMND nhân viên: ");
        int cmndNV = sc.nextInt();
        System.out.print("Số Điện Thoại nhân viên: ");
        int stdNV = sc.nextInt();
        sc.nextLine();
        System.out.print("Email nhân viên: ");
        String emailNV = sc.nextLine();
        System.out.print("Trình độ: ");
        String trinhDo = sc.nextLine();
        System.out.print("Vị trí: ");
        String viTri = sc.nextLine();
        System.out.print("Lương: ");
        double luong = sc.nextDouble();
        sc.nextLine();
        Employee nhanVien = new Employee(id ,maNhanVien, tenNhanVien, ngaySinhNhanVien, gioiTinhNV, cmndNV, stdNV, emailNV, trinhDo, viTri, luong);
        listEmploy.add(nhanVien);
        System.out.println("Thêm thành công");
    }

    @Override
    public void display() {
        for (Employee employee : listEmploy) {
            System.out.println(employee);
        }
    }

    @Override
    public void edit() {
        System.out.println("Nhập id nhân viên cần sửa!!!");
        String  id = sc.nextLine();
        boolean isExisted = false;
        int size = listEmploy.size();
        for (Employee employee : listEmploy) {
            if (employee.getMaNV().equals(id))
                isExisted = true;
            System.out.print("Mã Nhân viên: ");
            employee.setMaNV(sc.nextLine());

        }

    }

    @Override
    // xóa theo id
    public void delete() {
        System.out.println("Nhập id nhân viên cần xóa: ");
        String idDelete = sc.nextLine();
        for (Employee employee : listEmploy) {
            if (employee.getMaNV().equals(idDelete)) {
                listEmploy.remove(employee);
                System.out.println("xóa thành công!!");
                break;
            } else System.out.println("Bạn nhập id không hợp lệ");


        }
    }
}

