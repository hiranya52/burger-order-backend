package edu.icet.service;

import edu.icet.model.dto.ProductDTO;
import edu.icet.model.entity.Product;
import edu.icet.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public void save(ProductDTO productDto){

        Product product = new Product(
                productDto.getProductCode(),
                productDto.getName(),
                productDto.getCategory(),
                productDto.getPrice(),
                productDto.getQtyOnHand()
        );

        productRepository.save(product);

    }

}
