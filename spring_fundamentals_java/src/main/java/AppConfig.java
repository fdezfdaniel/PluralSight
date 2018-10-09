import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import fundamentals.spring.pluralsight.repository.CustomerRepository;
import fundamentals.spring.pluralsight.repository.HibernateCustomerRepositoryImpl;
import fundamentals.spring.pluralsight.service.CustomerService;
import fundamentals.spring.pluralsight.service.CustomerServiceImpl;

@Configuration
public class AppConfig {
	@Bean(name="customerService")
	public CustomerService getCustomerService() {
		CustomerServiceImpl service =  new CustomerServiceImpl();
		service.setCustomerRepository(getCustomerRepository());
		return service;
	}
	
	@Bean(name="customerRepository")
	public CustomerRepository getCustomerRepository() {
		return new HibernateCustomerRepositoryImpl();
	}

}
