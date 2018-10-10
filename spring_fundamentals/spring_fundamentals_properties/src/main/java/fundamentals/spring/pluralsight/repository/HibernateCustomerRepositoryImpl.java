package fundamentals.spring.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;

import fundamentals.spring.pluralsight.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	@Value("${dbUsername}")
	private String dbUsername;
	
	public void setDbUsername(String dbUsername) {
		this.dbUsername = dbUsername;
	}
	public List<Customer> findAll(){
		System.out.println(dbUsername);
		List<Customer> customersList = new ArrayList<Customer>();
		Customer customer = new Customer();
		customer.setFirstName("Daniel");
		customer.setLastName("Fernandez");
		customersList.add(customer);
		return customersList;
	}
}
