package fundamentals.spring.pluralsight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import fundamentals.spring.pluralsight.model.Customer;
import fundamentals.spring.pluralsight.repository.CustomerRepository;

@Service("customerService")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CustomerServiceImpl implements CustomerService {
	//@Autowired
	private CustomerRepository customerRepository; // = new HibernateCustomerRepositoryImpl();
	
	public CustomerServiceImpl() {
		
	}
	
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		System.out.println("we are using constructor injection");
		this.customerRepository = customerRepository;
	}

	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("we are using setter injection");
		this.customerRepository = customerRepository;
	}

}
