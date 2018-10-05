package fundamentals.spring.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import fundamentals.spring.pluralsight.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	/* (non-Javadoc)
	 * @see fundamentals.spring.pluralsight.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		List<Customer> customersList = new ArrayList<Customer>();
		Customer customer = new Customer();
		customer.setFirstName("Daniel");
		customer.setLastName("Fernandez");
		customersList.add(customer);
		return customersList;
	}
}
