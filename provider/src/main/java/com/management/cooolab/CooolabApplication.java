package com.management.cooolab;

import com.management.cooolab.Controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import jakarta.xml.ws.Endpoint;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class CooolabApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(CooolabApplication.class, args);
		LoginController loginController = context.getBean(LoginController.class);
		ProfileController profileController = context.getBean(ProfileController.class);
		UserController userController = context.getBean(UserController.class);
		DepartmentController departmentController = context.getBean(DepartmentController.class);
		DemandeCongeController demandeCongeController = context.getBean(DemandeCongeController.class);

		String baseUrl = "http://127.0.0.1:8091/";

		Endpoint.publish(baseUrl + "demandeConge", demandeCongeController);
		Endpoint.publish(baseUrl + "department", departmentController);
		Endpoint.publish(baseUrl + "login", loginController);
		Endpoint.publish(baseUrl + "profile", profileController);
		Endpoint.publish(baseUrl + "user", userController);

		System.out.println("Services déployés sur : " + baseUrl);
	}

}
