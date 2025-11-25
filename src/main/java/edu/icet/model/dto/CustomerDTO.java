package edu.icet.model.dto;

import jakarta.persistence.Id;
import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CustomerDTO {

    @Id
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
