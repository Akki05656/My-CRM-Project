package com.crm.CRM;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

	@Autowired
	CustomerDao dao;

	public List<Customer> getCustomerDetails() {
		List<Customer> list = dao.getCustomerDetails();
		return list;
	}

	public String InsertCustomer(Customer cust) {
		String msg = dao.InsertCustomer(cust);
		return msg;
	}

	public String UpdateCustomer(Customer cust) {
		String msg = dao.UpdateCustomer(cust);
		return null;
	}

	public String DeleteCustomerById(int id) {
		String msg = dao.DeleteCustomerById(id);
		return msg;
	}

	public List<String> getCustomerName() {
		List<String> list = dao.getCustomerName();
		return list;
	}

}
