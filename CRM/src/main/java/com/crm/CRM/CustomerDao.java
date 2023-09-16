package com.crm.CRM;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDao {

	@Autowired
	SessionFactory sf;

	public List<Customer> getCustomerDetails() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Customer.class);
		return criteria.list();
	}

	public String InsertCustomer(Customer cust) {
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(cust);
		transaction.commit();
		return "Customer inserted successfully";
	}

	public String UpdateCustomer(Customer cust) {
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(cust);
		transaction.commit();
		return "Customer details updated";
	}

	public String DeleteCustomerById(int id) {
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		Customer customer = session.load(Customer.class, id);
		session.delete(customer);
		transaction.commit();
		return "Customer details deleted..!";
	}

	public List<String> getCustomerName() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Customer.class);
		List<Customer> CN = criteria.list();
		List<String> list = new ArrayList<>();
		for (Customer customer : CN) {

			list.add(customer.getFname());
		}
		return list;
	}

}
