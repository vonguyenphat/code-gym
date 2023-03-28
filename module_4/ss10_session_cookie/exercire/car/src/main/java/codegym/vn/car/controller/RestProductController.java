package codegym.vn.car.controller;

import codegym.vn.car.model.Product;
import codegym.vn.car.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class RestProductController {
    @Autowired
    IProductService productService;

    @PostMapping(value = "/update-product")
    public ResponseEntity<List<Product>> updateProduct(@RequestBody Product product) {
        productService.updateProduct(product);
        return new ResponseEntity<>(productService.findAll(), HttpStatus.OK);
    }
}
