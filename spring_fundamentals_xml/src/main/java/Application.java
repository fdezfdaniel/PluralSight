import org.springframework.context.support.ClassPathXmlApplicationContext;

import fundamentals.spring.pluralsight.service.CustomerService;

public class Application {

	public static void main(String[] args) {
//		CustomerService service = new CustomerServiceImpl();

		try (ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml")) {
			CustomerService service = appContext.getBean("customerService", CustomerService.class);

			System.out.println(service.findAll().get(0).getFirstName());
		}
	}

}
