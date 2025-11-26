package edu.icet.controller;

import edu.icet.model.dto.CustomerDTO;
import edu.icet.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping
    public String loadCustomer(){
        return "load Customer Controller..";
    }

    @PostMapping("/save")
    public void save(@RequestBody CustomerDTO customer){
        customerService.save(customer);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable String id){
        customerService.delete(id);
    }


}
