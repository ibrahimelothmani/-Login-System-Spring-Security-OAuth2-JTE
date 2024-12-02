package ibrahim.OAuth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OAuthApplication {

	public static final Logger logger = LoggerFactory.getLogger(OAuthApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(OAuthApplication.class, args);
		logger.info("OAuth Application started");
	}

}
