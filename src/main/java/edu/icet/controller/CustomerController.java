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
    public String loaded() {
        return "Customer Controller Loaded!!";
    }

    @PostMapping("/save")
    public void save(@RequestBody CustomerDTO customer){
        customerService.save(customer);
    }

}
