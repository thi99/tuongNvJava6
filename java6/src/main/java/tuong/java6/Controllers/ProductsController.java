package tuong.java6.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import tuong.java6.model.Products;
import tuong.java6.service.ProductsService;


@Controller
public class ProductsController {

    @Autowired
    ProductsService productsService;

    @GetMapping(value = {"/home","/"})
    public String  home(){
        return "/page/home";
    }

    @GetMapping("/detail")
    public String detail(@RequestParam Integer id , Model model){
        model.addAttribute("product",productsService.getProductById(id));
        return "page/detail";
    }
}
