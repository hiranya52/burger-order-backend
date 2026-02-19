package edu.icet.model.entity;


import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Customer {

    private String custTitle;
    private String custID;
    private String custName;
    private String dob;
    private double salary;
    private String custAddress;
    private String city;
    private String province;
    private String postalCode;

}
