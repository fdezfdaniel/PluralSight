import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fundamentals.spring.pluralsight.service.CustomerService;

public class Application {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class)) {
			CustomerService service = appContext.getBean("customerService", CustomerService.class);
			System.out.println(service);
			CustomerService service2 = appContext.getBean("customerService", CustomerService.class);
			System.out.println(service2);
			System.out.println(service.findAll().get(0).getFirstName());
		}
	}
}
