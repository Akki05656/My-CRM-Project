package com.crm.CRM;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	@Autowired
	CustomerService service;

	@GetMapping("/AllCustomer")
	List<Customer> getCustomerDetails() {
		List<Customer> list = service.getCustomerDetails();

		return list;
	}

	@PostMapping("/InsertCustomer")
	public String InsertCustomer(@RequestBody Customer cust) {
		String msg = service.InsertCustomer(cust);
		return msg;
	}

	@PutMapping("/UpdateCustomer")
	public String UpdateCustomer(@RequestBody Customer cust) {
		String msg = service.UpdateCustomer(cust);
		return msg;

	}

	@DeleteMapping("/DeleteCustomer/{id}")
	String DeleteCustomerById(@PathVariable int id) {
		String msg = service.DeleteCustomerById(id);
		return msg;

	}

	@GetMapping("/CustomerName")
	public List<String> getCustomerName() {
		List<String> list = service.getCustomerName();
		return list;
	}
}
