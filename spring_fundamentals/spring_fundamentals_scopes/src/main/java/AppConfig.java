import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"fundamentals.spring"})
public class AppConfig {
	/**@Bean(name="customerService")
	public CustomerService getCustomerService() {
		//using constructor injection no Autowired
		//CustomerServiceImpl service =  new CustomerServiceImpl(getCustomerRepository());
		CustomerServiceImpl service = new CustomerServiceImpl();
		//using setter injection no Autowired
		//service.setCustomerRepository(getCustomerRepository());
		return service;
	}**/
	
	/**@Bean(name="customerRepository")
	public CustomerRepository getCustomerRepository() {
		return new HibernateCustomerRepositoryImpl();
	}**/

}
