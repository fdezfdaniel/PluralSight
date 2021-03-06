package fundamentals.spring.pluralsight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fundamentals.spring.pluralsight.model.Customer;
import fundamentals.spring.pluralsight.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	// @Autowired
	private CustomerRepository customerRepository; // = new HibernateCustomerRepositoryImpl();

	@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		System.out.println("we are using constructor injection");
		this.customerRepository = customerRepository;
		
	}
	
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	//@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("we are using setter injection");
		this.customerRepository = customerRepository;
	}

}
