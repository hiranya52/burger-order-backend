package edu.icet.controller;


import edu.icet.model.dto.ProductDTO;
import edu.icet.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("save")
    public void save(@RequestBody ProductDTO product){
        productService.save(product);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable String id){
        productService.delete(id);
    }

}
