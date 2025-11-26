package edu.icet.model.dto;

import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CustomerDTO {

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
