package edu.icet.model.dto;

import jakarta.persistence.Id;
import lombok.*;
import org.springframework.stereotype.Service;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProductDTO {

    @Id
    private String productCode;
    private String name;
    private String category;
    private double price;
    private int qtyOnHand;

}
