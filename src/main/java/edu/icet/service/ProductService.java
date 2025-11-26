package edu.icet.service;

import edu.icet.model.dto.CustomerDTO;
import edu.icet.model.dto.ProductDTO;
import edu.icet.model.entity.Product;
import edu.icet.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    public void delete(String id) {
        productRepository.deleteById(id);
    }

    public void update(ProductDTO productDTO) {

        Product product = new Product(
                productDTO.getProductCode(),
                productDTO.getName(),
                productDTO.getCategory(),
                productDTO.getPrice(),
                productDTO.getQtyOnHand()
        );

        productRepository.save(product);

    }

    public ProductDTO getProductById(String id) {
        Product product = productRepository.getById(id);

        return new ProductDTO(
                product.getProductCode(),
                product.getName(),
                product.getCategory(),
                product.getPrice(),
                product.getQtyOnHand()
        );
    }

    public List<ProductDTO> findAll() {

        List<Product> products = productRepository.findAll();

        List<ProductDTO> productDTOS = new ArrayList<>();

        for (Product product : products){

            productDTOS.add(
                    new ProductDTO(
                            product.getProductCode(),
                            product.getName(),
                            product.getCategory(),
                            product.getPrice(),
                            product.getQtyOnHand()
                    )
            );

        }

        return productDTOS;

    }
}