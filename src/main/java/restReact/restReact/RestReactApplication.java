package restReact.restReact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestReactApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestReactApplication.class, args);
	}

}
//
//
//	With the application running, you can check things out on the command line by using cURL (or any other tool you like).
//	The following command (shown with its output) lists the links in the application:
//
//		$ curl localhost:8080/api
//		{
//		"_links" : {
//		"employees" : {
//		"href" : "http://localhost:8080/api/employees"
//		},
//		"profile" : {
//		"href" : "http://localhost:8080/api/profile"
//		}
//		}
//		}
//		When you ping the root node, you get back a collection of links wrapped in a HAL-formatted JSON document.
//
//		_links is the collection of available links.
//
//		employees points to an aggregate root for the employee objects defined by the EmployeeRepository interface.
//
//		profile is an IANA-standard relation and points to discoverable metadata about the entire service. We explore this in a later section.//