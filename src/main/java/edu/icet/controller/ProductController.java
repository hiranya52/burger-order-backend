package edu.icet.controller;


import edu.icet.model.dto.CustomerDTO;
import edu.icet.model.dto.ProductDTO;
import edu.icet.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @PutMapping("/update")
    public void updateProduct(@RequestBody ProductDTO productDTO) {
        productService.update(productDTO);
    }

    @GetMapping("{id}")
    public ProductDTO getProductById(@PathVariable String id){
        return productService.getProductById(id);
    }

    @GetMapping("/getAll")
    public List<ProductDTO> getAllProducts(){
        return productService.findAll();
    }

}
