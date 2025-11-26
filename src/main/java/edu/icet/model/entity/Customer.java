package edu.icet.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Customer {

    @Id
    private String custId;
    private String city;
    private String custAddress;
    private String custTitle;
    private String custName;
    private String dob;
    private String postalCode;
    private String province;
    private double salary;


}
