# Automation-Testing-Using-Selenium-Sand-Box-Project
This repository is a sandbox project for Web Automation using Java, Selenium and TestNG, created to explore and apply multiple design patterns and automation practices for building scalable, maintainable, and efficient test automation.

## Project-Structure-&-Evolution
The project is is organaized packages, each reflacting a stage in automation practice maturity of appling design patterns:


    .
    ├── ...
    ├── src                                   
    |      ├── main/java
    |                   ├── engine                  (actions bot class impelementation)
    |                   ├── pomPages                (page classes impelementation utilizing the page object model design pattern)
    |                   ├── fluentPomPages          (page classes impelementation utilizing the fluent page object model design pattern)
    |                   └── botPomPages             (page classes impelementation utilizing the bot with the fluent page object model design pattern)
    |      └── test/java
    |                   ├── seleniumFlatTests       (test classes impelementation without using a design pattern)
    |                   ├── seleniumPomTests        (test classes impelementation utilizing the page object model design pattern)
    |                   ├── seleniumFluentPomTests  (test classes impelementation utilizing the fluent page object model design pattern)
    |                   └── SeleniumbotPomTests     (test classes impelementation utilizing the bot with the fluent page object model design pattern)
    └── ...

## Key Features

### Design Patterns
- ### Flat Tests ###
Initial Selenium test implementations written directly without applying any design patterns. Served as the baseline for understanding execution flow and identifying the need for structured test design.
- ### Page Object Model (POM) Design Pattern ###
Introduced the Page Object Model (POM) to separate test logic from UI element locators and interactions. Improved code readability, maintainability, and reusability.
- ### Fluent POM Design Pattern ###
Enhanced the POM approach with the Fluent Interface design pattern, enabling more expressive and chainable test cases. Allowed test flows to be written in a clean, user-friendly syntax.
- ### Bot, Fluent POM Combined ###
Final stage combining Bot Pattern, Fluent Interface, and POM to achieve maximum abstraction of browser's action from page/test impelementation, along with enhanced readability, and maintainability.

### Parallel Execution
Implements parallel test execution through the Maven CLI by configuring the Surefire plugin parameters with parallel excution mode across classes and the number of threads to be used, reducing overall runtime by more than 50% and improving efficiency.

### Cross-Browser Testing
Supports browser parameterization (Chrome, Firefox, Safari) via CLI arguments. This functionality is applied specifically in the Bot + POM tests package, allowing flexible cross-browser test runs. You can edit the step "run maven tests" in the maven.yml file to configure the target browser, replase "mvn test" mvn test "-Dbrowser=edge" and replace edge with the desired browser name.

### GitHub Actions Workflow
- CI Workflow: configured to trigger automatically on push and pull request events, ensuring continuous test execution and fast feedback.
- Dependabot: automates dependency management by keeping libraries up-to-date.

