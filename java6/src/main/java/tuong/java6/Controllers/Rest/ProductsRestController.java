package tuong.java6.Controllers.Rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import tuong.java6.model.Products;
import tuong.java6.service.ProductsService;

import java.util.List;


@RestController
@RequestMapping("/rest/")
public class ProductsRestController {

    @Autowired
    ProductsService productsService;

    @GetMapping(value = {"/products"})
    public List<Products> home(){
        List<Products> products = productsService.getAllProducts();
        return products;
    }

    @PostMapping("/detail")
    @ResponseBody
    public String detail(@RequestBody Products products){
        return products.getProductName();
    }
}
