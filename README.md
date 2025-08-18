# Automation Testing Using Selenium Sandbox Project
This repository is a sandbox project for Web Automation using Java, Selenium and TestNG, created to explore and apply multiple design patterns and automation practices for building scalable, maintainable, and efficient test automation.

## Project-Structure-&-Evolution
The project is organized into packages, each reflecting a stage in automation maturity and the application of design patterns.


    .
    ├── ...
    ├── src                                   
    |      ├── main/java
    |                   ├── engine                  (actions bot class implementation)
    |                   ├── pomPages                (page classes implementation utilizing the page object model design pattern)
    |                   ├── fluentPomPages          (page classes implementation utilizing the fluent page object model design pattern)
    |                   └── botPomPages             (page classes implementation utilizing the bot with the fluent page object model design pattern)
    |      └── test/java
    |                   ├── seleniumFlatTests       (test classes implementation without using a design pattern)
    |                   ├── seleniumPomTests        (test classes implementation utilizing the page object model design pattern)
    |                   ├── seleniumFluentPomTests  (test classes implementation utilizing the fluent page object model design pattern)
    |                   └── seleniumbotPomTests     (test classes implementation utilizing the bot with the fluent page object model design pattern)
    └── ...

## Key Features

### Design Patterns
- **Flat Tests:**

Initial Selenium test implementations written directly without applying any design patterns. Served as the baseline for understanding execution flow and identifying the need for structured test design.
- **Page Object Model (POM) Design Pattern:**

Introduced the Page Object Model (POM) to separate test logic from UI element locators and interactions. Improved code readability, maintainability, and reusability.
- **Fluent POM Design Pattern:**

Enhanced the POM approach with the Fluent Interface design pattern, enabling more expressive and chainable test cases. Allowed test flows to be written in a clean, user-friendly syntax.
- **Bot, Fluent POM Combined:**

Final stage combining Bot Pattern, Fluent Interface, and POM to achieve maximum abstraction of browser actions from page and test implementations, along with enhanced readability, and maintainability.

### Parallel Execution
Implements parallel test execution through the Maven CLI by configuring the Maven Surefire plugin to run tests in parallel across classes with multiple threads, reducing runtime by over 50% and improving efficiency.

### Cross-Browser Testing
Supports browser parameterization (Chrome, Firefox, Safari) via CLI arguments. This functionality is applied specifically in the Bot Pom tests package, allowing flexible cross-browser test runs. You can edit the step ```` Run Tests using Maven ```` in github actions ```` maven.yml ```` file to configure the target browser.For example, replace ```` mvn test ```` with ```` mvn test -Dbrowser=edge ````, and change ```` edge ```` to the desired browser name.

### GitHub Actions Workflow
- CI Workflow: Triggers automatically on push and pull requests, ensuring continuous test execution and fast feedback.
- Dependabot: automates dependency management by keeping libraries up-to-date.

