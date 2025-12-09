
| CS-665       | Software Design & Patterns |
|--------------|----------------------------|
| Name         | Zhuoning Li                |
| Date         | 12/09/2025                 |
| Course       | Fall                       |
| Assignment # | Term Project               |

# Assignment Overview

This project implements a flexible and extensible Notification System designed to support
multiple types of messages (such as welcome messages, promotions, alerts, and weekly
summaries) and multiple delivery channels (email, SMS, and push notifications). The
objective is to demonstrate how software design patterns can be used to decouple message
content from delivery mechanisms, allowing both dimensions to evolve independently.

To achieve this goal, the implementation combines two design patterns. The Bridge pattern
separates the abstraction of a notification from the concrete message delivery channels,
enabling any notification type to be paired with any sender at runtime. The Strategy pattern
is used to support interchangeable message formatting styles such as plain text, HTML, and
Markdown. Together, these patterns provide a highly modular and extensible architecture
that illustrates clean software design principles.

# GitHub Repository Link:
[https://github.com/Casthecat/cs-665-term-project](https://github.com/Casthecat/cs-665-term-project)

# Implementation Description 

**Flexibility.**  
The system is highly flexible because both notification types and delivery channels evolve
independently. Adding a new notification requires only creating a subclass of `Notification`,
and adding a new delivery channel only requires implementing the `MessageSender`
interface. Neither change affects existing classes. Formatting strategies can also be added
without modifying notification logic, as all formatters implement the `MessageFormatter`
interface. This modular structure makes the system open to extension and closed to
modification.

**Simplicity and Understandability.**  
The architecture is organized into clear and consistent layers: notification abstraction,
sender implementations, and formatting strategies. Responsibilities are well-separated, and
class names closely match their roles. Each class is small and focused on a single purpose,
making the system easy to read and maintain. The use of interfaces and abstract classes
makes the relationships between components explicit.

**Avoiding Duplicated Code.**  
Common behaviors such as sending workflow, title–body formatting, and runtime switching
of sender or formatter are implemented once in the `Notification` abstract class.
Subclasses only provide message-specific content through `generateTitle()` and
`generateBody()`. This eliminates repeated logic across subclasses, reduces the risk of
inconsistent behavior, and simplifies future updates.

**Design Patterns Used.**  
Two design patterns are applied in this implementation. The Bridge pattern decouples
notifications from delivery channels, preventing class explosion and allowing independent
variation of message type and sending mechanism. The Strategy pattern is used for message
formatting, enabling notifications to dynamically change output style without altering core
logic. These patterns were chosen because they directly address the system’s two dimensions
of variability: “what is being sent” and “how it is formatted and delivered.”


# Maven Commands

We'll use Apache Maven to compile and run this project. You'll need to install Apache Maven (https://maven.apache.org/) on your system. 

Apache Maven is a build automation tool and a project management tool for Java-based projects. Maven provides a standardized way to build, package, and deploy Java applications.

Maven uses a Project Object Model (POM) file to manage the build process and its dependencies. The POM file contains information about the project, such as its dependencies, the build configuration, and the plugins used for building and packaging the project.

Maven provides a centralized repository for storing and accessing dependencies, which makes it easier to manage the dependencies of a project. It also provides a standardized way to build and deploy projects, which helps to ensure that builds are consistent and repeatable.

Maven also integrates with other development tools, such as IDEs and continuous integration systems, making it easier to use as part of a development workflow.

Maven provides a large number of plugins for various tasks, such as compiling code, running tests, generating reports, and creating JAR files. This makes it a versatile tool that can be used for many different types of Java projects.

## Compile
Type on the command line: 

```bash
mvn clean compile
```



## JUnit Tests
JUnit is a popular testing framework for Java. JUnit tests are automated tests that are written to verify that the behavior of a piece of code is as expected.

In JUnit, tests are written as methods within a test class. Each test method tests a specific aspect of the code and is annotated with the @Test annotation. JUnit provides a range of assertions that can be used to verify the behavior of the code being tested.

JUnit tests are executed automatically and the results of the tests are reported. This allows developers to quickly and easily check if their code is working as expected, and make any necessary changes to fix any issues that are found.

The use of JUnit tests is an important part of Test-Driven Development (TDD), where tests are written before the code they are testing is written. This helps to ensure that the code is written in a way that is easily testable and that all required functionality is covered by tests.

JUnit tests can be run as part of a continuous integration pipeline, where tests are automatically run every time changes are made to the code. This helps to catch any issues as soon as they are introduced, reducing the need for manual testing and making it easier to ensure that the code is always in a releasable state.

To run, use the following command:
```bash
mvn clean test
```


## Spotbugs 

SpotBugs is a static code analysis tool for Java that detects potential bugs in your code. It is an open-source tool that can be used as a standalone application or integrated into development tools such as Eclipse, IntelliJ, and Gradle.

SpotBugs performs an analysis of the bytecode generated from your Java source code and reports on any potential problems or issues that it finds. This includes things like null pointer exceptions, resource leaks, misused collections, and other common bugs.

The tool uses data flow analysis to examine the behavior of the code and detect issues that might not be immediately obvious from just reading the source code. SpotBugs is able to identify a wide range of issues and can be customized to meet the needs of your specific project.

Using SpotBugs can help to improve the quality and reliability of your code by catching potential bugs early in the development process. This can save time and effort in the long run by reducing the need for debugging and fixing issues later in the development cycle. SpotBugs can also help to ensure that your code is secure by identifying potential security vulnerabilities.

Use the following command:

```bash
mvn spotbugs:gui 
```

For more info see 
https://spotbugs.readthedocs.io/en/latest/maven.html

SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


## Checkstyle 

Checkstyle is a development tool for checking Java source code against a set of coding standards. It is an open-source tool that can be integrated into various integrated development environments (IDEs), such as Eclipse and IntelliJ, as well as build tools like Maven and Gradle.

Checkstyle performs static code analysis, which means it examines the source code without executing it, and reports on any issues or violations of the coding standards defined in its configuration. This includes issues like code style, code indentation, naming conventions, code structure, and many others.

By using Checkstyle, developers can ensure that their code adheres to a consistent style and follows best practices, making it easier for other developers to read and maintain. It can also help to identify potential issues before the code is actually run, reducing the risk of runtime errors or unexpected behavior.

Checkstyle is highly configurable and can be customized to fit the needs of your team or organization. It supports a wide range of coding standards and can be integrated with other tools, such as code coverage and automated testing tools, to create a comprehensive and automated software development process.

The following command will generate a report in HTML format that you can open in a web browser. 

```bash
mvn checkstyle:checkstyle
```

The HTML page will be found at the following location:
`target/site/checkstyle.html`




