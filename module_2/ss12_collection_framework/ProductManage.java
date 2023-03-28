package ss12_collection_framework;

import ss12_collection_framework.product.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManage {
    private  ArrayList<Product> manages = new ArrayList<>();
    Scanner sc =new Scanner(System.in);

    public ProductManage() {
    }

    public ProductManage(ArrayList<Product> manages) {
        this.manages = manages;
    }
    // thêm sản phẩm
    public void themSanPham(Product sanPham){
        manages.add(sanPham);
    }
    //    2.Sua thong tin san pham theo id
    public void editProduct(){
        System.out.print("nhap id product muon edit :");
        String idProduct = sc.nextLine();
        for (int i = 0 ;i<manages.size();i++){
            if (manages.get(i).getId().equals(idProduct) ){
                System.out.print("new name product :");
                String name = sc.nextLine();
                manages.get(i).setName(name);
                System.out.print("new price product :");
                float price = Float.parseFloat(sc.nextLine());
                manages.get(i).setPrice(price);
            }else {
                System.out.println("ko co product nao trung khop vs id nay");
            }
        }
    }

    public boolean removeProduct(Product idsanPham){
        return manages.remove(idsanPham);
    }

    // hiểm thị danh sách sản phẩm
    public void hienthiDanhSach(){
        for (int i = 0; i < manages.size(); i++) {
            System.out.println("sản phẩm thứ "+(i+1)+manages.get(i));
        }
    }

}
