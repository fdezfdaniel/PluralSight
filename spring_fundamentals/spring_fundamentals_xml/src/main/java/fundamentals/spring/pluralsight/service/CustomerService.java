package fundamentals.spring.pluralsight.service;

import java.util.List;

import fundamentals.spring.pluralsight.model.Customer;

public interface CustomerService {

	List<Customer> findAll();

}