package edu.icet.service;

import edu.icet.model.dto.CustomerDTO;
import edu.icet.model.entity.Customer;
import edu.icet.repository.CustomerRepository;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public void save(CustomerDTO customerDto) {

        Customer customer = new Customer(
                customerDto.getCustID(),
                customerDto.getCustTitle(),
                customerDto.getCustName(),
                customerDto.getDob(),
                customerDto.getSalary(),
                customerDto.getCustAddress(),
                customerDto.getCity(),
                customerDto.getProvince(),
                customerDto.getPostalCode()
        );

        customerRepository.save(customer);

    }

}
