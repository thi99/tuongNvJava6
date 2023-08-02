package tuong.java6.service;

import org.springframework.stereotype.Service;
import tuong.java6.model.Products;

import java.util.List;


public interface ProductsService {
    public List<Products> getAllProducts();
    public Products getProductById(Integer id);
}
