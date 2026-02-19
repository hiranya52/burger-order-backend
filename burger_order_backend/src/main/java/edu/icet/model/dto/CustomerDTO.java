package edu.icet.model.dto;

import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CustomerDTO {

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
