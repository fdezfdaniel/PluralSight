package fundamentals.spring.pluralsight.service;

import java.util.List;

import fundamentals.spring.pluralsight.model.Customer;
import fundamentals.spring.pluralsight.repository.CustomerRepository;
import fundamentals.spring.pluralsight.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {
	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();
	
	/* (non-Javadoc)
	 * @see fundamentals.spring.pluralsight.service.CustomerService#findAll()
	 */
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}
	

}
