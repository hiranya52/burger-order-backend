package edu.icet.service;


import edu.icet.model.dto.CustomerDTO;
import edu.icet.model.entity.Customer;
import edu.icet.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public void save(CustomerDTO customeDTO) {

        Customer customer = new Customer(
                customeDTO.getCustId(),
                customeDTO.getCity(),
                customeDTO.getCustAddress(),
                customeDTO.getCustTitle(),
                customeDTO.getCustName(),
                customeDTO.getDob(),
                customeDTO.getPostalCode(),
                customeDTO.getProvince(),
                customeDTO.getSalary()
        );

        customerRepository.save(customer);

    }

    public void delete(String id) {
        customerRepository.deleteById(id);
    }

    public void update(CustomerDTO customerDTO) {

        Customer updatedCustomer = new Customer(
                customerDTO.getCustId(),
                customerDTO.getCity(),
                customerDTO.getCustAddress(),
                customerDTO.getCustTitle(),
                customerDTO.getCustName(),
                customerDTO.getDob(),
                customerDTO.getPostalCode(),
                customerDTO.getProvince(),
                customerDTO.getSalary()
        );

        customerRepository.save(updatedCustomer);

    }

    public CustomerDTO getCustomerById(String id) {
        Customer byId = customerRepository.getById(id);

        return new CustomerDTO(
                byId.getCustId(),
                byId.getCity(),
                byId.getCustAddress(),
                byId.getCustTitle(),
                byId.getCustName(),
                byId.getDob(),
                byId.getPostalCode(),
                byId.getProvince(),
                byId.getSalary()
        );
    }
}
