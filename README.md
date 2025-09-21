# RestAssuredFramework

This project is an API automation testing framework built using Java, TestNG, and Rest Assured. It is designed to automate and validate RESTful API endpoints efficiently.

## Features
- API test cases using Rest Assured
- TestNG suite configuration (`suite.xml`)
- Logging with Log4j2
- Custom filters and listeners
- Organized test structure (models, base services, tests)
- Test reports generated in `test-output/`

## Project Structure
```
ResrAssuredFramework/
  ├── pom.xml
  ├── suite.xml
  ├── logs/
  ├── src/
  │   └── test/java/com/api/
  │       ├── base/
  │       ├── filters/
  │       ├── listeners/
  │       ├── models/
  │       └── tests/
  └── test-output/
```

## Getting Started
1. **Clone the repository**
2. **Install dependencies**
   - Run `mvn clean install` in the project root
3. **Run tests**
   - Execute TestNG suite: `mvn test -DsuiteXmlFile=suite.xml`

## How to Add New Tests
- Create new test classes in `src/test/java/com/api/tests/`
- Add the class name to `suite.xml` under `<classes>`

## Reports & Logs
- Test reports: `test-output/`
- Logs: `logs/test.log`

## Requirements
- Java 8+
- Maven

## How to Run

You can run the API tests using Maven and TestNG. Make sure you have Java and Maven installed.

### Steps:
1. Open a terminal in the project root directory.
2. Run the following command to clean and build the project:
   
   mvn clean install

3. To execute the TestNG suite, use:
   
   mvn test -DsuiteXmlFile=suite.xml

4. After execution, view the test reports in the `test-output/` folder.

## Useful Links
- [Rest Assured Documentation](https://rest-assured.io/)
- [TestNG Documentation](https://testng.org/doc/)

---
Feel free to contribute or customize the framework for your API testing needs.
