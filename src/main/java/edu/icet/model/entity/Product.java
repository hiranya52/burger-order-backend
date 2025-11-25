package edu.icet.model.entity;


import jakarta.persistence.Entity;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Product {

    private String productCode;
    private String name;
    private String category;
    private double price;
    private int qtyOnHand;

}
