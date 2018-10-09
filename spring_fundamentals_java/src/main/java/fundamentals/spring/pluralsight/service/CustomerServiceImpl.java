package fundamentals.spring.pluralsight.service;

import java.util.List;

import fundamentals.spring.pluralsight.model.Customer;
import fundamentals.spring.pluralsight.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {
	private CustomerRepository customerRepository; // = new HibernateCustomerRepositoryImpl();

	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

}
