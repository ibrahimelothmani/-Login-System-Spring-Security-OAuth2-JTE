Login-System-Spring-Security-OAuth2-JTE
A robust and modern login system built with Spring Security and OAuth2, leveraging the power of JTE templates for dynamic HTML rendering. This project demonstrates seamless integration with third-party authentication providers like Google and GitHub, ensuring a secure and user-friendly experience.

Features
OAuth2 Authentication:
Sign in with Google or GitHub accounts.

Spring Security Integration:
Comprehensive security features including CSRF protection and secure logout functionality.

Dynamic HTML Templates:
Clean and maintainable HTML using JTE (Java Template Engine).

Environment Variable Support:
Client secrets and IDs are managed securely using environment variables.

Responsive Design:
Frontend styled with TailwindCSS for a modern and responsive UI.

Requirements
Java 17+
Spring Boot 3.x
Valid Google and GitHub OAuth2 client credentials.

Setup
Clone the repository:

git clone https://github.com/ibrahimelothmani/Login-System-Spring-Security-OAuth2-JTE.git

cd Login-System-Spring-Security-OAuth2-JTE

Set up environment variables:

export GOOGLE_CLIENT_ID=your_google_client_id

export GOOGLE_CLIENT_SECRET=your_google_client_secret

export GITHUB_CLIENT_ID=your_github_client_id

export GITHUB_CLIENT_SECRET=your_github_client_secret

Build and run the application:

./mvnw spring-boot:run

Access the application at http://localhost:8080.

Usage
Visit /oauth2/authorization/google or /oauth2/authorization/github to initiate login.

After successful authentication, view user information and roles on the dashboard.

Contributing

Contributions are welcome! Please fork this repository and submit a pull request with your changes.

License

This project is licensed under the MIT License. See the LICENSE file for details.

Feel free to adapt this description based on your preferences or add additional sections such as "Screenshots" or "Future Enhancements."
