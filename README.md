# OpenAPI Generator Showcase

This repository showcases the usage of the OpenAPI Generator with different configurations and libraries for generating Java/Spring code from an OpenAPI specification.

## Branches

*   **`main`**:  Uses the `spring` generator to produce a complete Spring Boot application (model, service interfaces, and controller stubs).  Represents a standard Spring Boot approach.


*   **`webclient`**: Uses the `java` generator with the `library` option set to `webclient`.  This generates model classes and API clients using Spring's `WebClient`. Focuses on the client-side. In this approach, you would have to implement the service interfaces using the generated WebClient clients.


*   **`feignclient`**: Uses the `spring` generator with the `library` option set to `spring-cloud`. This generates code compatible with Spring Cloud OpenFeign, providing a declarative REST client. Here you'll get a working FeignClient implementation for the API. You would still need to implement the service interfaces, but the FeignClient will handle the HTTP calls for you.

## Generating Code

The project uses a simple OpenAPI definition located in the `resources` directory: `Customer.json`

**General Instructions:**

1.  **Checkout the desired branch:**  e.g., `git checkout webclient`
2. Run the following command to generate the code:

    ```bash
   mvn clean install
    ```
3.  The generated code will be located in the `target/generated-sources/src/...` based on the configuration.