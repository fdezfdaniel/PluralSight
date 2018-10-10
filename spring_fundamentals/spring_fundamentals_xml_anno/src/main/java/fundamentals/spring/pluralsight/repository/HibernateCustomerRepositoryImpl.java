package fundamentals.spring.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import fundamentals.spring.pluralsight.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	public List<Customer> findAll() {
		List<Customer> customersList = new ArrayList<Customer>();
		Customer customer = new Customer();
		customer.setFirstName("Daniel");
		customer.setLastName("Fernandez");
		customersList.add(customer);
		return customersList;
	}
}
