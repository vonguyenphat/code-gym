package ss12_collection_framework;

import ss12_collection_framework.product.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductManage danhSach = new ProductManage();
        int luachon = 0;
        do {
            System.out.println("=====MENU=====");
            System.out.println("" +
                    "1 Thêm sản phẩm\n" +
                    "2 Sửa thông tin sản phẩm theo id\n" +
                    "3 Xoá sản phẩm theo id\n" +
                    "4 Hiển thị danh sách sản phẩm\n" +
                    "5 Tìm kiếm sản phẩm theo tên" + "\n" +
                    "6 Sắp xếp sản phẩm tăng dần, giảm dần theo giá");
            luachon = sc.nextInt();
            sc.nextLine();
            switch (luachon) {
                case 1:// thme sản phẩm
                    System.out.println("Nhập id sản  phẩm: ");
                    String idSanPham = sc.nextLine();
                    System.out.println("Nhập tên sản phẩm: ");
                    String tenSanPham = sc.nextLine();
                    System.out.println("Nhập giá sản phẩm: ");
                    double giaSanPham = sc.nextInt();
                    Product sanPham = new Product(idSanPham,tenSanPham,giaSanPham);
                    danhSach.themSanPham(sanPham);
                    break;
                case 2:
                    danhSach.editProduct();
                    break;
                case 3:
                    System.out.print("please enter a id product you want to remove : ");
                    String idProducts = sc.nextLine();
                    Product idSP = new Product(idProducts);
                    System.out.println("delete a product by id : "+danhSach.removeProduct(idSP));
                    break;
                case 4:// hiển thị danh sách sản phẩm
                    danhSach.hienthiDanhSach();
                case 5:
                case 6:
            }
        } while (true);
    }
}