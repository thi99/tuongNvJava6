package tuong.java6.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tuong.java6.model.Products;
import tuong.java6.repositories.ProductsRepository;
import tuong.java6.service.ProductsService;

import java.util.List;

@Service
public class ProdcutsServiceImpl implements ProductsService {

    @Autowired
    ProductsRepository REPOSITORY;

    public List<Products> getAllProducts(){
        return REPOSITORY.findAll();
    }

    @Override
    public Products getProductById(Integer id) {
        return REPOSITORY.getById(id);
    }

}
