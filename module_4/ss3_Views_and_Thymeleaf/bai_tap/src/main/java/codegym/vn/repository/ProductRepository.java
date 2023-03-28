package codegym.vn.repository;

import codegym.vn.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository implements IProductRepository {
    private static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "iphone", 230000, "Là sản phẩm đến từ nhà Apple", "America"));
        productList.add(new Product(2, "SamSung  ", 230000, "Là sản phẩm đến từ nhà SamSung", "korea"));
        productList.add(new Product(3, "VS Smart", 300000, "Là sản phẩm đến từ nhà Vin", "Việt Nam"));
        productList.add(new Product(4, "Sony", 300000, "Là sản phẩm đến từ nhà Sony", "Japan"));
    }
    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public void save(Product product) {
        productList.add(product);
    }

    @Override
    public Product findById(int id) {
        return productList.get(id);
    }

    @Override
    public void update(int id ,Product product) {
        productList.set(id,product);
    }

    @Override
    public boolean remove(int id) {
        for (Product product : productList) {
            if (product.getId() == id){
                  productList.remove(id);;
            }
        }
        return false;
    }

    @Override
    public List<Product> search(String name) {
        List<Product> products = new ArrayList<>();
        if (name.equalsIgnoreCase("")){
            return productList;
        }else {
            for (Product product: productList) {
                if (name.equalsIgnoreCase(product.getName())){
                    products.add(product);
                }
            }
        }
        return products;
    }
}
