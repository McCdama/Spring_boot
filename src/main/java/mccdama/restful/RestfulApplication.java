package mccdama.restful;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestfulApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulApplication.class, args);
	}

}

// ------------GRADLE------------
 // Run: ./gradlew bootRun
 
 // Build: ./gradlew build
 // Run the JAR file: java -jar build/libs/restful-0.0.1-SNAPSHOT.jar