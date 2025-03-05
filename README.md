# Running a Spring Boot Program from a Git Repository

## Prerequisites
Before running the Spring Boot application, ensure you have the following installed on your system:

- **Git**: To clone the repository.
- **Java (JDK 17 or later)**: Required to run the Spring Boot application.
- **Maven or Gradle**: For dependency management and building the project.
- **IDE (Optional)**: IntelliJ IDEA, Eclipse, or VS Code for development.

## Steps to Run the Spring Boot Application

### 1. Clone the Repository
Open a terminal or command prompt and execute the following command to clone the repository:
```sh
 git clone <repository-url>
```
Replace `<repository-url>` with the actual Git repository URL.

### 2. Navigate to the Project Directory
```sh
cd <project-directory>
```
Replace `<project-directory>` with the actual folder name of your cloned project.

### 3. Build the Project
If you are using **Maven**, run:
```sh
mvn clean install
```
Or, if you are using **Gradle**, run:
```sh
gradle build
```
This will download dependencies and compile the project.

### 4. Run the Spring Boot Application
#### Using Maven
```sh
mvn spring-boot:run
```
#### Using Gradle
```sh
gradle bootRun
```
#### Using Java (after building JAR file)
```sh
java -jar target/<your-app-name>.jar
```
Replace `<your-app-name>` with the actual JAR file name generated in the `target/` folder.

### 5. Access the Application
Once the application starts, you can access it via the browser or API clients at:
```
http://localhost:8080
```
(Port may vary based on configuration.)

## Additional Commands
- **Stopping the Application**: Press `Ctrl + C` in the terminal.
- **Running Tests**: Use `mvn test` or `gradle test`.
- **Checking Logs**: Logs are available in the console or log files if configured.

## Troubleshooting
- Ensure Java and Maven/Gradle are installed and configured correctly.
- Check the `application.properties` or `application.yml` for correct configurations.
- Use `mvn clean` or `gradle clean` to remove any cached files before building again.

Happy Coding! 🚀

