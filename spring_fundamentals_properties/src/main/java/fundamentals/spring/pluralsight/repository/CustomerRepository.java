package fundamentals.spring.pluralsight.repository;

import java.util.List;

import fundamentals.spring.pluralsight.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}