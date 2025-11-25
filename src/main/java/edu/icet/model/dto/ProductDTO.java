package edu.icet.model.dto;

import lombok.*;
import org.springframework.stereotype.Service;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProductDTO {

    private String productCode;
    private String name;
    private String category;
    private double price;
    private int qtyOnHand;


}
